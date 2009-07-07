package net.brucey.dltk.blitzmax.debugger;

import net.brucey.dltk.blitzmax.debug.BlitzMaxDebugPlugin;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.dltk.core.PreferencesLookupDelegate;
import org.eclipse.dltk.launching.ExternalDebuggingEngineRunner;
import org.eclipse.dltk.launching.IInterpreterInstall;
import org.eclipse.dltk.launching.InterpreterConfig;
import org.eclipse.dltk.launching.debug.DbgpConnectionConfig;

public class BlitzMaxDebuggerRunner extends ExternalDebuggingEngineRunner {

  public static final String ENGINE_ID = "net.brucey.dltk.blitzmax.debugger"; //$NON-NLS-1$

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
  protected InterpreterConfig alterConfig(InterpreterConfig config,
      PreferencesLookupDelegate delegate) throws CoreException {

    //    IFileHandle debugEnginePath = getDebuggingEnginePath(delegate);

    DbgpConnectionConfig dbgpConfig = DbgpConnectionConfig.load(config);

    if (config != null) {
      config.addInterpreterArg("makeapp"); // we're building an app
      config.addInterpreterArg("-d"); // Release (not debug)
      config.addInterpreterArg("-x"); // Execute
      addOutputBinary(config, dbgpConfig);
    }

    return config;

  }

  protected void addOutputBinary(InterpreterConfig config,
      DbgpConnectionConfig dbgpConfig) {

    IPath path = config.getScriptFilePath();

    IPath temp = path.removeFileExtension();

    config.addInterpreterArg("-o");
    config.addInterpreterArg(temp.addFileExtension("debug.exe").toOSString()); // the name of the exe

  }

  @Override
  protected String getDebuggingEnginePreferenceKey() {
    return BlitzMaxDebuggerConstants.DEBUGGING_ENGINE_PATH_KEY;
  }

}
