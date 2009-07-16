package net.brucey.dltk.blitzmax.debugger;

import java.io.File;
import java.util.List;

import net.brucey.dltk.blitzmax.debug.BlitzMaxDebugPlugin;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.core.PreferencesLookupDelegate;
import org.eclipse.dltk.core.environment.FileAsFileHandle;
import org.eclipse.dltk.core.environment.IFileHandle;
import org.eclipse.dltk.launching.ExternalDebuggingEngineRunner;
import org.eclipse.dltk.launching.IInterpreterInstall;
import org.eclipse.dltk.launching.InterpreterConfig;
import org.eclipse.dltk.launching.debug.DbgpConstants;

public class BlitzMaxDebuggerRunner extends ExternalDebuggingEngineRunner {

  public static final String ENGINE_ID = "net.brucey.dltk.blitzmax.debugger"; //$NON-NLS-1$

  private String debugPath;

  public BlitzMaxDebuggerRunner(IInterpreterInstall install) {
    super(install);
    // TODO Auto-generated constructor stub
  }

  @Override
  protected String getDebugPreferenceQualifier() {
    return BlitzMaxDebugPlugin.PLUGIN_ID;
  }

  @Override
  protected String getDebuggingEngineId() {
    return ENGINE_ID;
  }

  @Override
  protected String getDebuggingEnginePreferenceQualifier() {
    return BlitzMaxDebuggerPlugin.PLUGIN_ID;
  }

  @Override
  protected String getLogFileNamePreferenceKey() {
    return BlitzMaxDebuggerConstants.LOG_FILE_NAME;
  }

  @Override
  protected IFileHandle getDebuggingEnginePath(
      PreferencesLookupDelegate delegate) {

    StringBuffer f = new StringBuffer(getInstall().getInstallLocation()
        .getParent().toOSString());
    f.append(File.separatorChar).append("bmxdbgp");

    if (System.getProperty("os.name").startsWith("Windows")) {
      f.append(".exe");
    }

    debugPath = f.toString();

    return new FileAsFileHandle(new File(debugPath));
  }

  @SuppressWarnings("unchecked")
  @Override
  protected InterpreterConfig alterConfig(InterpreterConfig config,
      PreferencesLookupDelegate delegate) throws CoreException {

    //    DbgpConnectionConfig dbgpConfig = DbgpConnectionConfig.load(config);

    if (config != null) {
      config.setProperty("OVERRIDE_EXE", debugPath);

      // we need to clear out the interpreter args...
      List<String> args = config.getInterpreterArgs();
      for (String arg : args) {
        config.removeInterpreterArg(arg);
      }

      config.addInterpreterArg("127.0.0.1");
      config.addInterpreterArg((String) config
          .getProperty(DbgpConstants.PORT_PROP));
      config.addInterpreterArg((String) config
          .getProperty(DbgpConstants.SESSION_ID_PROP));

      config.addInterpreterArg(getInstall().getInstallLocation().toOSString());

      config.addInterpreterArgs(args);

      config.addEnvVar("BMXPATH", getInstall().getInstallLocation().getParent()
          .getParent().toOSString());
    }

    return config;

  }

  @Override
  protected String getDebuggingEnginePreferenceKey() {
    return BlitzMaxDebuggerConstants.DEBUGGING_ENGINE_PATH_KEY;
  }

}
