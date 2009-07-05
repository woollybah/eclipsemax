package net.brucey.dltk.blitzmax.launching;

import net.brucey.dltk.blitzmax.core.BlitzMaxNature;

import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.dltk.launching.AbstractInterpreterInstall;
import org.eclipse.dltk.launching.IInterpreterInstallType;
import org.eclipse.dltk.launching.IInterpreterRunner;

public class BlitzMaxInstall extends AbstractInterpreterInstall {

	public BlitzMaxInstall(IInterpreterInstallType type, String id) {
		super(type, id);
	}

	public String getNatureId() {
		return BlitzMaxNature.BLITZMAX_NATURE;
	}

	public IInterpreterRunner getInterpreterRunner(String mode) {
		final IInterpreterRunner runner = super.getInterpreterRunner(mode);

		if (runner != null) {
			return runner;
		}

		if (mode.equals(ILaunchManager.RUN_MODE)) {
			return new BlitzMaxInterpreterRunner(this);
		}

		return null;
	}

}
