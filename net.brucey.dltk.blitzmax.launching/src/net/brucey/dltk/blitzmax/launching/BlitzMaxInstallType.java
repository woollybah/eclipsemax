package net.brucey.dltk.blitzmax.launching;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import net.brucey.dltk.blitzmax.core.BlitzMaxNature;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.dltk.core.environment.IDeployment;
import org.eclipse.dltk.core.environment.IEnvironment;
import org.eclipse.dltk.core.environment.IFileHandle;
import org.eclipse.dltk.internal.launching.AbstractInterpreterInstallType;
import org.eclipse.dltk.launching.EnvironmentVariable;
import org.eclipse.dltk.launching.IInterpreterInstall;

public class BlitzMaxInstallType extends AbstractInterpreterInstallType {

  private static final String[] INTERPRETER_NAMES = { "bmk", "bmk.exe" };

  @Override
  protected IPath createPathFile(IDeployment deployment) throws IOException {
    return null;
  }

  @Override
  protected ILookupRunnable createLookupRunnable(
      final IFileHandle installLocation, final List locations,
      final EnvironmentVariable[] variables) {
    return new ILookupRunnable() {
      public void run(IProgressMonitor monitor) {
        // try {
        IEnvironment env = installLocation.getEnvironment();

        IFileHandle binFolder = installLocation.getParent();

        // This is the "bin" folder
        if ("bin".equals(binFolder.getName())) {

          // this is usually "BlitzMax", but it doesn't really matter,
          // however, we must have a "mod" child folder
          IFileHandle blitzmaxMainFolder = binFolder.getParent();

          IFileHandle modFolder = blitzmaxMainFolder.getChild("mod");

          List<String> paths = new ArrayList<String>();

          for (IFileHandle mod : modFolder.getChildren()) {

            if (mod.getPath().lastSegment().endsWith(".mod")) {
              paths.add(mod.toOSString());
            }

          }

          fillLocationsExceptOne(env, locations, paths.toArray(new String[0]),
              modFolder.getFullPath());

        }
      }
    };
  }

  @Override
  protected IInterpreterInstall doCreateInterpreterInstall(String id) {
    return new BlitzMaxInstall(this, id);
  }

  @Override
  protected ILog getLog() {
    return BlitzMaxLaunchingPlugin.getDefault().getLog();
  }

  @Override
  protected String getPluginId() {
    return BlitzMaxLaunchingPlugin.PLUGIN_ID;
  }

  @Override
  protected String[] getPossibleInterpreterNames() {
    return INTERPRETER_NAMES;
  }

  public String getName() {
    return "BlitzMax";
  }

  public String getNatureId() {
    return BlitzMaxNature.BLITZMAX_NATURE;
  }

}
