package net.brucey.dltk.blitzmax.ui.editor;

import java.util.ArrayList;
import java.util.List;

import net.brucey.dltk.blitzmax.ui.text.RemRule;

import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;

public class BlitzMaxPartitionScanner extends RuleBasedPartitionScanner {

  public BlitzMaxPartitionScanner() {
    IToken string = new Token(IBlitzMaxPartitions.BLITZMAX_STRING);
    IToken comment = new Token(IBlitzMaxPartitions.BLITZMAX_COMMENT);
    IToken multilineComment = new Token(
        IBlitzMaxPartitions.BLITZMAX_MULTILINE_COMMENT);

    List rules = new ArrayList();

    rules.add(new SingleLineRule("\"", "\"", string));
    rules.add(new EndOfLineRule("'", comment));
    rules.add(new RemRule(multilineComment));
    // rules.add(new MultiLineRule("rem", "endrem", multilineComment));

    IPredicateRule[] result = new IPredicateRule[rules.size()];
    rules.toArray(result);
    setPredicateRules(result);
  }

  public int read() {
    int c = super.read();

    if (c != EOF) {
      c = Character.toLowerCase((char) c);
    }

    return c;
  }
}
