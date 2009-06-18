package net.brucey.dltk.blitzmax.parser.ast;

import net.brucey.dltk.blitzmax.parser.ast.statements.BlockStatement;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.declarations.Declaration;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.statements.Block;

public class BlitzMaxForStatement extends BlockStatement {

	// values of FORTYPE_TO, FORTYPE_UNTIL or FORTYPE_EACHIN
	int forType;

	Expression fromExpression;
	Expression toExpression;
	Expression stepExpression;

	public BlitzMaxForStatement(Declaration e, Expression n) {
		super(e.sourceStart(), e.sourceEnd(), null);
		fromExpression = n;
	}

	@Override
	public int getKind() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setToExpr(Expression to) {
		toExpression = to;
	}

	public void setStepExpr(Expression sexp) {
		stepExpression = sexp;
	}

	public void setBlock(Block sb) {
		statements = sb;
	}

	public void traverse(ASTVisitor pVisitor) throws Exception {
		if (pVisitor.visit(this)) {
			if (fromExpression != null) {
				fromExpression.traverse(pVisitor);
			}
			if (toExpression != null) {
				toExpression.traverse(pVisitor);
			}
			if (stepExpression != null) {
				stepExpression.traverse(pVisitor);
			}
			pVisitor.endvisit(this);
		}
	}

	public void setForType(int fortypeEachin) {
		forType = fortypeEachin;
	}

}
