package net.brucey.dltk.blitzmax.parser.ast.expressions;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.DLTKToken;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.utils.CorePrinter;

public class CallHolder extends Expression {
	/**
	 * Can be EmptyExpression if no arguments are specified. Overwise it possible
	 * list of expressions, if only one argument too.
	 */
	private Expression fArguments = null;

	public CallHolder(int start, int end, Expression arguments) {

		super(start, end);
		this.fArguments = arguments;
	}

	public CallHolder(DLTKToken dltk, DLTKToken dltk2, Expression k) {
		super(dltk.getColumn(), dltk2.getColumn() + 1);
		this.fArguments = k;
	}

	public int getKind() {
		return Expression.E_CALL;
	}

	public void traverse(ASTVisitor pVisitor) throws Exception {
		if (pVisitor.visit(this)) {
			if (this.fArguments != null) {
				this.fArguments.traverse(pVisitor);
			}
			pVisitor.endvisit(this);
		}
	}

	public Expression getArguments() {
		return fArguments;
	}

	public void printNode(CorePrinter output) {
		output.formatPrintLn("( ");
		if (this.fArguments != null) {
			this.fArguments.printNode(output);
		}
		output.formatPrintLn(" )");
	}

}
