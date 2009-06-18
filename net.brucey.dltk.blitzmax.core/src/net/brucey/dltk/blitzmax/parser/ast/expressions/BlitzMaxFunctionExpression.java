package net.brucey.dltk.blitzmax.parser.ast.expressions;

import java.util.Iterator;
import java.util.List;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.declarations.Declaration;
import org.eclipse.dltk.ast.references.SimpleReference;

public class BlitzMaxFunctionExpression extends SimpleReference {

	Token name;
	BlitzMaxTypedefExpression typedef;
	List<Declaration> args;

	public BlitzMaxFunctionExpression(Token name, BlitzMaxTypedefExpression t,
	    List<Declaration> args, Token rp) {
		super(((CommonToken) name).getStartIndex(), ((CommonToken) rp)
		    .getStopIndex() - 1, name.getText());

		typedef = t;
		this.args = args;

	}

	@Override
	public int getKind() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void traverse(ASTVisitor pVisitor) throws Exception {
		if (pVisitor.visit(this)) {
			if (typedef != null) {
				typedef.traverse(pVisitor);
			}

			if (args != null) {
				for (Iterator i = args.iterator(); i.hasNext();) {
					Declaration dec = (Declaration) i.next();
					dec.traverse(pVisitor);
				}
			}

			pVisitor.endvisit(this);
		}
	}

	public List<Declaration> getArgs() {
	  return args;
  }

}
