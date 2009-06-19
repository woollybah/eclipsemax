package net.brucey.dltk.blitzmax.ui.text;

import net.brucey.dltk.blitzmax.ui.BlitzMaxUIPlugin;

import org.eclipse.dltk.ui.text.ScriptOutlineInformationControl;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Shell;

public class BlitzMaxOutlineInformationControl extends
    ScriptOutlineInformationControl {

  public BlitzMaxOutlineInformationControl(Shell parent, int shellStyle,
      int treeStyle, String commandId) {
    super(parent, shellStyle, treeStyle, commandId);
  }

  protected IPreferenceStore getPreferenceStore() {
    return BlitzMaxUIPlugin.getDefault().getPreferenceStore();
  }
}
