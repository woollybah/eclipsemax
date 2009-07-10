package net.brucey.dltk.blitzmax.core;

import net.brucey.dltk.blitzmax.BlitzMaxCorePlugin;

import org.eclipse.dltk.core.AbstractLanguageToolkit;
import org.eclipse.dltk.core.IDLTKLanguageToolkit;

public class BlitzMaxLanguageToolkit extends AbstractLanguageToolkit implements
    IDLTKLanguageToolkit {

  private static BlitzMaxLanguageToolkit toolkit;

  public static IDLTKLanguageToolkit getDefault() {
    if (toolkit == null) {
      toolkit = new BlitzMaxLanguageToolkit();
    }
    return toolkit;
  }

  public String getLanguageContentType() {
    return "net.brucey.dltk.blitzmax.contentType";
  }

  public String getLanguageName() {
    return "BlitzMax";
  }

  public String getNatureId() {
    return BlitzMaxNature.BLITZMAX_NATURE;
  }

  @Override
  public String getPreferenceQualifier() {
    return BlitzMaxCorePlugin.PLUGIN_ID;
  }

}
