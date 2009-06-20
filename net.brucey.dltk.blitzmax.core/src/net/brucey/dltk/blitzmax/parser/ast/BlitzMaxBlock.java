package net.brucey.dltk.blitzmax.parser.ast;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.statements.Block;
import org.eclipse.dltk.utils.CorePrinter;

public class BlitzMaxBlock extends Block {

	LinkedList list;

	public BlitzMaxBlock() {
		list = new LinkedList();
	}

	@Override
	public List getStatements() {
		return list;
	}

	public LinkedList getList() {
		return list;
	}

	public void traverse(ASTVisitor visitor) throws Exception {
		if (visitor.visit(this)) {
			Iterator it = list.iterator();
			while (it.hasNext()) {
				ASTNode node = (ASTNode) it.next();
				node.traverse(visitor);
			}
			visitor.endvisit(this);
		}
	}

	public void addStatement(ASTNode statem) {
		if (statem == null) {
			throw new IllegalArgumentException();
		}

		list.add(statem);
	}

	public void printNode(CorePrinter output) {
		output.indent();
		Iterator it = list.iterator();
		while (it.hasNext()) {
			((ASTNode) it.next()).printNode(output);
			output.formatPrint(""); //$NON-NLS-1$
		}
		output.formatPrint(""); //$NON-NLS-1$
		output.dedent();
	}

}
