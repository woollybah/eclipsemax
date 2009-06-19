package net.brucey.dltk.blitzmax.ui.text;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;

public class RemRule extends MultiLineRule {

  private static final String REM = "rem"; //$NON-NLS-1$

  private static final String ENDREM = "endrem"; //$NON-NLS-1$

  protected char[] fEndSequence2 = "end rem".toCharArray();

  /**
   * @param token
   */
  public RemRule(IToken token) {
    super(REM, ENDREM, token);
    setColumnConstraint(-1);
  }

  protected boolean endSequenceDetected(ICharacterScanner scanner) {
    int readCount = 1;
    int c;
    while ((c = scanner.read()) != ICharacterScanner.EOF) {
      if (fEndSequence.length > 0 && c == fEndSequence[0]) {
          //&& scanner.getColumn() == fColumn + 1) {
        // Check if the specified end sequence has been found.
        if (sequenceDetected(scanner, fEndSequence2, true))
          return true;
        if (sequenceDetected(scanner, fEndSequence, true))
          return true;
      }
      readCount++;
    }
    for (; readCount > 0; readCount--)
      scanner.unread();
    return false;
  }
}
