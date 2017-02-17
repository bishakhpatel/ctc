/**
 *
 */
package com.ctc.elasticsearch.populators;

import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.solrfacetsearch.search.FieldNameTranslator.FieldInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ctc.essearch.ESSearchResponse;
import com.ctc.essearch.ElasticSearchResponse;
import com.ctc.essearch.Hit;


/**
 *
 *
 */
public class ESResultValueDataPopulator implements Populator<ESSearchResponse, List<SearchResultValueData>>
{

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final ESSearchResponse source, final List<SearchResultValueData> target) throws ConversionException
	{

		final Map fieldInfos = source.getFieldInfosMapping().getInvertedFieldInfos();
		final ElasticSearchResponse searchResult = source.getSearchResponse();
		if (searchResult.getHits() != null && searchResult.getHits().getTotal() > 0)
		{
			for (final Hit hit : searchResult.getHits().getHits())
			{
				target.add(convertSource(hit, fieldInfos));
			}
		}

	}

	protected SearchResultValueData convertSource(final Hit hit, final Map fieldInfos)
	{

		final SearchResultValueData searchResultValueData = new SearchResultValueData();
		final Map map = new HashMap<>();
		for (final Map.Entry<String, Object> entry : hit.get_source().entrySet())
		{
			map.put(resolveFieldName(entry.getKey(), fieldInfos), entry.getValue());
		}
		searchResultValueData.setValues(map);

		return searchResultValueData;
	}


	protected String resolveFieldName(final String fieldName, final Map<String, FieldInfo> fieldInfos)
	{
		final FieldInfo fieldInfo = fieldInfos.get(fieldName);
		return fieldInfo != null ? fieldInfo.getFieldName() : fieldName;
	}

}
