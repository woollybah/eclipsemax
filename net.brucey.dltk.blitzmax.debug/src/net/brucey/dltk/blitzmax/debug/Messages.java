package net.brucey.dltk.blitzmax.debug;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
  private static final String BUNDLE_NAME = "net.brucey.dltk.blitzmax.debug.messages"; //$NON-NLS-1$
  public static String BlitzMaxHotCodeReplaceProvider_unableToComputeSourceFilePath;
  static {
    // initialize resource bundle
    NLS.initializeMessages(BUNDLE_NAME, Messages.class);
  }

  private Messages() {
  }
}
