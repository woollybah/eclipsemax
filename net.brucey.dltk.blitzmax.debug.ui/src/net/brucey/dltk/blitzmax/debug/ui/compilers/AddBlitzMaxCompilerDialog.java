package net.brucey.dltk.blitzmax.debug.ui.compilers;

import org.eclipse.dltk.internal.debug.ui.interpreters.AbstractInterpreterLibraryBlock;
import org.eclipse.dltk.internal.debug.ui.interpreters.AddScriptInterpreterDialog;
import org.eclipse.dltk.internal.debug.ui.interpreters.IAddInterpreterDialogRequestor;
import org.eclipse.dltk.launching.IInterpreterInstall;
import org.eclipse.dltk.launching.IInterpreterInstallType;
import org.eclipse.swt.widgets.Shell;

public class AddBlitzMaxCompilerDialog extends AddScriptInterpreterDialog {

	public AddBlitzMaxCompilerDialog(IAddInterpreterDialogRequestor requestor,
	    Shell shell, IInterpreterInstallType[] interpreterInstallTypes,
	    IInterpreterInstall editedInterpreter) {
		super(requestor, shell, interpreterInstallTypes, editedInterpreter);
	}

	protected AbstractInterpreterLibraryBlock createLibraryBlock(
	    AddScriptInterpreterDialog dialog) {
		return new BlitzMaxCompilerLibraryBlock(dialog);
	}
	
	@Override
	/**
	 * Leave out the "Interpreter Arguments" field.
	 */
	protected boolean useInterpreterArgs() {
	  return false;
	}
}
