package net.brucey.dltk.blitzmax.ui.text;

import org.eclipse.jface.text.rules.IWhitespaceDetector;

public class BlitzMaxWhitespaceDetector implements IWhitespaceDetector {
  public boolean isWhitespace(char character) {
    return Character.isWhitespace(character);
  }
}
