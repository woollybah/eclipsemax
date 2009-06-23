package net.brucey.dltk.blitzmax.ui.text;

import org.eclipse.dltk.compiler.task.ITodoTaskPreferences;
import org.eclipse.dltk.ui.text.IColorManager;
import org.eclipse.dltk.ui.text.ScriptCommentScanner;
import org.eclipse.jface.preference.IPreferenceStore;

public class BlitzMaxScriptCommentScanner extends ScriptCommentScanner {

  private static final char COMMENT_CHAR = '\'';

  public BlitzMaxScriptCommentScanner(IColorManager manager,
      IPreferenceStore store, String comment, String todoTag,
      ITodoTaskPreferences preferences) {
    super(manager, store, comment, todoTag, preferences);
  }

  @Override
  protected char getCommentChar() {
    return COMMENT_CHAR;
  }

}
