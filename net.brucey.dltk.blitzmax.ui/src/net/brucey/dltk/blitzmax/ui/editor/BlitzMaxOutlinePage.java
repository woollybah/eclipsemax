package net.brucey.dltk.blitzmax.ui.editor;

import org.eclipse.dltk.internal.ui.editor.ScriptEditor;
import org.eclipse.dltk.internal.ui.editor.ScriptOutlinePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ILabelDecorator;

public class BlitzMaxOutlinePage extends ScriptOutlinePage {

	public BlitzMaxOutlinePage(ScriptEditor editor, IPreferenceStore store) {
		super(editor, store);
	}

	protected ILabelDecorator getLabelDecorator() {
		return new BlitzMaxOutlineLabelDecorator();
	}

}
