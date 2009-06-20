package net.brucey.dltk.blitzmax.ui;

import org.eclipse.core.runtime.Path;
import org.eclipse.dltk.ui.PluginImagesHelper;
import org.eclipse.jface.resource.ImageDescriptor;

public class BlitzMaxImages {
	private static final PluginImagesHelper helper = new PluginImagesHelper(
	    BlitzMaxUIPlugin.getDefault().getBundle(), new Path("/icons")); //$NON-NLS-1$

	public static final ImageDescriptor DESC_WIZBAN_PROJECT_CREATION = helper
	    .createUnManaged(PluginImagesHelper.T_WIZBAN, "projectcreate_wiz.png"); //$NON-NLS-1$

}
