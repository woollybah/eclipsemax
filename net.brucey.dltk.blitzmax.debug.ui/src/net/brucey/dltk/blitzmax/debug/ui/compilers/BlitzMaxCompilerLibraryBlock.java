package net.brucey.dltk.blitzmax.debug.ui.compilers;

import org.eclipse.dltk.internal.debug.ui.interpreters.AbstractInterpreterLibraryBlock;
import org.eclipse.dltk.internal.debug.ui.interpreters.AddScriptInterpreterDialog;
import org.eclipse.dltk.internal.debug.ui.interpreters.LibraryLabelProvider;
import org.eclipse.jface.viewers.IBaseLabelProvider;

/**
 * The control used for editing libraries associated with a compiler
 * 
 */
public class BlitzMaxCompilerLibraryBlock extends
    AbstractInterpreterLibraryBlock {

  protected BlitzMaxCompilerLibraryBlock(AddScriptInterpreterDialog dialog) {
    super(dialog);
  }

  @Override
  protected IBaseLabelProvider getLabelProvider() {
    return new LibraryLabelProvider();
  }
}
