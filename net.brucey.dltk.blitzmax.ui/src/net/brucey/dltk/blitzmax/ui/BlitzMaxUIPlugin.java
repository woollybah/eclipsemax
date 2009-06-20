package net.brucey.dltk.blitzmax.ui;

import net.brucey.dltk.blitzmax.ui.editor.BlitzMaxTextTools;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.dltk.core.IShutdownListener;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class BlitzMaxUIPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "net.brucey.dltk.blitzmax.ui";

	// The shared instance
	private static BlitzMaxUIPlugin plugin;

	private BlitzMaxTextTools textTools;

	private ListenerList shutdownListeners = new ListenerList();

	/**
	 * The constructor
	 */
	public BlitzMaxUIPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	public void stop(BundleContext context) throws Exception {
		Object[] listeners = shutdownListeners.getListeners();
		for (int i = 0; i < listeners.length; ++i) {
			((IShutdownListener) listeners[i]).shutdown();
		}
		shutdownListeners.clear();
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static BlitzMaxUIPlugin getDefault() {
		return plugin;
	}

	public BlitzMaxTextTools getTextTools() {
		if (textTools == null) {
			textTools = new BlitzMaxTextTools(true);
		}

		return textTools;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in
	 * relative path
	 * 
	 * @param path
	 *          the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}

	public static IWorkspace getWorkspace() {
		return ResourcesPlugin.getWorkspace();
	}

	public static void log(IStatus status) {
		getDefault().getLog().log(status);
	}

}
