package net.brucey.dltk.blitzmax.ui.text;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.dltk.compiler.task.ITodoTaskPreferences;
import org.eclipse.dltk.ui.text.AbstractScriptScanner;
import org.eclipse.dltk.ui.text.IColorManager;
import org.eclipse.dltk.ui.text.TodoTagRule;
import org.eclipse.dltk.ui.text.TodoTaskPreferencesOnPreferenceStore;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.IWhitespaceDetector;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.jface.text.rules.WordRule;

public class BlitzMaxCodeScanner extends AbstractScriptScanner {

	private static String[] keywords = { "and", "for", "assert", "elseif",
	    "from", "exit", "else", "global", "not", "try", "type", "end", "if",
	    "or", "while", "continue", "then", "import", "include", "strict",
	    "until", "next", "extends", "to", "superstrict", "finally", "method",
	    "function", "self", "return", "step", "field", "final", "abstract" };

	private static String tokenProperties[] = new String[] {
	    IBlitzMaxColorConstants.BLITZMAX_COMMENT,
	    IBlitzMaxColorConstants.BLITZMAX_DEFAULT,
	    IBlitzMaxColorConstants.BLITZMAX_KEYWORD,
	    IBlitzMaxColorConstants.BLITZMAX_MULTILINE_COMMENT,
	    IBlitzMaxColorConstants.BLITZMAX_TODO_COMMENT };

	public BlitzMaxCodeScanner(IColorManager manager, IPreferenceStore store) {
		super(manager, store);
		this.initialize();
	}

	@Override
	protected List createRules() {
		List/* <IRule> */rules = new ArrayList/* <IRule> */();
		IToken keyword = this.getToken(IBlitzMaxColorConstants.BLITZMAX_KEYWORD);
		IToken comment = this.getToken(IBlitzMaxColorConstants.BLITZMAX_COMMENT);
		IToken other = this.getToken(IBlitzMaxColorConstants.BLITZMAX_DEFAULT);
		IToken multilineComment = this
		    .getToken(IBlitzMaxColorConstants.BLITZMAX_MULTILINE_COMMENT);
		final IToken todo = getToken(IBlitzMaxColorConstants.BLITZMAX_TODO_COMMENT);

		// Add rule for single line comments.
		rules.add(new EndOfLineRule("'", comment));

		rules.add(new MultiLineRule("rem", "end rem", multilineComment));
		rules.add(new MultiLineRule("rem", "endrem", multilineComment));

		// Add generic whitespace rule.
		rules.add(new WhitespaceRule(new BlitzMaxWhitespaceDetector()));
		// Add word rule for keywords.
		WordRule wordRule = new WordRule(new BlitzMaxWordDetector(), other, true);
		for (int i = 0; i < keywords.length; i++) {
			wordRule.addWord(keywords[i], keyword);
		}
		rules.add(wordRule);
		rules.add(createTodoTagRule(todo));

		this.setDefaultReturnToken(other);
		return rules;
	}

	@Override
	protected String[] getTokenProperties() {
		return tokenProperties;
	}

	public class BlitzMaxWhitespaceDetector implements IWhitespaceDetector {
		public boolean isWhitespace(char character) {
			return Character.isWhitespace(character);
		}
	}

	public class BlitzMaxWordDetector implements IWordDetector {
		public boolean isWordPart(char character) {
			return Character.isJavaIdentifierPart(character);
		}

		public boolean isWordStart(char character) {
			return Character.isJavaIdentifierStart(character);
		}
	}

	public int read() {
		int c = super.read();

		if (c != EOF) {
			c = Character.toLowerCase((char) c);
		}

		return c;
	}

	private TodoTagRule createTodoTagRule(final IToken token) {
		final ITodoTaskPreferences prefs = new TodoTaskPreferencesOnPreferenceStore(
		    getPreferenceStore());
		return new TodoTagRule(token, prefs.getTagNames(), prefs.isCaseSensitive());
	}

}
