package net.brucey.dltk.blitzmax.debug.ui;

import org.eclipse.dltk.debug.ui.ScriptDebugModelPresentation;
import org.eclipse.dltk.internal.debug.ui.ScriptDebugHover;
import org.eclipse.jface.preference.IPreferenceStore;

public class BlitzMaxDebugHover extends ScriptDebugHover {

  @Override
  protected ScriptDebugModelPresentation getModelPresentation() {
    return new BlitzMaxDebugModelPresentation();
  }

  public void setPreferenceStore(IPreferenceStore store) {

  }
}
