package net.brucey.dltk.blitzmax.debug.ui.compilers;

import net.brucey.dltk.blitzmax.core.BlitzMaxNature;

import org.eclipse.dltk.debug.ui.launchConfigurations.InterpreterTab;
import org.eclipse.dltk.internal.debug.ui.interpreters.AbstractInterpreterComboBlock;

public class BlitzMaxCompilerTab extends InterpreterTab {

  @Override
  protected AbstractInterpreterComboBlock getInterpreterBlock() {
    return new BlitzMaxCompilerComboBlock(getMainTab());
  }

  @Override
  protected String getNature() {
    return BlitzMaxNature.BLITZMAX_NATURE;
  }

  @Override
  public String getName() {
    return "Compiler";
  }
}
