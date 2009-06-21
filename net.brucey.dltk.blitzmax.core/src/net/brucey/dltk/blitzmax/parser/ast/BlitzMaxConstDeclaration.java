package net.brucey.dltk.blitzmax.parser.ast;

import org.eclipse.dltk.ast.Modifiers;
import org.eclipse.dltk.ast.declarations.Declaration;

public class BlitzMaxConstDeclaration extends BlitzMaxBaseVariableDeclaration {

	public BlitzMaxConstDeclaration(Declaration arg) {
		super(arg);
		
		setModifiers(getModifiers() | Modifiers.AccConstant);
	}

}
