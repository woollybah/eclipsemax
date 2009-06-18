package net.brucey.dltk.blitzmax.ui.templates;

import org.eclipse.dltk.ui.templates.ScriptTemplateAccess;
import org.eclipse.dltk.ui.templates.ScriptTemplateCompletionProcessor;
import org.eclipse.dltk.ui.text.completion.ScriptContentAssistInvocationContext;

public class BlitzMaxTemplateCompletionProcessor extends
    ScriptTemplateCompletionProcessor {

	private static char[] IGNORE = new char[] { '.' };

	public BlitzMaxTemplateCompletionProcessor(
	    ScriptContentAssistInvocationContext context) {
		super(context);
	}

	protected String getContextTypeId() {
		return BlitzMaxUniversalTemplateContextType.CONTEXT_TYPE_ID;
	}

	protected char[] getIgnore() {
		return IGNORE;
	}

	protected ScriptTemplateAccess getTemplateAccess() {
		return BlitzMaxTemplateAccess.getInstance();
	}

}
