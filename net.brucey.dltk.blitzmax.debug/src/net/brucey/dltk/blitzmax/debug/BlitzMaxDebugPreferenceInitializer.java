package net.brucey.dltk.blitzmax.debug;

import org.eclipse.core.runtime.Preferences;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.dltk.debug.core.DLTKDebugPreferenceConstants;

public class BlitzMaxDebugPreferenceInitializer extends
    AbstractPreferenceInitializer {

  public BlitzMaxDebugPreferenceInitializer() {
    // TODO Auto-generated constructor stub
  }

  @Override
  public void initializeDefaultPreferences() {
    Preferences store = BlitzMaxDebugPlugin.getDefault().getPluginPreferences();

    if (store.getDefaultString(BlitzMaxDebugConstants.DEBUGGING_ENGINE_ID_KEY) == null)
      store.setDefault(BlitzMaxDebugConstants.DEBUGGING_ENGINE_ID_KEY,
          "net.brucey.dltk.blitzmax.debugger"); //$NON-NLS-1$

    store.setDefault(
        DLTKDebugPreferenceConstants.PREF_DBGP_BREAK_ON_FIRST_LINE, false);
    store.setDefault(DLTKDebugPreferenceConstants.PREF_DBGP_ENABLE_LOGGING,
        false);

    store.setDefault(DLTKDebugPreferenceConstants.PREF_DBGP_SHOW_SCOPE_GLOBAL,
        true);
    store.setDefault(DLTKDebugPreferenceConstants.PREF_DBGP_SHOW_SCOPE_CLASS,
        true);
    store.setDefault(DLTKDebugPreferenceConstants.PREF_DBGP_SHOW_SCOPE_LOCAL,
        true);
  }

}
