package net.brucey.dltk.blitzmax.parser.ast;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.eclipse.dltk.ast.references.VariableReference;

public class BlitzMaxVariableReference extends VariableReference {

	public BlitzMaxVariableReference(Token n) {
		super(((CommonToken) n).getStartIndex(),
		    ((CommonToken) n).getStopIndex() - 1, n.getText());
	}

}
