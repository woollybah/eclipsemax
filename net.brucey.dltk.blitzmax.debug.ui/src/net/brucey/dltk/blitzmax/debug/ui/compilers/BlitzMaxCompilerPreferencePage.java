package net.brucey.dltk.blitzmax.debug.ui.compilers;

import org.eclipse.dltk.internal.debug.ui.interpreters.InterpretersBlock;
import org.eclipse.dltk.internal.debug.ui.interpreters.ScriptInterpreterPreferencePage;

public class BlitzMaxCompilerPreferencePage extends
    ScriptInterpreterPreferencePage {

  public static final String PAGE_ID = "net.brucey.dltk.blitzmax.preferences.compilers"; //$NON-NLS-1$

  @Override
  public InterpretersBlock createInterpretersBlock() {
    return new BlitzMaxCompilersBlock();
  }

}
