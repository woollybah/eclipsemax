package net.brucey.dltk.blitzmax.launching;

import net.brucey.dltk.blitzmax.debug.BlitzMaxDebugConstants;
import net.brucey.dltk.blitzmax.debug.BlitzMaxDebugPlugin;

import org.eclipse.dltk.core.DLTKIdContributionSelector;
import org.eclipse.dltk.core.PreferencesLookupDelegate;

public class BlitzMaxDebuggingEngineSelector extends DLTKIdContributionSelector {

	@Override
	protected String getSavedContributionId(PreferencesLookupDelegate delegate) {
		return delegate.getString(BlitzMaxDebugPlugin.PLUGIN_ID,
		    BlitzMaxDebugConstants.DEBUGGING_ENGINE_ID_KEY);
	}
}
