package net.brucey.dltk.blitzmax.ui.editor;

import net.brucey.dltk.blitzmax.ui.BlitzMaxUIPlugin;

import org.eclipse.core.filebuffers.IDocumentSetupParticipant;
import org.eclipse.jface.text.IDocument;

public class BlitzMaxDocumentSetupParticipant implements
    IDocumentSetupParticipant {

	public BlitzMaxDocumentSetupParticipant() {
	}

	public void setup(IDocument document) {
		BlitzMaxTextTools tools = BlitzMaxUIPlugin.getDefault().getTextTools();
		tools.setupDocumentPartitioner(document,
		    IBlitzMaxPartitions.BLITZMAX_PARTITIONING);
	}

}
