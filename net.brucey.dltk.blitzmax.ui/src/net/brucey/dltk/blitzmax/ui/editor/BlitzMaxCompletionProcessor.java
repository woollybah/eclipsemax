package net.brucey.dltk.blitzmax.ui.editor;

import net.brucey.dltk.blitzmax.ui.BlitzMaxUIPlugin;
import net.brucey.dltk.blitzmax.core.BlitzMaxNature;

import org.eclipse.dltk.ui.text.completion.CompletionProposalLabelProvider;
import org.eclipse.dltk.ui.text.completion.ScriptCompletionProcessor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.ui.IEditorPart;

public class BlitzMaxCompletionProcessor extends ScriptCompletionProcessor {

	public BlitzMaxCompletionProcessor(IEditorPart editor,
	    ContentAssistant assistant, String partition) {
		super(editor, assistant, partition);
	}

	@Override
	protected String getNatureId() {
		return BlitzMaxNature.BLITZMAX_NATURE;
	}

	@Override
	protected CompletionProposalLabelProvider getProposalLabelProvider() {
		return new CompletionProposalLabelProvider();
	}

	@Override
	protected IPreferenceStore getPreferenceStore() {
		return BlitzMaxUIPlugin.getDefault().getPreferenceStore();
	}

}
