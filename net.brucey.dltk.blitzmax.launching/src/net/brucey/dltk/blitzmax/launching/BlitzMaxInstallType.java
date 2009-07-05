package net.brucey.dltk.blitzmax.launching;

import java.io.IOException;

import net.brucey.dltk.blitzmax.core.BlitzMaxNature;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IPath;
import org.eclipse.dltk.core.environment.IDeployment;
import org.eclipse.dltk.internal.launching.AbstractInterpreterInstallType;
import org.eclipse.dltk.launching.IInterpreterInstall;

public class BlitzMaxInstallType extends AbstractInterpreterInstallType {

	private static final String[] INTERPRETER_NAMES = { "bmk", "bmk.exe" };

	@Override
	protected IPath createPathFile(IDeployment deployment) throws IOException {
		// FIXME : I'm not entirely sure what a "path file" is.... but we really need to return
		// a valid object, or things break later on.
		return deployment.add(BlitzMaxLaunchingPlugin.getDefault().getBundle(),
		"scripts/path.rb");
	}

	@Override
	protected IInterpreterInstall doCreateInterpreterInstall(String id) {
		return new BlitzMaxInstall(this, id);
	}

	@Override
	protected ILog getLog() {
		return BlitzMaxLaunchingPlugin.getDefault().getLog();
	}

	@Override
	protected String getPluginId() {
		return BlitzMaxLaunchingPlugin.PLUGIN_ID;
	}

	@Override
	protected String[] getPossibleInterpreterNames() {
		return INTERPRETER_NAMES;
	}

	public String getName() {
		return "BlitzMax";
	}

	public String getNatureId() {
		return BlitzMaxNature.BLITZMAX_NATURE;
	}

}
