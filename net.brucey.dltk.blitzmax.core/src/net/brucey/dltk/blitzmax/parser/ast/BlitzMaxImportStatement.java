package net.brucey.dltk.blitzmax.parser.ast;

import java.util.ArrayList;
import java.util.List;

import net.brucey.dltk.blitzmax.parser.ast.statements.SimpleStatement;

import org.antlr.runtime.Token;
import org.eclipse.dltk.ast.PositionInformation;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.utils.CorePrinter;

public class BlitzMaxImportStatement extends SimpleStatement {

	public BlitzMaxImportStatement(Token t, Expression expression) {
		super(0, 0, expression);
	}

	public int getKind() {
		return BlitzMaxConstants.S_IMPORT;
	}

	public void printNode(CorePrinter output) {

		output.formatPrintLn("import ");
		if (this.expression != null) {
			this.expression.printNode(output);
		}
	}

	public List/* < Expression > */getImports() {

		Expression imexpr = this.getExpression();
		List/* < Expression > */imports = new ArrayList/* < Expression > */();

		// FIXME
//		if (imexpr instanceof PythonTestListExpression) {
//			PythonTestListExpression testList = (PythonTestListExpression) imexpr;
//			imports = testList.getExpressions();
//		} else {
//			imports.add(imexpr);
//		}
		return imports;
	}

	public PositionInformation getPosition() {

		int start = sourceStart();
		int end = sourceEnd();
		return new PositionInformation(start, end, start, end);
	}
}
