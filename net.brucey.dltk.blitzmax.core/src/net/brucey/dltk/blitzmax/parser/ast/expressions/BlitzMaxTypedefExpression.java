package net.brucey.dltk.blitzmax.parser.ast.expressions;

import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxTypeReference;

import org.eclipse.dltk.ast.expressions.Expression;

public class BlitzMaxTypedefExpression extends Expression {

	BlitzMaxTypeReference typeref;
	boolean isArray;
	
	public BlitzMaxTypedefExpression(BlitzMaxTypeReference nt, boolean at) {
	  super(nt.sourceStart(), nt.sourceEnd());
	  typeref = nt;
	  isArray = at;
  }

	@Override
	public int getKind() {
		// TODO Auto-generated method stub
		return 0;
	}

}
