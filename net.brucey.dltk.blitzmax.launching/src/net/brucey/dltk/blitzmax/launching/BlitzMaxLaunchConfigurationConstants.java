package net.brucey.dltk.blitzmax.launching;

import org.eclipse.dltk.launching.ScriptLaunchConfigurationConstants;

public class BlitzMaxLaunchConfigurationConstants extends
    ScriptLaunchConfigurationConstants {

  private BlitzMaxLaunchConfigurationConstants() {
  }

  public static final String ID_BLITZMAX_APP = "net.brucey.dltk.blitzmax.launching.BlitzMaxLaunchConfigurationType"; //$NON-NLS-1$

  public static final String ID_BLITZMAX_PROCESS_TYPE = "blitzmaxCompiler"; //$NON-NLS-1$

  public static final String ATTR_BUILD_ENVIRONMENT = "buildEnvironment";
  public static final String ATTR_BUILD_MODE = "buildMode";
  public static final String ATTR_GARBAGE_COLLECTOR = "garbageCollector";
  public static final String ATTR_APP_STUB = "appStub";

  public static final String VAL_BUILD_ENVIRONMENT_GUI = "gui";
  public static final String VAL_BUILD_ENVIRONMENT_CONSOLE = "console";
  public static final String VAL_BUILD_MODE_FULL = "full";
  public static final String VAL_BUILD_MODE_QUICK = "quick";
  public static final String VAL_GARBAGE_COLLECTOR_THREADED = "threaded";
  public static final String VAL_GARBAGE_COLLECTOR_NONTHREADED = "nonthreaded";
  public static final String VAL_APP_STUB_DEFAULT = "default";
  public static final String VAL_APP_STUB_THIRD_PARTY = "thirdParty";
  public static final String VAL_APP_STUB_REMOTE_DEBUGGER = "remoteDebugger";
}
