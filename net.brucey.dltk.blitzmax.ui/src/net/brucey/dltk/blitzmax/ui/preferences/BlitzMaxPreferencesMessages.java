package net.brucey.dltk.blitzmax.ui.preferences;

import org.eclipse.osgi.util.NLS;

public class BlitzMaxPreferencesMessages extends NLS {

	private static final String BUNDLE_NAME = "net.brucey.dltk.blitzmax.ui.preferences.BlitzMaxPreferencesMessages"; //$NON-NLS-1$

	static {
		NLS.initializeMessages(BUNDLE_NAME, BlitzMaxPreferencesMessages.class);
	}

	private BlitzMaxPreferencesMessages() {
	}

	public static String EditorPreferencePageDescription;
	public static String GlobalPreferencePageDescription;
	public static String TodoTaskDescription;
	public static String BlitzMaxClassVariable;
	public static String BlitzMaxInstanceVariable;
	public static String BlitzMaxGlobalVariable;

}
