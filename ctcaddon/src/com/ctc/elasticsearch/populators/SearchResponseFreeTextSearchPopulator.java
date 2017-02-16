package com.ctc.elasticsearch.populators;


import de.hybris.platform.commerceservices.search.facetdata.ProductSearchPageData;
import de.hybris.platform.converters.Populator;

import com.ctc.essearch.ESSearchResponse;


/**
 */
public class SearchResponseFreeTextSearchPopulator<STATE, ITEM> implements
		Populator<ESSearchResponse, ProductSearchPageData<STATE, ITEM>>
{
	@Override
	public void populate(final ESSearchResponse source, final ProductSearchPageData<STATE, ITEM> target)
	{
		target.setFreeTextSearch(source.getSearchQuery().getUserQuery());
	}
}
