package net.brucey.dltk.blitzmax.parser.ast.expressions;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.eclipse.dltk.ast.expressions.NumericLiteral;

public class BlitzMaxNumericLiteral extends NumericLiteral {

	public BlitzMaxNumericLiteral(Token t) {
		super(((CommonToken) t).getStartIndex(),
		    ((CommonToken) t).getStopIndex() - 1, Long.getLong(t.getText())
		        .longValue());
	}

	public BlitzMaxNumericLiteral(Token t, long value) {
		super(((CommonToken) t).getStartIndex(),
		    ((CommonToken) t).getStopIndex() - 1, value);
	}

	public BlitzMaxNumericLiteral(Token s, Token n) {
		super((s != null) ? ((CommonToken) s).getStartIndex() : ((CommonToken) n)
		    .getStartIndex(), ((CommonToken) n).getStopIndex() - 1, 0);
	}

}
