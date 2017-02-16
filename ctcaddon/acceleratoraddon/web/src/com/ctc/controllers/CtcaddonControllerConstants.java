/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE or an SAP affiliate company.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package com.ctc.controllers;

import com.ctc.constants.CtcaddonConstants;


/**
 */
public interface CtcaddonControllerConstants
{

	String ADDON_PREFIX = "addon:/" + CtcaddonConstants.EXTENSIONNAME + "/";

	interface Pages
	{
		String SEARCH_RESULT = "pages/searchResultPage";
	}
}