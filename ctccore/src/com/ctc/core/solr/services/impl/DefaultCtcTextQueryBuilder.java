/**
 *
 */
package com.ctc.core.solr.services.impl;

import de.hybris.platform.commerceservices.search.solrfacetsearch.querybuilder.impl.AbstractFreeTextQueryBuilder;
import de.hybris.platform.commerceservices.search.solrfacetsearch.querybuilder.impl.DefaultFreeTextQueryBuilder;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.search.SearchQuery;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;


/**
 * @author 426166
 *
 */
public class DefaultCtcTextQueryBuilder extends DefaultFreeTextQueryBuilder
{
	private static final Logger LOG = Logger.getLogger(AbstractFreeTextQueryBuilder.class);

	private String propertyName;
	private int boost;

	@Override
	protected String getPropertyName()
	{
		return propertyName;
	}

	@Override
	@Required
	public void setPropertyName(final String propertyName)
	{
		this.propertyName = propertyName;
	}

	@Override
	protected int getBoost()
	{
		return boost;
	}

	@Override
	@Required
	public void setBoost(final int boost)
	{
		this.boost = boost;
	}


	@Override
	protected void addFreeTextQuery(final SearchQuery searchQuery, final IndexedProperty indexedProperty, final String value,
			final double boost)
	{
		final String field = indexedProperty.getName();
		if (!indexedProperty.isFacet())
		{
			if ("text".equalsIgnoreCase(indexedProperty.getType()))
			{
				addFreeTextQuery(searchQuery, field, value.toLowerCase(), "", boost);
				addFreeTextQuery(searchQuery, field, value.toLowerCase(), "*", boost / 2.0d);
				addFreeTextQuery(searchQuery, field, value.toLowerCase(), "~", boost / 4.0d);
			}
			else
			{
				addFreeTextQuery(searchQuery, field, value.toUpperCase(), "", boost);
				addFreeTextQuery(searchQuery, field, value.toUpperCase(), "*", boost / 2.0d);
			}
		}
		else
		{
			LOG.warn("Not searching " + indexedProperty
					+ ". Free text search not available in facet property. Configure an additional text property for searching.");
		}
	}
}
