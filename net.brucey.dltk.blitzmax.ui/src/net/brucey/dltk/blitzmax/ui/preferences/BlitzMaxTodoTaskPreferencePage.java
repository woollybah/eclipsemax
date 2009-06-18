package net.brucey.dltk.blitzmax.ui.preferences;

import net.brucey.dltk.blitzmax.core.BlitzMaxNature;
import net.brucey.dltk.blitzmax.ui.BlitzMaxUIPlugin;

import org.eclipse.core.resources.IProject;
import org.eclipse.dltk.ui.preferences.AbstractConfigurationBlockPropertyAndPreferencePage;
import org.eclipse.dltk.ui.preferences.AbstractOptionsBlock;
import org.eclipse.dltk.ui.preferences.AbstractTodoTaskOptionsBlock;
import org.eclipse.dltk.ui.preferences.PreferenceKey;
import org.eclipse.dltk.ui.util.IStatusChangeListener;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.preferences.IWorkbenchPreferenceContainer;

public class BlitzMaxTodoTaskPreferencePage extends
    AbstractConfigurationBlockPropertyAndPreferencePage {

	static final PreferenceKey CASE_SENSITIVE = AbstractTodoTaskOptionsBlock
	    .createCaseSensitiveKey(BlitzMaxUIPlugin.PLUGIN_ID);

	static final PreferenceKey ENABLED = AbstractTodoTaskOptionsBlock
	    .createEnabledKey(BlitzMaxUIPlugin.PLUGIN_ID);

	static final PreferenceKey TAGS = AbstractTodoTaskOptionsBlock
	    .createTagKey(BlitzMaxUIPlugin.PLUGIN_ID);

	protected String getHelpId() {
		return null;
	}

	protected void setDescription() {
		setDescription(BlitzMaxPreferencesMessages.TodoTaskDescription);
	}

	@Override
	public IPreferenceStore getPreferenceStore() {
		return BlitzMaxUIPlugin.getDefault().getPreferenceStore();
	}

	protected AbstractOptionsBlock createOptionsBlock(
	    IStatusChangeListener newStatusChangedListener, IProject project,
	    IWorkbenchPreferenceContainer container) {
		return new AbstractTodoTaskOptionsBlock(newStatusChangedListener, project,
		    getPreferenceKeys(), container) {
			protected PreferenceKey getTags() {
				return TAGS;
			}

			protected PreferenceKey getEnabledKey() {
				return ENABLED;
			}

			protected PreferenceKey getCaseSensitiveKey() {
				return CASE_SENSITIVE;
			}
		};
	}

	protected String getNatureId() {
		return BlitzMaxNature.BLITZMAX_NATURE;
	}

	protected String getProjectHelpId() {
		return null;
	}

	protected void setPreferenceStore() {
		setPreferenceStore(BlitzMaxUIPlugin.getDefault().getPreferenceStore());
	}

	protected String getPreferencePageId() {
		return "net.brucey.dltk.blitzmax.preferences.todo"; //$NON-NLS-1$
	}

	protected String getPropertyPageId() {
		return "net.brucey.dltk.blitzmax.propertyPage.todo"; //$NON-NLS-1$
	}

	protected PreferenceKey[] getPreferenceKeys() {
		return new PreferenceKey[] { TAGS, ENABLED, CASE_SENSITIVE };
	}
}
