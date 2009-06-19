package net.brucey.dltk.blitzmax.core;

import net.brucey.dltk.blitzmax.BlitzMaxCorePlugin;

import org.eclipse.core.runtime.Preferences;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.dltk.compiler.task.TaskTagUtils;

public class BlitzMaxCorePreferenceInitializer extends
    AbstractPreferenceInitializer {

  public void initializeDefaultPreferences() {
    Preferences store = BlitzMaxCorePlugin.getDefault().getPluginPreferences();
    TaskTagUtils.initializeDefaultValues(store);

  }

}
