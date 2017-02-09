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
package com.ctc.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.ctc.fulfilmentprocess.constants.CtcFulfilmentProcessConstants;

@SuppressWarnings("PMD")
public class CtcFulfilmentProcessManager extends GeneratedCtcFulfilmentProcessManager
{
	public static final CtcFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (CtcFulfilmentProcessManager) em.getExtension(CtcFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
