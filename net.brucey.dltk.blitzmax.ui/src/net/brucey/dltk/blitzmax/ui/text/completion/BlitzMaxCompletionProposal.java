package net.brucey.dltk.blitzmax.ui.text.completion;

import net.brucey.dltk.blitzmax.ui.BlitzMaxUIPlugin;

import org.eclipse.dltk.ui.PreferenceConstants;
import org.eclipse.dltk.ui.text.completion.ScriptCompletionProposal;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.graphics.Image;

public class BlitzMaxCompletionProposal extends ScriptCompletionProposal {
	public BlitzMaxCompletionProposal(String replacementString,
	    int replacementOffset, int replacementLength, Image image,
	    String displayString, int relevance) {
		super(replacementString, replacementOffset, replacementLength, image,
		    displayString, relevance);
	}

	public BlitzMaxCompletionProposal(String replacementString,
	    int replacementOffset, int replacementLength, Image image,
	    String displayString, int relevance, boolean isInDoc) {
		super(replacementString, replacementOffset, replacementLength, image,
		    displayString, relevance, isInDoc);
	}

	protected boolean isSmartTrigger(char trigger) {
		if (trigger == '.') {
			return true;
		}
		return false;
	}

	protected boolean insertCompletion() {
		IPreferenceStore preference = BlitzMaxUIPlugin.getDefault()
		    .getPreferenceStore();
		return preference
		    .getBoolean(PreferenceConstants.CODEASSIST_INSERT_COMPLETION);
	}

}
