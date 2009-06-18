package net.brucey.dltk.blitzmax.ui.templates;

import net.brucey.dltk.blitzmax.ui.BlitzMaxUIPlugin;
import net.brucey.dltk.blitzmax.ui.editor.BlitzMaxSimpleSourceViewerConfiguration;
import net.brucey.dltk.blitzmax.ui.editor.BlitzMaxTextTools;
import net.brucey.dltk.blitzmax.ui.editor.IBlitzMaxPartitions;

import org.eclipse.dltk.ui.templates.ScriptTemplateAccess;
import org.eclipse.dltk.ui.templates.ScriptTemplatePreferencePage;
import org.eclipse.dltk.ui.text.ScriptSourceViewerConfiguration;
import org.eclipse.jface.text.IDocument;

public class BlitzMaxCodeTemplatesPreferencePage extends
    ScriptTemplatePreferencePage {
	protected ScriptSourceViewerConfiguration createSourceViewerConfiguration() {
		return new BlitzMaxSimpleSourceViewerConfiguration(getTextTools()
		    .getColorManager(), getPreferenceStore(), null,
		    IBlitzMaxPartitions.BLITZMAX_PARTITIONING, false);
	}

	protected void setDocumentParticioner(IDocument document) {
		getTextTools().setupDocumentPartitioner(document,
		    IBlitzMaxPartitions.BLITZMAX_PARTITIONING);
	}

	protected void setPreferenceStore() {
		setPreferenceStore(BlitzMaxUIPlugin.getDefault().getPreferenceStore());
	}

	protected ScriptTemplateAccess getTemplateAccess() {
		return BlitzMaxTemplateAccess.getInstance();
	}

	private BlitzMaxTextTools getTextTools() {
		return BlitzMaxUIPlugin.getDefault().getTextTools();
	}

}
