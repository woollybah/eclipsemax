package net.brucey.dltk.blitzmax.ui.editor;

import org.eclipse.dltk.ui.text.IColorManager;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.formatter.IContentFormatter;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.texteditor.ITextEditor;

public class BlitzMaxSimpleSourceViewerConfiguration extends
    BlitzMaxSourceViewerConfiguration {

	private boolean configureFormatter;

	public BlitzMaxSimpleSourceViewerConfiguration(IColorManager colorManager,
	    IPreferenceStore preferenceStore, ITextEditor editor,
	    String partitioning, boolean configureFormatter) {

		super(colorManager, preferenceStore, editor, partitioning);

		this.configureFormatter = configureFormatter;
	}

	public IContentFormatter getContentFormatter(ISourceViewer sourceViewer) {
		if (configureFormatter)
			return super.getContentFormatter(sourceViewer);
		else
			return null;
	}

}
