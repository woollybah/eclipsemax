package net.brucey.dltk.blitzmax.ui.preferences;

import net.brucey.dltk.blitzmax.ui.BlitzMaxUIPlugin;

import org.eclipse.dltk.ui.preferences.AbstractConfigurationBlock;
import org.eclipse.dltk.ui.preferences.AbstractConfigurationBlockPreferencePage;
import org.eclipse.dltk.ui.preferences.IPreferenceConfigurationBlock;
import org.eclipse.dltk.ui.preferences.OverlayPreferenceStore;
import org.eclipse.dltk.ui.util.SWTFactory;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class BlitzMaxGlobalPreferencePage extends
    AbstractConfigurationBlockPreferencePage {

	protected IPreferenceConfigurationBlock createConfigurationBlock(
	    OverlayPreferenceStore overlayPreferenceStore) {
		return new AbstractConfigurationBlock(overlayPreferenceStore, this) {
			public Control createControl(Composite parent) {
				Composite composite = SWTFactory.createComposite(parent, parent
				    .getFont(), 1, 1, GridData.FILL_HORIZONTAL);
				return composite;
			}
		};
	}

	protected String getHelpId() {
		return null;
	}

	protected void setDescription() {
		setDescription(BlitzMaxPreferencesMessages.GlobalPreferencePageDescription);
	}

	protected void setPreferenceStore() {
		setPreferenceStore(BlitzMaxUIPlugin.getDefault().getPreferenceStore());
	}

}
