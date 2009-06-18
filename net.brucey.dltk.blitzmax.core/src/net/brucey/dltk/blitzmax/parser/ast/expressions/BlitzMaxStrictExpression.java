package net.brucey.dltk.blitzmax.parser.ast.expressions;

import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxConstants;

import org.eclipse.dltk.ast.expressions.Expression;

public class BlitzMaxStrictExpression extends Expression {

	boolean isSuper;
	
	public BlitzMaxStrictExpression(boolean isSuper) {
	 this.isSuper = isSuper;
  }
	
	@Override
  public int getKind() {
		if (isSuper) {
			return BlitzMaxConstants.E_STRICT;
		} else {
			return BlitzMaxConstants.E_SUPERSTRICT;
		}
  }

}
