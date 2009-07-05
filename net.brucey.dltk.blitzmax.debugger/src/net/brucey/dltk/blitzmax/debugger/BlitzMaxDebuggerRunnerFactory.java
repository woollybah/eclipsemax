package net.brucey.dltk.blitzmax.debugger;

import org.eclipse.dltk.launching.IInterpreterInstall;
import org.eclipse.dltk.launching.IInterpreterRunner;
import org.eclipse.dltk.launching.IInterpreterRunnerFactory;

public class BlitzMaxDebuggerRunnerFactory implements IInterpreterRunnerFactory {

	public IInterpreterRunner createRunner(IInterpreterInstall install) {
		return new BlitzMaxDebuggerRunner(install);
	}
}
