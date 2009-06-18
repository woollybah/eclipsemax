package net.brucey.dltk.blitzmax.ui.text.completion;

import net.brucey.dltk.blitzmax.ui.templates.BlitzMaxTemplateCompletionProcessor;

import org.eclipse.dltk.ui.text.completion.ScriptCompletionProposalCollector;
import org.eclipse.dltk.ui.text.completion.ScriptCompletionProposalComputer;
import org.eclipse.dltk.ui.text.completion.ScriptContentAssistInvocationContext;
import org.eclipse.jface.text.templates.TemplateCompletionProcessor;

public class BlitzMaxCompletionProposalComputer extends
    ScriptCompletionProposalComputer {

	public BlitzMaxCompletionProposalComputer() {
	}

	protected ScriptCompletionProposalCollector createCollector(
	    ScriptContentAssistInvocationContext context) {
		return new BlitzMaxCompletionProposalCollector(context.getSourceModule());
	}

	protected TemplateCompletionProcessor createTemplateProposalComputer(
	    ScriptContentAssistInvocationContext context) {
		return new BlitzMaxTemplateCompletionProcessor(context);
	}

}
