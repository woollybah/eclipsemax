package net.brucey.dltk.blitzmax.ui.templates;

import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.ui.templates.ScriptTemplateContext;
import org.eclipse.dltk.ui.templates.ScriptTemplateContextType;
import org.eclipse.jface.text.IDocument;

public class BlitzMaxUniversalTemplateContextType extends
    ScriptTemplateContextType {

	public static final String CONTEXT_TYPE_ID = "blitzMaxUniversalTemplateContextType";

	public BlitzMaxUniversalTemplateContextType() {
	}

	public BlitzMaxUniversalTemplateContextType(String id, String name) {
		super(id, name);
	}

	public BlitzMaxUniversalTemplateContextType(String id) {
		super(id);
	}

	public ScriptTemplateContext createContext(IDocument document,
	    int completionPosition, int length, ISourceModule sourceModule) {
		return new BlitzMaxTemplateContext(this, document, completionPosition,
		    length, sourceModule);
	}

}
