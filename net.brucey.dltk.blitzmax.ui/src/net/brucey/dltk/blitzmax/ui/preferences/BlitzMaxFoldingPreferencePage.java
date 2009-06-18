package net.brucey.dltk.blitzmax.ui.preferences;

import net.brucey.dltk.blitzmax.ui.BlitzMaxUIPlugin;
import net.brucey.dltk.blitzmax.ui.text.folding.BlitzMaxFoldingPreferenceBlock;

import org.eclipse.dltk.ui.preferences.AbstractConfigurationBlockPreferencePage;
import org.eclipse.dltk.ui.preferences.IPreferenceConfigurationBlock;
import org.eclipse.dltk.ui.preferences.OverlayPreferenceStore;
import org.eclipse.dltk.ui.text.folding.DefaultFoldingPreferenceConfigurationBlock;
import org.eclipse.dltk.ui.text.folding.IFoldingPreferenceBlock;
import org.eclipse.jface.preference.PreferencePage;

public class BlitzMaxFoldingPreferencePage extends
    AbstractConfigurationBlockPreferencePage {

	protected IPreferenceConfigurationBlock createConfigurationBlock(
	    OverlayPreferenceStore overlayPreferenceStore) {
		return new DefaultFoldingPreferenceConfigurationBlock(
		    overlayPreferenceStore, this) {

			protected IFoldingPreferenceBlock createSourceCodeBlock(
			    OverlayPreferenceStore store, PreferencePage page) {
				return new BlitzMaxFoldingPreferenceBlock(store, page);
			}
		};
	}

	protected String getHelpId() {
		return null;
	}

	protected void setDescription() {
	}

	protected void setPreferenceStore() {
		setPreferenceStore(BlitzMaxUIPlugin.getDefault().getPreferenceStore());
	}

}
