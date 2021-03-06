package net.brucey.dltk.blitzmax.debug.ui.handlers;

import net.brucey.dltk.blitzmax.debug.BlitzMaxDebugConstants;
import net.brucey.dltk.blitzmax.debug.BlitzMaxDebugPlugin;

import org.eclipse.dltk.debug.ui.handlers.AbstractToggleGlobalVariableHandler;
import org.eclipse.dltk.ui.PreferencesAdapter;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * Toggles the display of BlitzMax global variables in the debug 'Variables'
 * view
 */
public class ToggleGlobalVariablesHandler extends
    AbstractToggleGlobalVariableHandler {
  /*
   * @see
   * org.eclipse.dltk.debug.ui.handlers.AbstractToggleVariableHandler#getModelId
   * ()
   */
  @Override
  protected String getModelId() {
    return BlitzMaxDebugConstants.DEBUG_MODEL_ID;
  }

  /*
   * @seeorg.eclipse.dltk.debug.ui.handlers.AbstractToggleVariableHandler#
   * getPreferenceStore()
   */
  @Override
  protected IPreferenceStore getPreferenceStore() {
    return new PreferencesAdapter(BlitzMaxDebugPlugin.getDefault()
        .getPluginPreferences());
  }
}
