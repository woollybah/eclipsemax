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
import net.brucey.dltk.blitzmax.launching.BlitzMaxLaunchConfigurationConstants;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.dltk.core.PreferencesLookupDelegate;
import org.eclipse.dltk.debug.core.DLTKDebugPreferenceConstants;
import org.eclipse.dltk.debug.ui.launchConfigurations.MainLaunchConfigurationTab;
import org.eclipse.dltk.internal.launching.LaunchConfigurationUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

/**
 * Main launch configuration tab for ruby scripts
 */
public class BlitzMaxMainLaunchConfigurationTab extends
    MainLaunchConfigurationTab {

  private Group groupBuildEnvironment;
  private Button radioButtonGui;
  private Button radioButtonConsole;
  private String buildEnvironment;

  private Group groupBuildMode;
  private Button radioButtonQuick;
  private Button radioButtonFull;
  private String buildMode;

  private Group groupThreadingModel;
  private Button radioButtonSingleThreaded;
  private Button radioButtonMultiThreaded;
  private String threadingModel;

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

  @Override
  protected void createCustomSections(Composite parent) {
    super.createCustomSections(parent);
    createBuildEnvironmentGroup(parent);
    createBuildModeGroup(parent);
    createThreadingModelGroup(parent);
  }

  private void createBuildEnvironmentGroup(Composite parent) {
    groupBuildEnvironment = new Group(parent, SWT.NONE);
    groupBuildEnvironment.setText("Build Environment");
    GridData gd = new GridData(GridData.FILL_HORIZONTAL);
    groupBuildEnvironment.setLayoutData(gd);
    GridLayout layout = new GridLayout();
    layout.numColumns = 1;
    groupBuildEnvironment.setLayout(layout);
    radioButtonGui = createRadioButton(groupBuildEnvironment, "GUI");
    radioButtonConsole = createRadioButton(groupBuildEnvironment, "Console");
    radioButtonGui.addSelectionListener(getWidgetListener());
    radioButtonConsole.addSelectionListener(getWidgetListener());
    radioButtonGui.addSelectionListener(new MyListener());
    radioButtonConsole.addSelectionListener(new MyListener());
  }

  private void createBuildModeGroup(Composite parent) {
    groupBuildMode = new Group(parent, SWT.NONE);
    groupBuildMode.setText("Build Mode");
    GridData gd = new GridData(GridData.FILL_HORIZONTAL);
    groupBuildMode.setLayoutData(gd);
    GridLayout layout = new GridLayout();
    layout.numColumns = 1;
    groupBuildMode.setLayout(layout);
    radioButtonQuick = createRadioButton(groupBuildMode, "Quick");
    radioButtonFull = createRadioButton(groupBuildMode, "Full");
    radioButtonQuick.addSelectionListener(getWidgetListener());
    radioButtonFull.addSelectionListener(getWidgetListener());
    radioButtonQuick.addSelectionListener(new MyListener());
    radioButtonFull.addSelectionListener(new MyListener());
  }

  private void createThreadingModelGroup(Composite parent) {
    groupThreadingModel = new Group(parent, SWT.NONE);
    groupThreadingModel.setText("Threading Model");
    GridData gd = new GridData(GridData.FILL_HORIZONTAL);
    groupThreadingModel.setLayoutData(gd);
    GridLayout layout = new GridLayout();
    layout.numColumns = 1;
    groupThreadingModel.setLayout(layout);
    radioButtonSingleThreaded = createRadioButton(groupThreadingModel,
        "Single-threaded");
    radioButtonMultiThreaded = createRadioButton(groupThreadingModel,
        "Multi-threaded");
    radioButtonSingleThreaded.addSelectionListener(getWidgetListener());
    radioButtonMultiThreaded.addSelectionListener(getWidgetListener());
    radioButtonSingleThreaded.addSelectionListener(new MyListener());
    radioButtonMultiThreaded.addSelectionListener(new MyListener());
  }

  public String getBuildEnvironment() {
    return buildEnvironment;
  }

  public String getBuildMode() {
    return buildMode;
  }

  public String getThreadingModel() {
    return threadingModel;
  }

  @Override
  protected void doPerformApply(ILaunchConfigurationWorkingCopy config) {
    config.setAttribute(
        BlitzMaxLaunchConfigurationConstants.ATTR_BUILD_ENVIRONMENT,
        getBuildEnvironment());
    config.setAttribute(BlitzMaxLaunchConfigurationConstants.ATTR_BUILD_MODE,
        getBuildMode());
    config.setAttribute(
        BlitzMaxLaunchConfigurationConstants.ATTR_GARBAGE_COLLECTOR,
        getThreadingModel());
    super.doPerformApply(config);
  }

  @Override
  protected void doInitializeForm(ILaunchConfiguration config) {
    buildEnvironment = LaunchConfigurationUtils.getString(config,
        BlitzMaxLaunchConfigurationConstants.ATTR_BUILD_ENVIRONMENT,
        BlitzMaxLaunchConfigurationConstants.VAL_BUILD_ENVIRONMENT_GUI);
    if (buildEnvironment
        .equals(BlitzMaxLaunchConfigurationConstants.VAL_BUILD_ENVIRONMENT_GUI)) {
      radioButtonGui.setSelection(true);
    } else {
      radioButtonConsole.setSelection(true);
    }

    buildMode = LaunchConfigurationUtils.getString(config,
        BlitzMaxLaunchConfigurationConstants.ATTR_BUILD_MODE,
        BlitzMaxLaunchConfigurationConstants.VAL_BUILD_MODE_QUICK);
    if (buildMode
        .equals(BlitzMaxLaunchConfigurationConstants.VAL_BUILD_MODE_QUICK)) {
      radioButtonQuick.setSelection(true);
    } else {
      radioButtonFull.setSelection(true);
    }

    threadingModel = LaunchConfigurationUtils.getString(config,
        BlitzMaxLaunchConfigurationConstants.ATTR_GARBAGE_COLLECTOR,
        BlitzMaxLaunchConfigurationConstants.VAL_GARBAGE_COLLECTOR_NONTHREADED);
    if (threadingModel
        .equals(BlitzMaxLaunchConfigurationConstants.VAL_GARBAGE_COLLECTOR_NONTHREADED)) {
      radioButtonSingleThreaded.setSelection(true);
    } else {
      radioButtonMultiThreaded.setSelection(true);
    }

    super.doInitializeForm(config);
  }

  private class MyListener implements SelectionListener {
    public void widgetDefaultSelected(SelectionEvent e) {
    }

    public void widgetSelected(SelectionEvent e) {
      if (e.widget == radioButtonGui) {
        buildEnvironment = BlitzMaxLaunchConfigurationConstants.VAL_BUILD_ENVIRONMENT_GUI;
      } else if (e.widget == radioButtonConsole) {
        buildEnvironment = BlitzMaxLaunchConfigurationConstants.VAL_BUILD_ENVIRONMENT_CONSOLE;
      } else if (e.widget == radioButtonQuick) {
        buildMode = BlitzMaxLaunchConfigurationConstants.VAL_BUILD_MODE_QUICK;
      } else if (e.widget == radioButtonFull) {
        buildMode = BlitzMaxLaunchConfigurationConstants.VAL_BUILD_MODE_FULL;
      } else if (e.widget == radioButtonSingleThreaded) {
        threadingModel = BlitzMaxLaunchConfigurationConstants.VAL_GARBAGE_COLLECTOR_NONTHREADED;
      } else if (e.widget == radioButtonMultiThreaded) {
        threadingModel = BlitzMaxLaunchConfigurationConstants.VAL_GARBAGE_COLLECTOR_THREADED;
      }
    }
  }
}
