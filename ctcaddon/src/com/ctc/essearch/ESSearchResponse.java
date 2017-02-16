/**
 *
 */
package com.ctc.essearch;

import de.hybris.platform.commerceservices.search.solrfacetsearch.data.SolrSearchRequest;
import de.hybris.platform.solrfacetsearch.search.FieldNameTranslator.FieldInfosMapping;
import de.hybris.platform.solrfacetsearch.search.SearchQuery;




/**
 *
 *
 */
public class ESSearchResponse
{
	private SolrSearchRequest solrSearchRequest;

	private ElasticSearchResponse searchResponse;

	private FieldInfosMapping fieldInfosMapping;

	/**
	 * @return the searchQuery
	 */
	public SearchQuery getSearchQuery()
	{
		return (SearchQuery) solrSearchRequest.getSearchQuery();
	}


	/**
	 * @return the searchResponse
	 */
	public ElasticSearchResponse getSearchResponse()
	{
		return searchResponse;
	}

	/**
	 * @param searchResponse
	 *           the searchResponse to set
	 */
	public void setSearchResponse(final ElasticSearchResponse searchResponse)
	{
		this.searchResponse = searchResponse;
	}

	/**
	 * @return the fieldInfosMapping
	 */
	public FieldInfosMapping getFieldInfosMapping()
	{
		return fieldInfosMapping;
	}

	/**
	 * @param fieldInfosMapping
	 *           the fieldInfosMapping to set
	 */
	public void setFieldInfosMapping(final FieldInfosMapping fieldInfosMapping)
	{
		this.fieldInfosMapping = fieldInfosMapping;
	}

	/**
	 * @return the solrSearchRequest
	 */
	public SolrSearchRequest getSolrSearchRequest()
	{
		return solrSearchRequest;
	}

	/**
	 * @param solrSearchRequest
	 *           the solrSearchRequest to set
	 */
	public void setSolrSearchRequest(final SolrSearchRequest solrSearchRequest)
	{
		this.solrSearchRequest = solrSearchRequest;
	}
}
