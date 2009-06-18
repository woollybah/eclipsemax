package net.brucey.dltk.blitzmax.ui.preferences;

import net.brucey.dltk.blitzmax.ui.BlitzMaxUIPlugin;

import org.eclipse.dltk.ui.preferences.AbstractConfigurationBlockPreferencePage;
import org.eclipse.dltk.ui.preferences.IPreferenceConfigurationBlock;
import org.eclipse.dltk.ui.preferences.OverlayPreferenceStore;

public class BlitzMaxEditorSyntaxColoringPreferencePage extends
    AbstractConfigurationBlockPreferencePage {

	protected String getHelpId() {
		return null;
	}

	protected void setDescription() {
		// leave blank
	}

	protected void setPreferenceStore() {
		setPreferenceStore(BlitzMaxUIPlugin.getDefault().getPreferenceStore());
	}

	protected IPreferenceConfigurationBlock createConfigurationBlock(
	    OverlayPreferenceStore overlayPreferenceStore) {
		return new BlitzMaxEditorColoringConfigurationBlock(overlayPreferenceStore);
	}
}
