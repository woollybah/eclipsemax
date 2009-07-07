package net.brucey.dltk.blitzmax.debug.ui.compilers;

import net.brucey.dltk.blitzmax.core.BlitzMaxNature;

import org.eclipse.dltk.debug.ui.launchConfigurations.IMainLaunchConfigurationTabListenerManager;
import org.eclipse.dltk.internal.debug.ui.interpreters.AbstractInterpreterComboBlock;

public class BlitzMaxCompilerComboBlock extends AbstractInterpreterComboBlock {

  public BlitzMaxCompilerComboBlock(
      IMainLaunchConfigurationTabListenerManager tab) {
    super(tab);
    setTitle("BlitzMax Compiler:");

  }

  @Override
  protected String getCurrentLanguageNature() {
    return BlitzMaxNature.BLITZMAX_NATURE;
  }

  @Override
  protected void showInterpreterPreferencePage() {
    showPrefPage(BlitzMaxCompilerPreferencePage.PAGE_ID);
  }

}
