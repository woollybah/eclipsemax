package net.brucey.dltk.blitzmax.ui.text;

import org.eclipse.dltk.compiler.task.ITodoTaskPreferences;
import org.eclipse.dltk.ui.text.IColorManager;
import org.eclipse.dltk.ui.text.ScriptCommentScanner;
import org.eclipse.dltk.ui.text.TodoTagRule;
import org.eclipse.dltk.ui.text.TodoTaskPreferencesOnPreferenceStore;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.rules.IRule;

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

	protected IRule createTodoRule() {
		final ITodoTaskPreferences prefs = new TodoTaskPreferencesOnPreferenceStore(
		    getPreferenceStore());
		return new TodoTagRule(
		    getToken(IBlitzMaxColorConstants.BLITZMAX_TODO_COMMENT), prefs
		        .getTagNames(), prefs.isCaseSensitive());
	}

}
