package net.brucey.dltk.blitzmax.core.parser;

import org.eclipse.dltk.ast.declarations.ModuleDeclaration;
import org.eclipse.dltk.ast.parser.AbstractSourceParser;
import org.eclipse.dltk.ast.parser.ISourceParser;
import org.eclipse.dltk.ast.parser.ISourceParserFactory;
import org.eclipse.dltk.compiler.problem.IProblemReporter;

public class BlitzMaxSourceParserFactory implements
		ISourceParserFactory {

	public BlitzMaxSourceParserFactory() {
		// TODO Auto-generated constructor stub
	}

	public ISourceParser createSourceParser() {
		return new BlitzMaxSourceParser();
	}

}
