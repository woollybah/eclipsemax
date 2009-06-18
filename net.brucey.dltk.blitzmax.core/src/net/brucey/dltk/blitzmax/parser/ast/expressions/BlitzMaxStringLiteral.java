package net.brucey.dltk.blitzmax.parser.ast.expressions;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.eclipse.dltk.ast.expressions.StringLiteral;

public class BlitzMaxStringLiteral extends StringLiteral {

	public BlitzMaxStringLiteral(Token t) {
		super(((CommonToken) t).getStartIndex(),
		    ((CommonToken) t).getStopIndex() - 1, t.getText());
	}

}
