package net.brucey.dltk.blitzmax.ui.preferences;

import net.brucey.dltk.blitzmax.ui.BlitzMaxUIPlugin;

import org.eclipse.core.runtime.Path;
import org.eclipse.dltk.core.IBuildpathEntry;
import org.eclipse.dltk.core.IProjectFragment;
import org.eclipse.dltk.internal.core.BuildpathEntry;
import org.eclipse.dltk.ui.util.IStatusChangeListener;
import org.eclipse.dltk.ui.wizards.BuildpathsBlock;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.preferences.IWorkbenchPreferenceContainer;

public class BlitzMaxBuildPathsBlock extends BuildpathsBlock {

	public BlitzMaxBuildPathsBlock(IRunnableContext runnableContext,
	    IStatusChangeListener context, int pageToShow, boolean useNewPage,
	    IWorkbenchPreferenceContainer pageContainer) {
		super(runnableContext, context, pageToShow, useNewPage, pageContainer);
	}

	protected IPreferenceStore getPreferenceStore() {
		return BlitzMaxUIPlugin.getDefault().getPreferenceStore();
	}

	protected boolean supportZips() {
		return true;
	}

	/**
	 * Makes the project folder a source folder.
	 * 
	 * This is more useful in BlitzMax since there isn't really the concept of a
	 * specific source folder.
	 * 
	 * FIXME : Use a better way of doing this.
	 */
	public void setBaseSourceFolder() {
		IBuildpathEntry entry = new BuildpathEntry(IProjectFragment.K_SOURCE,
		    IBuildpathEntry.BPE_SOURCE, new Path(""), false,
		    BuildpathEntry.INCLUDE_ALL, BuildpathEntry.EXCLUDE_NONE, null, true,
		    null, false);

		addElement(entry);
	}
}
