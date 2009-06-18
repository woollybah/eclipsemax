package net.brucey.dltk.blitzmax.ui.search;

import net.brucey.dltk.blitzmax.core.BlitzMaxLanguageToolkit;

import org.eclipse.dltk.core.IDLTKLanguageToolkit;
import org.eclipse.dltk.ui.search.ScriptSearchPage;
import org.eclipse.search.ui.ISearchPage;

public class BlitzMaxSearchPage extends ScriptSearchPage implements ISearchPage {

	protected IDLTKLanguageToolkit getLanguageToolkit() {
		return BlitzMaxLanguageToolkit.getDefault();
	}

}
