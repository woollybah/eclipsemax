package net.brucey.dltk.blitzmax.parser.ast;

import org.eclipse.dltk.ast.declarations.ModuleDeclaration;
import org.eclipse.dltk.ast.declarations.TypeDeclaration;

public class BlitzMaxModuleDeclaration extends ModuleDeclaration {

	public BlitzMaxModuleDeclaration(int sourceLength) {
		super(sourceLength);
	}

	public BlitzMaxModuleDeclaration(int length, boolean rebuild) {
		super(length, rebuild);
	}

	public void addType(TypeDeclaration type) {
		getTypeList().add(type);
	}
}
