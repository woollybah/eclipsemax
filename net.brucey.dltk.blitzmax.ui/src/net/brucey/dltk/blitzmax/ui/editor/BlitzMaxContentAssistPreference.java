package net.brucey.dltk.blitzmax.ui.editor;

import net.brucey.dltk.blitzmax.ui.BlitzMaxUIPlugin;

import org.eclipse.dltk.ui.text.ScriptTextTools;
import org.eclipse.dltk.ui.text.completion.ContentAssistPreference;

public class BlitzMaxContentAssistPreference extends ContentAssistPreference {

	private static BlitzMaxContentAssistPreference instance;

	@Override
	protected ScriptTextTools getTextTools() {
		return BlitzMaxUIPlugin.getDefault().getTextTools();
	}

	public static ContentAssistPreference getDefault() {
		if (instance == null) {
			instance = new BlitzMaxContentAssistPreference();
		}
		return instance;
	}

}
