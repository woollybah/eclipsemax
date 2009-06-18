package net.brucey.dltk.blitzmax.ui.templates;

import net.brucey.dltk.blitzmax.ui.BlitzMaxUIPlugin;

import org.eclipse.dltk.ui.templates.ScriptTemplateAccess;
import org.eclipse.jface.preference.IPreferenceStore;

public class BlitzMaxTemplateAccess extends ScriptTemplateAccess {

	private static final String CUSTOM_TEMPLATES_KEY = "net.brucey.dtlk.blitzmax.Templates";

	private static BlitzMaxTemplateAccess instance;

	public static BlitzMaxTemplateAccess getInstance() {
		if (instance == null) {
			instance = new BlitzMaxTemplateAccess();
		}

		return instance;
	}

	protected String getContextTypeId() {
		return BlitzMaxUniversalTemplateContextType.CONTEXT_TYPE_ID;
	}

	protected String getCustomTemplatesKey() {
		return CUSTOM_TEMPLATES_KEY;
	}

	protected IPreferenceStore getPreferenceStore() {
		return BlitzMaxUIPlugin.getDefault().getPreferenceStore();
	}

}
