package net.brucey.dltk.blitzmax.debug.ui.launchConfigurations;

import net.brucey.dltk.blitzmax.debug.ui.compilers.BlitzMaxCompilerTab;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.EnvironmentTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.dltk.debug.ui.launchConfigurations.ScriptArgumentsTab;

public class BlitzMaxTabGroup extends AbstractLaunchConfigurationTabGroup {
  public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
    BlitzMaxMainLaunchConfigurationTab main = new BlitzMaxMainLaunchConfigurationTab(
        mode);
    ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] { main,
        new ScriptArgumentsTab(), new BlitzMaxCompilerTab(),
        new EnvironmentTab(), new CommonTab() };

    setTabs(tabs);
  }
}
