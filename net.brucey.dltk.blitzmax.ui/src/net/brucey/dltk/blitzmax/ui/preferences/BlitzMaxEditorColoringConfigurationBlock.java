package net.brucey.dltk.blitzmax.ui.preferences;

import java.io.InputStream;

import net.brucey.dltk.blitzmax.ui.BlitzMaxUIPlugin;
import net.brucey.dltk.blitzmax.ui.BlitzMaxPreferenceConstants;
import net.brucey.dltk.blitzmax.ui.editor.BlitzMaxDocumentSetupParticipant;
import net.brucey.dltk.blitzmax.ui.editor.IBlitzMaxPartitions;
import net.brucey.dltk.blitzmax.ui.text.IBlitzMaxColorConstants;

import org.eclipse.dltk.internal.ui.editor.ScriptSourceViewer;
import org.eclipse.dltk.ui.preferences.AbstractScriptEditorColoringConfigurationBlock;
import org.eclipse.dltk.ui.preferences.IPreferenceConfigurationBlock;
import org.eclipse.dltk.ui.preferences.OverlayPreferenceStore;
import org.eclipse.dltk.ui.preferences.PreferencesMessages;
import org.eclipse.dltk.ui.text.IColorManager;
import org.eclipse.dltk.ui.text.ScriptSourceViewerConfiguration;
import org.eclipse.dltk.ui.text.ScriptTextTools;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.source.IOverviewRuler;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.jface.text.source.projection.ProjectionViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.texteditor.ITextEditor;

public class BlitzMaxEditorColoringConfigurationBlock extends
    AbstractScriptEditorColoringConfigurationBlock implements
    IPreferenceConfigurationBlock {

	private static final String PREVIEW_FILE_NAME = "PreviewFile.txt"; //$NON-NLS-1$

	private static final String[][] syntaxColorListModel = new String[][] {
	    { PreferencesMessages.DLTKEditorPreferencePage_singleLineComment,
	        BlitzMaxPreferenceConstants.EDITOR_SINGLE_LINE_COMMENT_COLOR,
	        sCommentsCategory },
	    { PreferencesMessages.DLTKEditorPreferencePage_CommentTaskTags,
	        BlitzMaxPreferenceConstants.COMMENT_TASK_TAGS_COLOR,
	        sCommentsCategory },

	    { PreferencesMessages.DLTKEditorPreferencePage_keywords,
	        BlitzMaxPreferenceConstants.EDITOR_KEYWORD_COLOR, sCoreCategory },

	    { PreferencesMessages.DLTKEditorPreferencePage_strings,
	        BlitzMaxPreferenceConstants.EDITOR_STRING_COLOR, sCoreCategory },
	    { PreferencesMessages.DLTKEditorPreferencePage_default,
	        IBlitzMaxColorConstants.BLITZMAX_DEFAULT, sCoreCategory },
	    { PreferencesMessages.DLTKEditorPreferencePage_numbers,
	        BlitzMaxPreferenceConstants.EDITOR_NUMBER_COLOR, sCoreCategory },
	    { BlitzMaxPreferencesMessages.BlitzMaxClassVariable,
	        BlitzMaxPreferenceConstants.EDITOR_CLASS_VARIABLE_COLOR,
	        sCoreCategory },
	    { BlitzMaxPreferencesMessages.BlitzMaxInstanceVariable,
	        BlitzMaxPreferenceConstants.EDITOR_INSTANCE_VARIABLE_COLOR,
	        sCoreCategory },
	    { BlitzMaxPreferencesMessages.BlitzMaxGlobalVariable,
	        BlitzMaxPreferenceConstants.EDITOR_GLOBAL_VARIABLE_COLOR,
	        sCoreCategory },

	/*
	 * { PreferencesMessages.DLTKEditorPreferencePage_variables,
	 * BlitzMaxPreferenceConstants.EDITOR_VARIABLE_COLOR, sCoreCategory }
	 */};

	public BlitzMaxEditorColoringConfigurationBlock(OverlayPreferenceStore store) {
		super(store);
	}

	protected String[][] getSyntaxColorListModel() {
		return syntaxColorListModel;
	}

	protected ProjectionViewer createPreviewViewer(Composite parent,
	    IVerticalRuler verticalRuler, IOverviewRuler overviewRuler,
	    boolean showAnnotationsOverview, int styles, IPreferenceStore store) {
		return new ScriptSourceViewer(parent, verticalRuler, overviewRuler,
		    showAnnotationsOverview, styles, store);
	}

	protected ScriptSourceViewerConfiguration createSimpleSourceViewerConfiguration(
	    IColorManager colorManager, IPreferenceStore preferenceStore,
	    ITextEditor editor, boolean configureFormatter) {
		return new SimpleBlitzMaxSourceViewerConfiguration(colorManager,
		    preferenceStore, editor, IBlitzMaxPartitions.BLITZMAX_PARTITIONING,
		    configureFormatter);
	}

	protected void setDocumentPartitioning(IDocument document) {
		BlitzMaxDocumentSetupParticipant participant = new BlitzMaxDocumentSetupParticipant();
		participant.setup(document);
	}

	protected InputStream getPreviewContentReader() {
		return getClass().getResourceAsStream(PREVIEW_FILE_NAME);
	}

	protected ScriptTextTools getTextTools() {
		return BlitzMaxUIPlugin.getDefault().getTextTools();
	}

}
