package net.brucey.dltk.blitzmax.parser.ast;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.eclipse.dltk.ast.expressions.StringLiteral;

public class BlitzMaxStringLiteral extends StringLiteral {

	public BlitzMaxStringLiteral(Token value) {
		super(((CommonToken) value).getStartIndex(), ((CommonToken) value)
		    .getStopIndex() + 1, value.getText());
	}

}
