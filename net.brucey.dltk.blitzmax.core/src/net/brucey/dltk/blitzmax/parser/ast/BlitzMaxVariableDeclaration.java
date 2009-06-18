package net.brucey.dltk.blitzmax.parser.ast;

import net.brucey.dltk.blitzmax.parser.ast.expressions.BlitzMaxTypedefExpression;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.eclipse.dltk.ast.declarations.Declaration;

public class BlitzMaxVariableDeclaration extends Declaration {

	BlitzMaxTypedefExpression typedef;

	public BlitzMaxVariableDeclaration(Token n, BlitzMaxTypedefExpression t) {

		typedef = t;

		setName(n.getText());
		setStart(((CommonToken) n).getStartIndex());

		// may not be defined in the code...
		if (t != null) {
			setEnd(t.sourceEnd());
		} else {
			setEnd(((CommonToken) n).getStopIndex() - 1);
		}
	}

}
