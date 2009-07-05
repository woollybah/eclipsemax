package net.brucey.dltk.blitzmax.debugger;

import net.brucey.dltk.blitzmax.debug.BlitzMaxDebugPlugin;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.dltk.core.PreferencesLookupDelegate;
import org.eclipse.dltk.launching.DebuggingEngineRunner;
import org.eclipse.dltk.launching.IInterpreterInstall;
import org.eclipse.dltk.launching.InterpreterConfig;

public class BlitzMaxDebuggerRunner extends DebuggingEngineRunner {

	public static final String ENGINE_ID = "net.brucey.dltk.blitzmax.debugger"; //$NON-NLS-1$

	public BlitzMaxDebuggerRunner(IInterpreterInstall install) {
		super(install);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected InterpreterConfig addEngineConfig(InterpreterConfig config,
	    PreferencesLookupDelegate delegate, ILaunch launch) throws CoreException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getDebugPreferenceQualifier() {
		return BlitzMaxDebugPlugin.PLUGIN_ID;
	}

	@Override
	protected String getDebuggingEngineId() {
		return ENGINE_ID;
	}

	@Override
	protected String getDebuggingEnginePreferenceQualifier() {
		return BlitzMaxDebuggerPlugin.PLUGIN_ID;
	}

	@Override
	protected String getLogFileNamePreferenceKey() {
		return BlitzMaxDebuggerConstants.LOG_FILE_NAME;
	}

}
