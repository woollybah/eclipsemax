package net.brucey.dltk.blitzmax.parser.ast;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.eclipse.dltk.ast.expressions.Expression;

public class BlitzMaxObjectType extends Expression {

	public BlitzMaxObjectType(Token t) {
		super(((CommonToken) t).getStartIndex(),
		    ((CommonToken) t).getStopIndex() + 1);
  }
	
	@Override
	public int getKind() {
		// TODO Auto-generated method stub
		return 0;
	}

}
