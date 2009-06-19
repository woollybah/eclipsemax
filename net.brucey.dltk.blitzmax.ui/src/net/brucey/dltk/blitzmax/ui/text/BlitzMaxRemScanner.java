package net.brucey.dltk.blitzmax.ui.text;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.dltk.compiler.task.ITodoTaskPreferences;
import org.eclipse.dltk.ui.text.AbstractScriptScanner;
import org.eclipse.dltk.ui.text.IColorManager;
import org.eclipse.dltk.ui.text.TodoTagRule;
import org.eclipse.dltk.ui.text.TodoTaskPreferencesOnPreferenceStore;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.WhitespaceRule;

public class BlitzMaxRemScanner extends AbstractScriptScanner {

  private static final String[] tokenProperties = new String[] {
      IBlitzMaxColorConstants.BLITZMAX_MULTILINE_COMMENT,
      IBlitzMaxColorConstants.BLITZMAX_TODO_COMMENT };

  public BlitzMaxRemScanner(IColorManager manager, IPreferenceStore store) {
    super(manager, store);

    initialize();
  }

  protected String[] getTokenProperties() {
    return tokenProperties;
  }

  protected List createRules() {
    final List/* <IRule> */rules = new ArrayList/* <IRule> */();

    final IToken other = getToken(IBlitzMaxColorConstants.BLITZMAX_MULTILINE_COMMENT);
    final IToken todo = getToken(IBlitzMaxColorConstants.BLITZMAX_TODO_COMMENT);

    // Add generic whitespace rule.
    rules.add(new WhitespaceRule(new BlitzMaxWhitespaceDetector()));
    rules.add(createTodoTagRule(todo));

    setDefaultReturnToken(other);
    return rules;
  }

  private TodoTagRule createTodoTagRule(final IToken token) {
    final ITodoTaskPreferences prefs = new TodoTaskPreferencesOnPreferenceStore(
        getPreferenceStore());
    return new TodoTagRule(token, prefs.getTagNames(), prefs.isCaseSensitive());
  }
}
