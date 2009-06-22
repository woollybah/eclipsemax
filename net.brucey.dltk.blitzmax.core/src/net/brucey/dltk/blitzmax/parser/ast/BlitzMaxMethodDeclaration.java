package net.brucey.dltk.blitzmax.parser.ast;

import java.util.Iterator;
import java.util.List;

import net.brucey.dltk.blitzmax.parser.ast.expressions.BlitzMaxFunctionExpression;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.declarations.Argument;
import org.eclipse.dltk.ast.declarations.Declaration;
import org.eclipse.dltk.ast.declarations.MethodDeclaration;

public class BlitzMaxMethodDeclaration extends MethodDeclaration {

	BlitzMaxFunctionExpression func;

	public BlitzMaxMethodDeclaration(Token m, BlitzMaxFunctionExpression fd) {
		super(((CommonToken) m).getStartIndex(), (fd != null) ? fd.sourceEnd() : 0);

		if (fd != null) {
			func = fd;
			setName(func.getName());
			setNameStart(func.sourceStart());
			setNameEnd(func.sourceStart() + func.getName().length());

			List<Declaration> args = func.getArgs();
			if (args != null) {
				for (Iterator i = args.iterator(); i.hasNext();) {
					ASTNode arg = (ASTNode) i.next();

					if (arg instanceof BlitzMaxVariableDeclaration) {
						BlitzMaxVariableDeclaration dec = (BlitzMaxVariableDeclaration) arg;
						Argument a = new Argument();
						a.setName(dec.getName());
						addArgument(a);
					}
				}

			}
		}
	}

	public BlitzMaxFunctionExpression getFunc() {
		return func;
	}

}
