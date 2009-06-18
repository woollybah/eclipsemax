package net.brucey.dltk.blitzmax.ui;

import net.brucey.dltk.blitzmax.ui.BlitzMaxUIPlugin;
import net.brucey.dltk.blitzmax.core.BlitzMaxLanguageToolkit;
import net.brucey.dltk.blitzmax.ui.editor.BlitzMaxEditor;
import net.brucey.dltk.blitzmax.ui.editor.BlitzMaxSimpleSourceViewerConfiguration;
import net.brucey.dltk.blitzmax.ui.editor.IBlitzMaxPartitions;

import org.eclipse.dltk.core.IDLTKLanguageToolkit;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.ui.AbstractDLTKUILanguageToolkit;
import org.eclipse.dltk.ui.IDLTKUILanguageToolkit;
import org.eclipse.dltk.ui.ScriptElementLabels;
import org.eclipse.dltk.ui.text.ScriptSourceViewerConfiguration;
import org.eclipse.dltk.ui.text.ScriptTextTools;
import org.eclipse.dltk.ui.viewsupport.ScriptUILabelProvider;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.preference.IPreferenceStore;

public class BlitzMaxUILanguageToolkit extends AbstractDLTKUILanguageToolkit
    implements IDLTKUILanguageToolkit {

	private static class BlitzMaxScriptElementLabels extends ScriptElementLabels {
		public void getElementLabel(IModelElement element, long flags,
		    StringBuffer buf) {
			StringBuffer buffer = new StringBuffer(60);
			super.getElementLabel(element, flags, buffer);
			String s = buffer.toString();
			if (s != null && !s.startsWith(element.getElementName())) {
				if (s.indexOf('.') != -1) {
					s = s.replaceAll("\\.", ".");
				}
			}
			buf.append(s);
		}

		protected char getTypeDelimiter() {
			return '.';
		}
	};

	@Override
	public ScriptSourceViewerConfiguration createSourceViewerConfiguration() {
		return new BlitzMaxSimpleSourceViewerConfiguration(getTextTools()
		    .getColorManager(), getPreferenceStore(), null, getPartitioningId(),
		    false);
	}

	public ScriptElementLabels getScriptElementLabels() {
		return new BlitzMaxScriptElementLabels();
	}

	private static BlitzMaxUILanguageToolkit toolkit = null;

	public static IDLTKUILanguageToolkit getInstance() {
		if (toolkit == null) {
			toolkit = new BlitzMaxUILanguageToolkit();
		}
		return toolkit;
	}

	public IDLTKLanguageToolkit getCoreToolkit() {
		return BlitzMaxLanguageToolkit.getDefault();
	}

	public IDialogSettings getDialogSettings() {
		return BlitzMaxUIPlugin.getDefault().getDialogSettings();
	}

	public IPreferenceStore getPreferenceStore() {
		return BlitzMaxUIPlugin.getDefault().getPreferenceStore();
	}

	public String getEditorId(Object inputElement) {
		return BlitzMaxEditor.EDITOR_ID;
	}

	private static final String[] EDITOR_PREFERENCE_PAGES_IDS = {
	    "net.brucey.dltk.blitzmax.preferences.editor", //$NON-NLS-1$
	    "net.brucey.dltk.blitzmax.preferences.editor.folding", //$NON-NLS-1$
	    "net.brucey.dltk.blitzmax.preferences.editor.syntaxcoloring", //$NON-NLS-1$ 
	    "net.brucey.dltk.blitzmax.preferences.templates" //$NON-NLS-1$
	};

	public String[] getEditorPreferencePages() {
		return EDITOR_PREFERENCE_PAGES_IDS;
	}

	public String getPartitioningId() {
		return IBlitzMaxPartitions.BLITZMAX_PARTITIONING;
	}

	public ScriptUILabelProvider createScriptUILabelProvider() {
		return null;
	}

	public boolean getProvideMembers(ISourceModule element) {
		return true;
	}

	public ScriptTextTools getTextTools() {
		return BlitzMaxUIPlugin.getDefault().getTextTools();
	}

}
