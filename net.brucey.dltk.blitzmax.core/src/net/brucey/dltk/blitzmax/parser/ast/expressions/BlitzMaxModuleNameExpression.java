package net.brucey.dltk.blitzmax.parser.ast.expressions;

import org.antlr.runtime.Token;
import org.eclipse.dltk.ast.expressions.Expression;

public class BlitzMaxModuleNameExpression extends Expression {

	private Token namespace;
	private Token modulename;
	
	public BlitzMaxModuleNameExpression(Token namespace, Token modulename) {
	  this.namespace = namespace;
	  this.modulename = modulename;
  }
	
	@Override
  public int getKind() {
	  // TODO Auto-generated method stub
	  return 0;
  }

}
