package net.brucey.dltk.blitzmax.debug;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class BlitzMaxDebugPlugin extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "net.brucey.dltk.blitzmax.debug";

	// The shared instance
	private static BlitzMaxDebugPlugin plugin;
	
	/**
	 * The constructor
	 */
	public BlitzMaxDebugPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static BlitzMaxDebugPlugin getDefault() {
		return plugin;
	}

}
