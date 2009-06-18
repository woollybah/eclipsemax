package net.brucey.dltk.blitzmax.parser.ast.statements;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.statements.Statement;

public abstract class SimpleStatement extends Statement {

	protected Expression expression;

	protected SimpleStatement(int start, int end, Expression expression) {
		super(start, end);
		this.expression = expression;
	}

//	public SimpleStatement(DLTKToken token, Expression expression) {
//		super(token);
//		this.expression = expression;
//		if (expression != null && expression.sourceEnd() > this.sourceEnd()) {
//			this.setEnd(expression.sourceEnd());
//		}
//	}

	public void traverse(ASTVisitor pVisitor) throws Exception {
		if (pVisitor.visit(this)) {
			if (expression != null) {
				expression.traverse(pVisitor);
			}
			pVisitor.endvisit(this);
		}
	}

	public Expression getExpression() {
		return expression;
	}

}
