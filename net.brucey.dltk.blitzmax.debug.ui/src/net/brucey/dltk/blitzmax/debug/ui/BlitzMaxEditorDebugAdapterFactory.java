package net.brucey.dltk.blitzmax.debug.ui;

import org.eclipse.dltk.debug.ui.ScriptEditorDebugAdapterFactory;
import org.eclipse.dltk.debug.ui.breakpoints.ScriptToggleBreakpointAdapter;

/**
 * Debug adapter factory for the Ruby editor.
 */
public class BlitzMaxEditorDebugAdapterFactory extends
    ScriptEditorDebugAdapterFactory {

  /*
   * @see
   * org.eclipse.dltk.debug.ui.ScriptEditorDebugAdapterFactory#getBreakointAdapter
   * ()
   */
  @Override
  protected ScriptToggleBreakpointAdapter getBreakpointAdapter() {
    return new BlitzMaxToggleBreakpointAdapter();
  }
}
