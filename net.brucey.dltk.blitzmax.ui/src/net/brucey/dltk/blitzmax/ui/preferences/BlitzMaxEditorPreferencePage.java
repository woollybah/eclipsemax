package net.brucey.dltk.blitzmax.ui.preferences;

import net.brucey.dltk.blitzmax.ui.BlitzMaxUIPlugin;

import org.eclipse.dltk.ui.preferences.AbstractConfigurationBlockPreferencePage;
import org.eclipse.dltk.ui.preferences.EditorConfigurationBlock;
import org.eclipse.dltk.ui.preferences.IPreferenceConfigurationBlock;
import org.eclipse.dltk.ui.preferences.OverlayPreferenceStore;

public class BlitzMaxEditorPreferencePage extends
    AbstractConfigurationBlockPreferencePage {

	protected String getHelpId() {
		return null;
	}

	protected void setDescription() {
		setDescription(BlitzMaxPreferencesMessages.EditorPreferencePageDescription);
	}

	protected void setPreferenceStore() {
		setPreferenceStore(BlitzMaxUIPlugin.getDefault().getPreferenceStore());
	}

	protected IPreferenceConfigurationBlock createConfigurationBlock(
	    OverlayPreferenceStore overlayPreferenceStore) {
		return new EditorConfigurationBlock(this, overlayPreferenceStore,
		    EditorConfigurationBlock.FLAG_TAB_ALWAYS_INDENT);
	}

}
