package net.brucey.dltk.blitzmax.ui.actions;

import net.brucey.dltk.blitzmax.ui.BlitzMaxUILanguageToolkit;

import org.eclipse.dltk.ui.IDLTKUILanguageToolkit;
import org.eclipse.dltk.ui.actions.OpenTypeAction;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

public class BlitzMaxOpenTypeAction extends OpenTypeAction implements
    IWorkbenchWindowActionDelegate {

	@Override
	protected IDLTKUILanguageToolkit getUILanguageToolkit() {
		return new BlitzMaxUILanguageToolkit();
	}

}
