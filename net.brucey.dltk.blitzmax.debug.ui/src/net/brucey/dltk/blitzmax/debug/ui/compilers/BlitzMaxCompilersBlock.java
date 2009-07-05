package net.brucey.dltk.blitzmax.debug.ui.compilers;

import net.brucey.dltk.blitzmax.core.BlitzMaxNature;

import org.eclipse.dltk.core.environment.IEnvironment;
import org.eclipse.dltk.internal.debug.ui.interpreters.AddScriptInterpreterDialog;
import org.eclipse.dltk.internal.debug.ui.interpreters.IScriptInterpreterDialog;
import org.eclipse.dltk.internal.debug.ui.interpreters.InterpretersBlock;
import org.eclipse.dltk.launching.IInterpreterInstall;
import org.eclipse.dltk.launching.ScriptRuntime;

public class BlitzMaxCompilersBlock extends InterpretersBlock {

	protected IScriptInterpreterDialog createInterpreterDialog(
	    IEnvironment environment, IInterpreterInstall standin) {
		AddScriptInterpreterDialog dialog = new AddBlitzMaxCompilerDialog(this,
		    getShell(), ScriptRuntime
		        .getInterpreterInstallTypes(getCurrentNature()), standin);
		if (dialog != null) {
			dialog.setEnvironment(environment);
		}

		return dialog;
	}

	@Override
	protected String getCurrentNature() {
		return BlitzMaxNature.BLITZMAX_NATURE;
	}

}
