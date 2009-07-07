package net.brucey.dltk.blitzmax.debugger;

import org.eclipse.jface.preference.IPreferenceStore;

public class BlitzMaxDebuggerConstants {

  public static final String DEBUGGING_ENGINE_PATH_KEY = "debugging_engine_path"; //$NON-NLS-1$

  public static final String ENABLE_LOGGING = "enable_logging"; //$NON-NLS-1$
  public static final String LOG_FILE_PATH = "log_file_path"; //$NON-NLS-1$
  public static final String LOG_FILE_NAME = "log_file_name"; //$NON-NLS-1$

  public static void initializeDefaults(IPreferenceStore store) {
    store.setDefault(LOG_FILE_NAME, "blitzmax_debug_{0}.log"); //$NON-NLS-1$
  }

}
