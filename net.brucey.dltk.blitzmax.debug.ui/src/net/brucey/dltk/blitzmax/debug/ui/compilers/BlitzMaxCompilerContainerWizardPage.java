package net.brucey.dltk.blitzmax.debug.ui.compilers;

import org.eclipse.dltk.internal.debug.ui.interpreters.AbstractInterpreterComboBlock;
import org.eclipse.dltk.internal.debug.ui.interpreters.AbstractInterpreterContainerWizardPage;

public class BlitzMaxCompilerContainerWizardPage extends
    AbstractInterpreterContainerWizardPage {

  @Override
  protected AbstractInterpreterComboBlock getInterpreterBlock() {
    return new BlitzMaxCompilerComboBlock(null);
  }

}
