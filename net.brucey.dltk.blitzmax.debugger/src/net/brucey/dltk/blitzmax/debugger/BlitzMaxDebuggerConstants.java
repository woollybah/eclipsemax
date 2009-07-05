package net.brucey.dltk.blitzmax.debugger;

import org.eclipse.jface.preference.IPreferenceStore;

public class BlitzMaxDebuggerConstants {

	public static final String LOG_FILE_NAME = "log_file_name"; //$NON-NLS-1$

	public static void initializeDefaults(IPreferenceStore store) {
		store.setDefault(LOG_FILE_NAME, "blitzmax_debug_{0}.log"); //$NON-NLS-1$
	}

}
