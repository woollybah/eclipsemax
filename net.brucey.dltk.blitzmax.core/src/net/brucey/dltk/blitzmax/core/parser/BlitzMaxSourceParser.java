package net.brucey.dltk.blitzmax.core.parser;

import net.brucey.dltk.blitzmax.core.parsers.DLTKBlitzMaxErrorReporter;
import net.brucey.dltk.blitzmax.core.parsers.blitzmaxLexer;
import net.brucey.dltk.blitzmax.core.parsers.blitzmaxParser;
import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxModuleDeclaration;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.dltk.ast.declarations.ModuleDeclaration;
import org.eclipse.dltk.ast.parser.AbstractSourceParser;
import org.eclipse.dltk.compiler.problem.IProblemReporter;
import org.eclipse.dltk.core.DLTKCore;

public class BlitzMaxSourceParser extends AbstractSourceParser {

	private TokenStream tokenStream;
	private IProblemReporter problemReporter = null;

	public BlitzMaxSourceParser() {
		// TODO Auto-generated constructor stub
	}

	public static class Lexer extends blitzmaxLexer {
		public Lexer(CharStream lexer) {
			super(lexer);
		}

		public Token nextToken() {
			startPos = getCharPositionInLine();
			return super.nextToken();
		}
	}

	public ModuleDeclaration parse(char[] fileName, char[] source,
	    IProblemReporter reporter) {
		this.problemReporter = reporter;

		BlitzMaxModuleDeclaration moduleDeclaration = new BlitzMaxModuleDeclaration(
		    source.length, true);

		CharStream st = new ANTLRNoCaseStringStream(new String(source));
		blitzmaxLexer lexer = new Lexer(st);

		CommonTokenStream tokens = new CommonTokenStream(lexer);
		tokens.discardOffChannelTokens(true);
		//BlitzMaxTokenStream indentedSource = new BlitzMaxTokenStream(tokens);
		//tokens = new CommonTokenStream(indentedSource);
		this.tokenStream = tokens;

		blitzmaxParser bmxParser = new blitzmaxParser(this.tokenStream);
		bmxParser.decl = moduleDeclaration;
		bmxParser.length = source.length;
		// bmxParser.converter = new DLTKTokenConverter(content0);
		bmxParser.reporter = new DLTKBlitzMaxErrorReporter(problemReporter,
		    bmxParser);

		try {
			bmxParser.file_input();
		} catch (Throwable e) {
			if (DLTKCore.DEBUG_PARSER) {
				e.printStackTrace();
			}
		}
		moduleDeclaration.rebuild();

		return moduleDeclaration;

	}

}
