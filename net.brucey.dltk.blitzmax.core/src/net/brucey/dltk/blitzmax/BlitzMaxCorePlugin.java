package net.brucey.dltk.blitzmax;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.dltk.core.IShutdownListener;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class BlitzMaxCorePlugin extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "net.brucey.dltk.blitzmax.core";

	// The shared instance
	private static BlitzMaxCorePlugin plugin;

	private final ListenerList shutdownListeners = new ListenerList();

	/**
	 * The constructor
	 */
	public BlitzMaxCorePlugin() {
		plugin = this;
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
	}

	public void addShutdownListener(IShutdownListener listener) {
		shutdownListeners.add(listener);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
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
	public static BlitzMaxCorePlugin getDefault() {
		return plugin;
	}



}
