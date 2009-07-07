package net.brucey.dltk.blitzmax.debug.ui;

import net.brucey.dltk.blitzmax.debug.BlitzMaxDebugConstants;

import org.eclipse.dltk.debug.ui.AbstractDebugUILanguageToolkit;
import org.eclipse.jface.preference.IPreferenceStore;

public class BlitzMaxDebugUILanguageToolkit extends
    AbstractDebugUILanguageToolkit {

  /*
   * @see
   * org.eclipse.dltk.debug.ui.IDLTKDebugUILanguageToolkit#getDebugModelId()
   */
  public String getDebugModelId() {
    return BlitzMaxDebugConstants.DEBUG_MODEL_ID;
  }

  /*
   * @see
   * org.eclipse.dltk.debug.ui.IDLTKDebugUILanguageToolkit#getPreferenceStore()
   */
  public IPreferenceStore getPreferenceStore() {
    return BlitzMaxDebugUIPlugin.getDefault().getPreferenceStore();
  }

  /*
   * @seeorg.eclipse.dltk.debug.ui.AbstractDebugUILanguageToolkit#
   * getVariablesViewPreferencePages()
   */
  @Override
  public String[] getVariablesViewPreferencePages() {
    return new String[] { "net.brucey.dltk.blitzmax.preferences.debug.detailFormatters" }; //$NON-NLS-1$
  }
}
