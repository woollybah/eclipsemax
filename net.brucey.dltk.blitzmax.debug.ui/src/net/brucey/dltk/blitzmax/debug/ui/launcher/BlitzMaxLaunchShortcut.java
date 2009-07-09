package net.brucey.dltk.blitzmax.debug.ui.launcher;

import net.brucey.dltk.blitzmax.core.BlitzMaxNature;
import net.brucey.dltk.blitzmax.launching.BlitzMaxLaunchConfigurationConstants;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.dltk.internal.debug.ui.launcher.AbstractScriptLaunchShortcut;
import org.eclipse.dltk.launching.ScriptLaunchConfigurationConstants;

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

  @Override
  protected ILaunchConfiguration createConfiguration(IResource script) {
    ILaunchConfiguration config = null;
    ILaunchConfigurationWorkingCopy wc = null;
    try {
      ILaunchConfigurationType configType = getConfigurationType();
      wc = configType.newInstance(null, getLaunchManager()
          .generateUniqueLaunchConfigurationNameFrom(script.getName()));
      wc.setAttribute(ScriptLaunchConfigurationConstants.ATTR_SCRIPT_NATURE,
          getNatureId());
      wc.setAttribute(ScriptLaunchConfigurationConstants.ATTR_PROJECT_NAME,
          script.getProject().getName());
      wc.setAttribute(ScriptLaunchConfigurationConstants.ATTR_MAIN_SCRIPT_NAME,
          script.getProjectRelativePath().toPortableString());
      if (isConsole()) {
        wc.setAttribute(
            BlitzMaxLaunchConfigurationConstants.ATTR_BUILD_ENVIRONMENT,
            BlitzMaxLaunchConfigurationConstants.VAL_BUILD_ENVIRONMENT_CONSOLE);
      } else {
        wc.setAttribute(
            BlitzMaxLaunchConfigurationConstants.ATTR_BUILD_ENVIRONMENT,
            BlitzMaxLaunchConfigurationConstants.VAL_BUILD_ENVIRONMENT_GUI);
      }

      wc.setMappedResources(new IResource[] { script });
      config = wc.doSave();
    } catch (CoreException exception) {
      exception.printStackTrace();
    }
    return config;
  }

  protected boolean isConsole() {
    return false;
  }
}
