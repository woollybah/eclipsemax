/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 ******************************************************************************/
package net.brucey.dltk.blitzmax.debug.ui.launchConfigurations;

import net.brucey.dltk.blitzmax.core.BlitzMaxNature;
import net.brucey.dltk.blitzmax.debug.BlitzMaxDebugPlugin;

import org.eclipse.dltk.core.PreferencesLookupDelegate;
import org.eclipse.dltk.debug.core.DLTKDebugPreferenceConstants;
import org.eclipse.dltk.debug.ui.launchConfigurations.MainLaunchConfigurationTab;

/**
 * Main launch configuration tab for ruby scripts
 */
public class BlitzMaxMainLaunchConfigurationTab extends
    MainLaunchConfigurationTab {

  public BlitzMaxMainLaunchConfigurationTab(String mode) {
    super(mode);
  }

  @Override
  protected boolean canSelectDebugConsoleType() {
    return true;
  }

  /*
   * @see
   * org.eclipse.dltk.debug.ui.launchConfigurations.ScriptLaunchConfigurationTab
   * #
   * breakOnFirstLinePrefEnabled(org.eclipse.dltk.core.PreferencesLookupDelegate
   * )
   */
  @Override
  protected boolean breakOnFirstLinePrefEnabled(
      PreferencesLookupDelegate delegate) {
    return delegate.getBoolean(BlitzMaxDebugPlugin.PLUGIN_ID,
        DLTKDebugPreferenceConstants.PREF_DBGP_BREAK_ON_FIRST_LINE);
  }

  /*
   * @see
   * org.eclipse.dltk.debug.ui.launchConfigurations.ScriptLaunchConfigurationTab
   * #dbpgLoggingPrefEnabled(org.eclipse.dltk.core.PreferencesLookupDelegate)
   */
  @Override
  protected boolean dbpgLoggingPrefEnabled(PreferencesLookupDelegate delegate) {
    return delegate.getBoolean(BlitzMaxDebugPlugin.PLUGIN_ID,
        DLTKDebugPreferenceConstants.PREF_DBGP_ENABLE_LOGGING);
  }

  /*
   * @see
   * org.eclipse.dltk.debug.ui.launchConfigurations.ScriptLaunchConfigurationTab
   * #getNatureID()
   */
  @Override
  protected String getNatureID() {
    return BlitzMaxNature.BLITZMAX_NATURE;
  }

}
