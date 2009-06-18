package net.brucey.dltk.blitzmax.parser.ast;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.eclipse.dltk.ast.expressions.Expression;

public class BlitzMaxPrimitiveType extends Expression {

	int pointers = 0;
	BlitzMaxType type;

	public BlitzMaxPrimitiveType(Token t, int c, BlitzMaxType type) {
		super(((CommonToken) t).getStartIndex(),
		    ((CommonToken) t).getStopIndex() - 1);
		
		pointers = c;
		this.type = type;
		
	}

	@Override
	public int getKind() {
		// TODO Auto-generated method stub
		return 0;
	}

}
