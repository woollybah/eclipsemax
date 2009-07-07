package net.brucey.dltk.blitzmax.debug.ui.launcher;

import net.brucey.dltk.blitzmax.core.BlitzMaxNature;
import net.brucey.dltk.blitzmax.launching.BlitzMaxLaunchConfigurationConstants;

import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.dltk.internal.debug.ui.launcher.AbstractScriptLaunchShortcut;

public class BlitzMaxLaunchShortcut extends AbstractScriptLaunchShortcut {
  @Override
  protected ILaunchConfigurationType getConfigurationType() {
    return getLaunchManager().getLaunchConfigurationType(
        BlitzMaxLaunchConfigurationConstants.ID_BLITZMAX_APP);
  }

  @Override
  protected String getNatureId() {
    return BlitzMaxNature.BLITZMAX_NATURE;
  }
}
