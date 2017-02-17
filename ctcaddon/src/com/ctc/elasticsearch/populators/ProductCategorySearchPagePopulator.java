package com.ctc.elasticsearch.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commerceservices.search.facetdata.ProductCategorySearchPageData;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import org.springframework.beans.factory.annotation.Required;


/**
 */
public class ProductCategorySearchPagePopulator<STATE, RESULT, ITEM extends ProductData, SCAT, CATEGORY> implements
		Populator<ProductCategorySearchPageData<STATE, RESULT, SCAT>, ProductCategorySearchPageData<STATE, ITEM, CATEGORY>>
{
	private Converter<RESULT, ITEM> searchResultProductConverter;



	protected Converter<RESULT, ITEM> getSearchResultProductConverter()
	{
		return searchResultProductConverter;
	}

	@Required
	public void setSearchResultProductConverter(final Converter<RESULT, ITEM> searchResultProductConverter)
	{
		this.searchResultProductConverter = searchResultProductConverter;
	}


	@Override
	public void populate(final ProductCategorySearchPageData<STATE, RESULT, SCAT> source,
			final ProductCategorySearchPageData<STATE, ITEM, CATEGORY> target)
	{
		target.setPagination(source.getPagination());

		if (source.getResults() != null)
		{
			target.setResults(Converters.convertAll(source.getResults(), getSearchResultProductConverter()));
		}

		target.setFreeTextSearch(source.getFreeTextSearch());
		target.setCurrentQuery(source.getCurrentQuery());
	}
}
