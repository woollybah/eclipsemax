package net.brucey.dltk.blitzmax.core.parser;

import net.brucey.dltk.blitzmax.core.BlitzMaxNature;
import net.brucey.dltk.blitzmax.core.parser.visitors.BlitzMaxSourceElementRequestor;

import org.eclipse.dltk.compiler.SourceElementRequestVisitor;
import org.eclipse.dltk.core.AbstractSourceElementParser;
import org.eclipse.dltk.core.ISourceElementParser;

public class BlitzMaxSourceElementParser extends AbstractSourceElementParser
		implements ISourceElementParser {

	@Override
	protected String getNatureId() {
		return BlitzMaxNature.BLITZMAX_NATURE;
	}

/*	@Override
	public void parseSourceModule(ISourceModule module,
			ISourceModuleInfo astCache) {

		ISourceElementRequestor requestor = getRequestor();
		 
		requestor.enterModule();
		TypeInfo info = new TypeInfo();
		info.name = "BlitzMax type";
		requestor.enterType(info);
		requestor.exitType(0);
		requestor.exitModule(0);
		
	}*/
	
	protected SourceElementRequestVisitor createVisitor() {
		return new BlitzMaxSourceElementRequestor(getRequestor());
	}

}
