/**
 *
 */
package com.ctc.elasticsearch.service.impl;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.solrfacetsearch.data.SolrSearchRequest;
import de.hybris.platform.solrfacetsearch.config.FacetSearchConfig;
import de.hybris.platform.solrfacetsearch.config.IndexedType;
import de.hybris.platform.solrfacetsearch.model.SolrIndexModel;
import de.hybris.platform.solrfacetsearch.search.FacetSearchException;
import de.hybris.platform.solrfacetsearch.search.FieldNameTranslator;
import de.hybris.platform.solrfacetsearch.search.FieldNameTranslator.FieldInfo;
import de.hybris.platform.solrfacetsearch.search.FieldNameTranslator.FieldInfosMapping;
import de.hybris.platform.solrfacetsearch.search.RawQuery;
import de.hybris.platform.solrfacetsearch.search.SearchQuery;
import de.hybris.platform.solrfacetsearch.search.context.FacetSearchContext;
import de.hybris.platform.solrfacetsearch.search.context.FacetSearchContextFactory;
import de.hybris.platform.solrfacetsearch.solr.Index;
import de.hybris.platform.solrfacetsearch.solr.SolrIndexService;
import de.hybris.platform.solrfacetsearch.solr.SolrSearchProvider;
import de.hybris.platform.solrfacetsearch.solr.SolrSearchProviderFactory;
import de.hybris.platform.solrfacetsearch.solr.exceptions.SolrServiceException;
import de.hybris.platform.util.Config;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.ctc.elasticsearch.service.ESSearchRestService;
import com.ctc.essearch.ESSearchResponse;
import com.ctc.essearch.ElasticSearchResponse;


/**
 *
 *
 */
public class ESSearchRestServiceImpl implements ESSearchRestService
{
	private static final Logger LOG = Logger.getLogger(ESSearchRestServiceImpl.class);
	private SolrIndexService solrIndexService;
	private SolrSearchProviderFactory solrSearchProviderFactory;
	private FacetSearchContextFactory<FacetSearchContext> facetSearchContextFactory;
	private FieldNameTranslator fieldNameTranslator;
	private RestTemplate restTemplate;
	private final String LOCALHOST = "http://localhost:9200";
	private final String SEPARATOR = "/";
	private final String URI_PART1 = "_search";
	private final String CATALOG_ID = "catalogId";
	private final String CATALOG_VERSION = "catalogVersion";
	private final String REST_CLIENT_URL = "elasticsearch.client.rest.url";
	private final String ES_INDEX = "elasticsearch.index";

	/*
	 * (non-Javadoc)
	 *
	 * @see com.ctc.elasticsearch.service.ESSearchService#search(org.apache.lucene.search.Query)
	 */
	@Override
	public ESSearchResponse search(final SolrSearchRequest searchRequest)
	{
		final ESSearchResponse esSearchResponse = new ESSearchResponse();
		esSearchResponse.setSolrSearchRequest(searchRequest);
		final SearchQuery searchQuery = esSearchResponse.getSearchQuery();

		try
		{
			final FacetSearchConfig facetSearchConfig = searchQuery.getFacetSearchConfig();
			final IndexedType indexedType = searchQuery.getIndexedType();
			final FacetSearchContext context = getFacetSearchContextFactory().createContext(facetSearchConfig, indexedType,
					searchQuery);
			getFacetSearchContextFactory().initializeContext();

			final SolrSearchProvider solrSearchProvider = getSolrSearchProviderFactory().getSearchProvider(facetSearchConfig,
					indexedType);
			final SolrIndexModel activeIndex = getSolrIndexService().getActiveIndex(facetSearchConfig.getName(),
					indexedType.getIdentifier());
			final Index index = solrSearchProvider.resolveIndex(facetSearchConfig, indexedType, activeIndex.getQualifier());

			final FieldInfosMapping fieldInfosMapping = getFieldNameTranslator().getFieldInfos(context);
			esSearchResponse.setFieldInfosMapping(fieldInfosMapping);
			final Map fieldInfos = fieldInfosMapping.getFieldInfos();

			getFacetSearchContextFactory().destroyContext();

			final String reqBody = buildQuery(searchQuery, fieldInfos, searchRequest.getPageableData());
			final URI uri = new URI(Config.getString(REST_CLIENT_URL, LOCALHOST) + SEPARATOR
					+ Config.getString(ES_INDEX, index.getName().toLowerCase()) + SEPARATOR + URI_PART1);
			LOG.info(uri);
			LOG.info(reqBody);
			final HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
			final ResponseEntity<ElasticSearchResponse> searchResponse = getRestTemplate().exchange(
					new RequestEntity<String>(reqBody, headers, HttpMethod.POST, uri), ElasticSearchResponse.class);

			esSearchResponse.setSearchResponse(searchResponse.getBody());
		}
		catch (FacetSearchException | SolrServiceException | RestClientException | URISyntaxException e)
		{
			LOG.error(e);
		}

		return esSearchResponse;
	}

	public String buildQuery(final SearchQuery searchQuery, final Map fieldInfos, final PageableData pagebledata)
	{
		final int pageSize = pagebledata.getPageSize() > 0 ? pagebledata.getPageSize() : 10;
		final StringBuilder query = new StringBuilder("{");
		query.append("\"from\" : ").append(pagebledata.getCurrentPage() * pageSize).append(" , \"size\" : ").append(pageSize)
				.append(", ");

		query.append("\"query\" : { \"query_string\" : { \"query\" : \"(");

		for (final Iterator<RawQuery> it = searchQuery.getRawQueries().iterator(); it.hasNext();)
		{
			final RawQuery rawQuery = it.next();
			final FieldInfo fieldInfo = (FieldInfo) fieldInfos.get(rawQuery.getField());
			query.append("(").append(fieldInfo.getTranslatedFieldName()).append(":(").append(rawQuery.getQuery()).append("))");
			if (it.hasNext())
			{
				query.append(" OR ");
			}
		}
		query.append(") AND (");
		for (final CatalogVersionModel catalogVersion : searchQuery.getCatalogVersions())
		{

			query.append("(").append(CATALOG_ID).append(":").append(catalogVersion.getCatalog().getId()).append(")")
					.append(" AND (").append(CATALOG_VERSION).append(":").append(catalogVersion.getVersion()).append(")");

		}
		query.append(")\" }}}");
		return query.toString();
	}

	/**
	 * @return the restTemplate
	 */
	public RestTemplate getRestTemplate()
	{
		return restTemplate;
	}

	/**
	 * @param restTemplate
	 *           the restTemplate to set
	 */
	public void setRestTemplate(final RestTemplate restTemplate)
	{
		this.restTemplate = restTemplate;
	}

	/**
	 * @return the solrIndexService
	 */
	public SolrIndexService getSolrIndexService()
	{
		return solrIndexService;
	}

	/**
	 * @param solrIndexService
	 *           the solrIndexService to set
	 */
	public void setSolrIndexService(final SolrIndexService solrIndexService)
	{
		this.solrIndexService = solrIndexService;
	}

	/**
	 * @return the solrSearchProviderFactory
	 */
	public SolrSearchProviderFactory getSolrSearchProviderFactory()
	{
		return solrSearchProviderFactory;
	}

	/**
	 * @param solrSearchProviderFactory
	 *           the solrSearchProviderFactory to set
	 */
	public void setSolrSearchProviderFactory(final SolrSearchProviderFactory solrSearchProviderFactory)
	{
		this.solrSearchProviderFactory = solrSearchProviderFactory;
	}

	/**
	 * @return the facetSearchContextFactory
	 */
	public FacetSearchContextFactory<FacetSearchContext> getFacetSearchContextFactory()
	{
		return facetSearchContextFactory;
	}

	/**
	 * @param facetSearchContextFactory
	 *           the facetSearchContextFactory to set
	 */
	public void setFacetSearchContextFactory(final FacetSearchContextFactory<FacetSearchContext> facetSearchContextFactory)
	{
		this.facetSearchContextFactory = facetSearchContextFactory;
	}

	/**
	 * @return the fieldNameTranslator
	 */
	public FieldNameTranslator getFieldNameTranslator()
	{
		return fieldNameTranslator;
	}

	/**
	 * @param fieldNameTranslator
	 *           the fieldNameTranslator to set
	 */
	public void setFieldNameTranslator(final FieldNameTranslator fieldNameTranslator)
	{
		this.fieldNameTranslator = fieldNameTranslator;
	}

}
