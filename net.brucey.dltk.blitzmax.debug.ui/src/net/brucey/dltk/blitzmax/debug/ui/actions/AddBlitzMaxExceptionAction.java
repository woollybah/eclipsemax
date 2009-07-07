package net.brucey.dltk.blitzmax.debug.ui.actions;

import net.brucey.dltk.blitzmax.debug.BlitzMaxDebugConstants;

import org.eclipse.dltk.debug.ui.actions.AddExceptionAction;

public class AddBlitzMaxExceptionAction extends AddExceptionAction {
  @Override
  protected String getDebugModelId() {
    return BlitzMaxDebugConstants.DEBUG_MODEL_ID;
  }
}
