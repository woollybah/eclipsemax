package net.brucey.dltk.blitzmax.parser.ast;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.declarations.Declaration;
import org.eclipse.dltk.ast.declarations.FieldDeclaration;

public class BlitzMaxBaseVariableDeclaration extends FieldDeclaration {

	protected Declaration typedef;

	public BlitzMaxBaseVariableDeclaration(Declaration arg) {
		super(null, 0, 0, 0, 0);
		typedef = arg;

		if (typedef instanceof BlitzMaxVariableDeclaration) {
			BlitzMaxVariableDeclaration v = (BlitzMaxVariableDeclaration) typedef;

			setName(v.getName());
			setNameStart(typedef.getNameStart());
			setNameEnd(typedef.getNameEnd());
			setStart(v.sourceStart());
			setEnd(v.sourceEnd());

		}
	}
	
	public void traverse(ASTVisitor pVisitor) throws Exception {
		if (pVisitor.visit(this)) {
			pVisitor.endvisit(this);
		}
	}

}
