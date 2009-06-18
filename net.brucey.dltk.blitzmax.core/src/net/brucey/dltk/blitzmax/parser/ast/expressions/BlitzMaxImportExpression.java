package net.brucey.dltk.blitzmax.parser.ast.expressions;

import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxConstants;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.utils.CorePrinter;

public class BlitzMaxImportExpression extends Expression {

	private Token name;

	public BlitzMaxImportExpression(Token t) {
		super(((CommonToken)t).getStartIndex(), ((CommonToken)t).getStopIndex() - 1);
		name = t;
	}

	public int getKind() {

		return BlitzMaxConstants.E_IMPORT;
	}

	public void traverse(ASTVisitor pVisitor) throws Exception {

		if (pVisitor.visit(this)) {
			pVisitor.endvisit(this);
		}

	}

	public String getName() {

		if (this.name != null) {
			return this.name.getText();
		} else {
			return null;
		}
	}

	public void printNode(CorePrinter output) {

		if (this.name != null) {
			output.formatPrintLn(this.name.getText());
		}
	}

	public String toString() {

		String text = "BlitzMax Import Expression:";
		if (this.name != null) {
			text += this.name;
		}
		return text;
	}
}
