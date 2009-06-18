package net.brucey.dltk.blitzmax.core.parser;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;

public class ANTLRNoCaseStringStream extends ANTLRStringStream {

	public ANTLRNoCaseStringStream(String s) {
		super(s);
	}

	public int LA(int i) {
		if (i == 0) {
			return 0; // undefined
		}
		if (i < 0) {
			i++; // e.g., translate LA(-1) to use offset 0
		}

		if ((p + i - 1) >= n) {

			return CharStream.EOF;
		}
		return Character.toLowerCase(data[p + i - 1]);
	}

}
