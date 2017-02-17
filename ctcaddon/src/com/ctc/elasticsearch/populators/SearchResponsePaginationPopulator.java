package com.ctc.elasticsearch.populators;

import de.hybris.platform.commerceservices.search.pagedata.PaginationData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;
import de.hybris.platform.converters.Populator;

import com.ctc.essearch.ESSearchResponse;


/**
 */
public class SearchResponsePaginationPopulator<ITEM> implements Populator<ESSearchResponse, SearchPageData<ITEM>>
{
	@Override
	public void populate(final ESSearchResponse source, final SearchPageData<ITEM> target)
	{
		if (source.getSearchResponse() != null && source.getSearchResponse().getHits() != null)
		{
			final PaginationData paginationData = createPaginationData();
			paginationData.setTotalNumberOfResults(source.getSearchResponse().getHits().getTotal());
			paginationData.setPageSize(source.getSearchQuery().getPageSize());
			paginationData.setCurrentPage(source.getSearchQuery().getOffset());
			paginationData.setNumberOfPages((int) Math.ceil((double) paginationData.getTotalNumberOfResults()
					/ (double) paginationData.getPageSize()));

			target.setPagination(paginationData);
		}
	}

	protected PaginationData createPaginationData()
	{
		return new PaginationData();
	}
}
