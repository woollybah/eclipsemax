package net.brucey.dltk.blitzmax.parser.ast;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.references.TypeReference;

public class BlitzMaxTypeReference extends TypeReference {

	Expression exp;
	boolean isPointer = false;

	public BlitzMaxTypeReference(Expression e) {
		super(e.sourceStart(), e.sourceEnd(), e.toString());
		exp = e;
	}

	public BlitzMaxTypeReference(Token sup) {
		super(((CommonToken) sup).getStartIndex(),((CommonToken) sup).getStopIndex()+1,
		sup.getText());
		exp = new TypeReference(((CommonToken) sup).getStartIndex(),((CommonToken) sup).getStopIndex()+1,
				sup.getText());
  }

	@Override
	public void traverse(ASTVisitor pVisitor) throws Exception {
		if (pVisitor.visit(this)) {
			if (exp != null) {
				exp.traverse(pVisitor);
			}
			pVisitor.endvisit(this);
		}
	}
}
