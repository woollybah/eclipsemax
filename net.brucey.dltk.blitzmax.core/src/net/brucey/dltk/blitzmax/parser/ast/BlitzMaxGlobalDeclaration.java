package net.brucey.dltk.blitzmax.parser.ast;

import org.eclipse.dltk.ast.Modifiers;
import org.eclipse.dltk.ast.declarations.Declaration;

public class BlitzMaxGlobalDeclaration extends BlitzMaxBaseVariableDeclaration {

	public BlitzMaxGlobalDeclaration(Declaration arg) {
		super(arg);
		
		setModifiers(getModifiers() | Modifiers.AccStatic);
	}

}
