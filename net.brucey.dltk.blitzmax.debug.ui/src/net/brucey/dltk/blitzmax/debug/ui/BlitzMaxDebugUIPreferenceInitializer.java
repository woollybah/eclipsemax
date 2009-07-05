package net.brucey.dltk.blitzmax.debug.ui;

import org.eclipse.dltk.debug.ui.DLTKDebugUIPluginPreferenceInitializer;

import net.brucey.dltk.blitzmax.core.BlitzMaxNature;

public class BlitzMaxDebugUIPreferenceInitializer extends
    DLTKDebugUIPluginPreferenceInitializer {

  protected String getNatureId() {
    return BlitzMaxNature.BLITZMAX_NATURE;
  }
}
