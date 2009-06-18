package net.brucey.dltk.blitzmax.search;

import org.eclipse.dltk.core.ISearchFactory;
import org.eclipse.dltk.core.search.AbstractSearchFactory;
import org.eclipse.dltk.core.search.IMatchLocatorParser;
import org.eclipse.dltk.core.search.matching.MatchLocator;

public class BlitzMaxSearchFactory extends AbstractSearchFactory implements
    ISearchFactory {

	public IMatchLocatorParser createMatchParser(MatchLocator locator) {
		return new BlitzMaxMatchLocationParser(locator);
	}

}
