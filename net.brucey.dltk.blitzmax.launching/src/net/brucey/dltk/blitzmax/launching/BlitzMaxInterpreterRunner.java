package net.brucey.dltk.blitzmax.launching;

import org.eclipse.dltk.launching.AbstractInterpreterRunner;
import org.eclipse.dltk.launching.IInterpreterInstall;

public class BlitzMaxInterpreterRunner extends AbstractInterpreterRunner {

	protected BlitzMaxInterpreterRunner(IInterpreterInstall install) {
		super(install);
	}

	@Override
	protected String getProcessType() {
		return BlitzMaxLaunchConfigurationConstants.ID_BLITZMAX_PROCESS_TYPE;
	}
}
