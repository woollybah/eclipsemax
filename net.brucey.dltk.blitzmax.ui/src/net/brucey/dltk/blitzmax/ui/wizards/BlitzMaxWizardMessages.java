/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package net.brucey.dltk.blitzmax.ui.wizards;

import org.eclipse.osgi.util.NLS;

public class BlitzMaxWizardMessages extends NLS {

	private static final String BUNDLE_NAME = "net.brucey.dltk.blitzmax.ui.wizards.BlitzMaxWizardMessages";//$NON-NLS-1$

	private BlitzMaxWizardMessages() {
	}

	public static String ProjectCreationWizard_title;
	
	public static String ProjectCreationWizardFirstPage_title;
	public static String ProjectCreationWizardFirstPage_description;


	static {
		NLS.initializeMessages(BUNDLE_NAME, BlitzMaxWizardMessages.class);
	}
}