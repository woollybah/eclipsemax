package net.brucey.dltk.blitzmax.launching;

import org.eclipse.core.runtime.Preferences;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;

public class BlitzMaxLaunchingPluginPreferenceInitializer extends
    AbstractPreferenceInitializer {

	public BlitzMaxLaunchingPluginPreferenceInitializer() {
		super();
	}

	@Override
	public void initializeDefaultPreferences() {
		final Preferences prefs = BlitzMaxLaunchingPlugin.getDefault()
		.getPluginPreferences();

	}

}
