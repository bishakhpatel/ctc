/**
 *
 */
package com.ctc.elasticsearch.service;

import de.hybris.platform.commerceservices.search.solrfacetsearch.data.SolrSearchRequest;

import com.ctc.essearch.ESSearchResponse;


/**
 *
 *
 */
public interface ESSearchRestService
{
	ESSearchResponse search(SolrSearchRequest searchRequest);
}
