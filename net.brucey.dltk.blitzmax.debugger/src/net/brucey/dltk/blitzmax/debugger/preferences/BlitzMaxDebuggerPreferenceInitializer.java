package net.brucey.dltk.blitzmax.debugger.preferences;

import net.brucey.dltk.blitzmax.debugger.BlitzMaxDebuggerConstants;
import net.brucey.dltk.blitzmax.debugger.BlitzMaxDebuggerPlugin;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

public class BlitzMaxDebuggerPreferenceInitializer extends
    AbstractPreferenceInitializer {

  /*
   * @seeorg.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#
   * initializeDefaultPreferences()
   */
  @Override
  public void initializeDefaultPreferences() {
    IPreferenceStore store = BlitzMaxDebuggerPlugin.getDefault()
        .getPreferenceStore();

    BlitzMaxDebuggerConstants.initializeDefaults(store);
  }
}
