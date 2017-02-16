package com.ctc.elasticsearch.populators;

import de.hybris.platform.commerceservices.search.facetdata.FacetSearchPageData;
import de.hybris.platform.commerceservices.search.solrfacetsearch.data.SolrSearchQueryData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import com.ctc.essearch.ESSearchResponse;


public class SearchResponseResultsPopulator<STATE, RESULT> implements
		Populator<ESSearchResponse, FacetSearchPageData<STATE, RESULT>>
{


	private Converter<SolrSearchQueryData, STATE> searchStateConverter;
	private Converter<ESSearchResponse, List<RESULT>> esResultConverter;

	@Override
	public void populate(final ESSearchResponse source, final FacetSearchPageData<STATE, RESULT> target)
	{

		if (source.getSearchResponse() != null)
		{
			target.setResults(getEsResultConverter().convert(source));
		}
		target.setCurrentQuery(getSearchStateConverter().convert(source.getSolrSearchRequest().getSearchQueryData()));
	}




	/**
	 * @return the searchStateConverter
	 */
	public Converter<SolrSearchQueryData, STATE> getSearchStateConverter()
	{
		return searchStateConverter;
	}


	/**
	 * @param searchStateConverter
	 *           the searchStateConverter to set
	 */
	public void setSearchStateConverter(final Converter<SolrSearchQueryData, STATE> searchStateConverter)
	{
		this.searchStateConverter = searchStateConverter;
	}

	/**
	 * @return the esResultConverter
	 */
	public Converter<ESSearchResponse, List<RESULT>> getEsResultConverter()
	{
		return esResultConverter;
	}

	/**
	 * @param esResultConverter
	 *           the esResultConverter to set
	 */
	public void setEsResultConverter(final Converter<ESSearchResponse, List<RESULT>> esResultConverter)
	{
		this.esResultConverter = esResultConverter;
	}


}
