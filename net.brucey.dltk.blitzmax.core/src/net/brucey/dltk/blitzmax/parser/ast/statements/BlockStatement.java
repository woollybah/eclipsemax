package net.brucey.dltk.blitzmax.parser.ast.statements;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.statements.Block;

public class BlockStatement extends SimpleStatement {

	protected Block statements;

	protected BlockStatement(int start, int end, Expression expression) {
		super(start, end, expression);
	}

	@Override
	public int getKind() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void traverse(ASTVisitor pVisitor) throws Exception {
		if (pVisitor.visit(this)) {
			if (statements != null) {
				statements.traverse(pVisitor);
			}
			pVisitor.endvisit(this);
		}
	}

}
