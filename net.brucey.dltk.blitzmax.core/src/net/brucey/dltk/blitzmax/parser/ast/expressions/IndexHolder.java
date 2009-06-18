package net.brucey.dltk.blitzmax.parser.ast.expressions;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.DLTKToken;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.utils.CorePrinter;

public class IndexHolder extends Expression {
	private Expression fIndex;

	public IndexHolder(int start, int end, Expression indexExpression) {
		super(start, end);
		this.fIndex = indexExpression;
	}

	public IndexHolder(DLTKToken dltk, DLTKToken dltk2, Expression k) {
		super(dltk.getColumn(), dltk2.getColumn() + 1);
		this.fIndex = k;
	}

	public int getKind() {
		return Expression.E_INDEX;
	}

	public void traverse(ASTVisitor pVisitor) throws Exception {
		if (pVisitor.visit(this)) {
			if (this.fIndex != null) {
				this.fIndex.traverse(pVisitor);
			}
			pVisitor.endvisit(this);
		}
	}

	public void printNode(CorePrinter output) {
		output.formatPrintLn("[");
		if (this.fIndex != null) {
			this.fIndex.printNode(output);
		}
		output.formatPrintLn("]");
	}

}
