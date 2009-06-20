/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package net.brucey.dltk.blitzmax.ui.wizards;

import net.brucey.dltk.blitzmax.core.BlitzMaxNature;
import net.brucey.dltk.blitzmax.ui.BlitzMaxImages;
import net.brucey.dltk.blitzmax.ui.BlitzMaxUIPlugin;
import net.brucey.dltk.blitzmax.ui.preferences.BlitzMaxBuildPathsBlock;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.ui.DLTKUIPlugin;
import org.eclipse.dltk.ui.util.BusyIndicatorRunnableContext;
import org.eclipse.dltk.ui.util.IStatusChangeListener;
import org.eclipse.dltk.ui.wizards.BuildpathsBlock;
import org.eclipse.dltk.ui.wizards.NewElementWizard;
import org.eclipse.dltk.ui.wizards.ProjectWizardFirstPage;
import org.eclipse.dltk.ui.wizards.ProjectWizardSecondPage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

public class BlitzMaxProjectCreationWizard extends NewElementWizard implements
    INewWizard, IExecutableExtension {
	private ProjectWizardFirstPage fFirstPage;
	private ProjectWizardSecondPage fSecondPage;
	private IConfigurationElement fConfigElement;

	public BlitzMaxProjectCreationWizard() {
		setDefaultPageImageDescriptor(BlitzMaxImages.DESC_WIZBAN_PROJECT_CREATION);
		setDialogSettings(DLTKUIPlugin.getDefault().getDialogSettings());
		setWindowTitle(BlitzMaxWizardMessages.ProjectCreationWizard_title);
	}

	public void addPages() {
		super.addPages();
		fFirstPage = new ProjectWizardFirstPage() {

			final class BlitzMaxInterpreterGroup extends AbstractInterpreterGroup {

				public BlitzMaxInterpreterGroup(Composite composite) {
					super(composite);
				}

				protected String getCurrentLanguageNature() {
					return BlitzMaxNature.BLITZMAX_NATURE;
				}

				protected String getIntereprtersPreferencePageId() {
					return "net.brucey.dltk.blitzmax.preferences.interpreters"; //$NON-NLS-1$
				}

				protected boolean isTargetEnvironmentAllowed() {
					return false;
				}
			};

			protected IInterpreterGroup createInterpreterGroup(Composite parent) {
				return new BlitzMaxInterpreterGroup(parent);
			}

			protected boolean interpeterRequired() {
				// TODO Auto-generated method stub
				return false;
			}
		};
		fFirstPage
		    .setTitle(BlitzMaxWizardMessages.ProjectCreationWizardFirstPage_title);
		fFirstPage
		    .setDescription(BlitzMaxWizardMessages.ProjectCreationWizardFirstPage_description);
		addPage(fFirstPage);
		fSecondPage = new ProjectWizardSecondPage(fFirstPage) {
			protected BuildpathsBlock createBuildpathBlock(
			    IStatusChangeListener listener) {
				BlitzMaxBuildPathsBlock block = new BlitzMaxBuildPathsBlock(new BusyIndicatorRunnableContext(),
				    listener, 0, useNewSourcePage(), null);
				
				block.setBaseSourceFolder();
				
				return block;
			}

			protected String getScriptNature() {
				return BlitzMaxNature.BLITZMAX_NATURE;
			}

			protected IPreferenceStore getPreferenceStore() {
				return BlitzMaxUIPlugin.getDefault().getPreferenceStore();
			}
		};
		addPage(fSecondPage);
	}

	protected void finishPage(IProgressMonitor monitor)
	    throws InterruptedException, CoreException {
		fSecondPage.performFinish(monitor); // use the full progress monitor
	}

	public boolean performFinish() {
		boolean res = super.performFinish();
		if (res) {
			BasicNewProjectResourceWizard.updatePerspective(fConfigElement);
			selectAndReveal(fSecondPage.getScriptProject().getProject());
		}
		return res;
	}

	/*
	 * Stores the configuration element for the wizard. The config element will be
	 * used in <code>performFinish</code> to set the result perspective.
	 */
	public void setInitializationData(IConfigurationElement cfig,
	    String propertyName, Object data) {
		fConfigElement = cfig;
	}

	public boolean performCancel() {
		fSecondPage.performCancel();
		return super.performCancel();
	}

	public IModelElement getCreatedElement() {
		return DLTKCore.create(fFirstPage.getProjectHandle());
	}
}
