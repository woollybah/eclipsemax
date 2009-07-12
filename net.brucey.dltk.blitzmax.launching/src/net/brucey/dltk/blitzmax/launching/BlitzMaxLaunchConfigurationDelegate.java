package net.brucey.dltk.blitzmax.launching;

import java.io.IOException;

import net.brucey.dltk.blitzmax.core.BlitzMaxNature;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.dltk.core.environment.EnvironmentPathUtils;
import org.eclipse.dltk.core.environment.IDeployment;
import org.eclipse.dltk.core.environment.IEnvironment;
import org.eclipse.dltk.launching.AbstractScriptLaunchConfigurationDelegate;
import org.eclipse.dltk.launching.InterpreterConfig;

public class BlitzMaxLaunchConfigurationDelegate extends
    AbstractScriptLaunchConfigurationDelegate {

  @Override
  public String getLanguageId() {
    return BlitzMaxNature.BLITZMAX_NATURE;
  }

  @Override
  protected InterpreterConfig createInterpreterConfig(
      ILaunchConfiguration configuration, ILaunch launch) throws CoreException {

    final InterpreterConfig config = super.createInterpreterConfig(
        configuration, launch);
    if (config != null) {
      config.addInterpreterArg("makeapp"); // we're building an app
      if (launch.getLaunchMode().equals("debug")) {
        config.addInterpreterArg("-d"); // Debug (not release)
      } else {
        config.addInterpreterArg("-r"); // Release (not debug)
      }
      config.addInterpreterArg("-x"); // Execute

      String buildEnvironment = configuration.getAttribute(
          BlitzMaxLaunchConfigurationConstants.ATTR_BUILD_ENVIRONMENT,
          BlitzMaxLaunchConfigurationConstants.VAL_BUILD_ENVIRONMENT_CONSOLE);
      String buildMode = configuration.getAttribute(
          BlitzMaxLaunchConfigurationConstants.ATTR_BUILD_MODE,
          BlitzMaxLaunchConfigurationConstants.VAL_BUILD_MODE_QUICK);
      String garbageCollector = configuration
          .getAttribute(
              BlitzMaxLaunchConfigurationConstants.ATTR_GARBAGE_COLLECTOR,
              BlitzMaxLaunchConfigurationConstants.VAL_GARBAGE_COLLECTOR_NONTHREADED);
      String appStub = configuration.getAttribute(
          BlitzMaxLaunchConfigurationConstants.ATTR_APP_STUB,
          BlitzMaxLaunchConfigurationConstants.VAL_APP_STUB_DEFAULT);

      if (buildMode
          .equals(BlitzMaxLaunchConfigurationConstants.VAL_BUILD_MODE_FULL)) {
        config.addInterpreterArg("-a");
      }

      if (buildEnvironment
          .equals(BlitzMaxLaunchConfigurationConstants.VAL_BUILD_ENVIRONMENT_GUI)) {
        config.addInterpreterArg("-t");
        config.addInterpreterArg("gui");
      } else {
        config.addInterpreterArg("-t");
        config.addInterpreterArg("console");
      }

      if (garbageCollector
          .equals(BlitzMaxLaunchConfigurationConstants.VAL_GARBAGE_COLLECTOR_THREADED)) {
        config.addInterpreterArg("-h");
      }

      addOutputBinary(config, configuration, launch);
    }

    return config;
  }

  protected void addOutputBinary(InterpreterConfig config,
      ILaunchConfiguration configuration, ILaunch launch) {

    IPath path = config.getScriptFilePath();

    IPath temp = path.removeFileExtension();

    config.addInterpreterArg("-o");
    if (!launch.getLaunchMode().equals("debug")) {
      config.addInterpreterArg(temp.addFileExtension("exe").toOSString()); // the name of the exe
    } else {
      config.addInterpreterArg(temp.addFileExtension("debug.exe").toOSString()); // the name of the exe
    }

  }

  protected String getCharset(ILaunchConfiguration configuration)
      throws CoreException {
    IProject project = getScriptProject(configuration).getProject();
    String scriptName = getMainScriptName(configuration);
    IResource resource = null;
    if (scriptName != null) {
      resource = project.findMember(scriptName);
    }

    if (resource instanceof IFile) {
      IFile file = (IFile) resource;
      return file.getCharset();
    }

    return null;
  }

  protected String getCharsetInterpreterFlag(String charset) {
    if (charset.equals("UTF-8")) { //$NON-NLS-1$
      return "-KU"; //$NON-NLS-1$
    } else if (charset.equals("EUC")) { //$NON-NLS-1$
      return "-KE"; //$NON-NLS-1$
    } else if (charset.equals("SJIS")) { //$NON-NLS-1$
      return "-KS"; //$NON-NLS-1$
    }

    return "-KA"; //$NON-NLS-1$
  }

  protected void addEncodingInterpreterArg(InterpreterConfig config,
      ILaunchConfiguration configuration) throws CoreException {
    if (!config.hasMatchedInterpreterArg("-K.*")) { //$NON-NLS-1$
      String charset = getCharset(configuration);
      if (charset != null) {
        config.addInterpreterArg(getCharsetInterpreterFlag(charset));
      }
    }
  }

  protected void addIncludePathInterpreterArg(InterpreterConfig config,
      ILaunchConfiguration configuration) throws CoreException {
    IPath[] paths = createBuildPath(configuration);

    IEnvironment env = config.getEnvironment();
    char separator = env.getPathsSeparatorChar();

    final StringBuffer sb = new StringBuffer();
    if (paths.length > 0) {
      sb.append("-I"); //$NON-NLS-1$
      for (int i = 0; i < paths.length; ++i) {
        if (i != 0) {
          sb.append(separator);
        }
        sb.append(EnvironmentPathUtils.getLocalPath(paths[i]).toString());
      }
    }

    config.addInterpreterArg(sb.toString());
  }

  protected void addStreamSync(InterpreterConfig config,
      ILaunchConfiguration configuration, ILaunch launch) {
    try {
      IDeployment deployment = config.getExecutionEnvironment()
          .createDeployment();
      final IPath path = deployment.add(BlitzMaxLaunchingPlugin.getDefault()
          .getBundle(), "scripts/sync.rb"); //$NON-NLS-1$
      config.addInterpreterArg("-r"); //$NON-NLS-1$
      config.addInterpreterArg(deployment.getFile(path).toString());
    } catch (IOException e) {
      BlitzMaxLaunchingPlugin.log(e);
    }
  }
}
