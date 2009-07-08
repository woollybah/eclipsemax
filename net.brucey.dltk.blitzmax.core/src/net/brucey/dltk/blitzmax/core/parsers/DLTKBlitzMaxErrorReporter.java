package net.brucey.dltk.blitzmax.core.parsers;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.eclipse.dltk.compiler.problem.DefaultProblem;
import org.eclipse.dltk.compiler.problem.IProblemReporter;
import org.eclipse.dltk.compiler.problem.ProblemSeverities;

public class DLTKBlitzMaxErrorReporter {

  IProblemReporter reporter;
  blitzmaxParser parser;
  @SuppressWarnings("unchecked")
  List problems = new ArrayList();

  public DLTKBlitzMaxErrorReporter(IProblemReporter reporter,
      blitzmaxParser parser) {
    this.reporter = reporter;
    this.parser = parser;
  }

  @SuppressWarnings("unchecked")
  public void reportError(RecognitionException re) {
    if (reporter == null) {
      return;
    }
    String message = re.getMessage();
    if (re instanceof NoViableAltException) {
      NoViableAltException ec = (NoViableAltException) re;
      String[] messages = { "Syntax Error:" + message, ec.token.getText() };
      int st = ((CommonToken) (ec.token)).getStartIndex();
      String sm = ec.token.getText();
      int et = st + ((sm != null) ? sm.length() : 1);
      if (st == -1)
        return;
      // reporter.handle(CompilerOptions.OFFSET, messages, messages,
      // st, et);
      DefaultProblem defaultProblem = new DefaultProblem("", messages[0], 0,
          new String[] {}, ProblemSeverities.Error, st, et, ec.token.getLine());
      if (!problems.contains(defaultProblem)) {
        reporter.reportProblem(defaultProblem);
        problems.add(defaultProblem);
      }
    } else if (re instanceof MismatchedTokenException) {
      MismatchedTokenException ec = (MismatchedTokenException) re;
      if (message == null) {
        message = "mismatched input "
            + this.parser.getTokenErrorDisplay(ec.token);
        // return;
      }
      String[] messages = { "Syntax Error:" + message, message,
          ec.token.getText() };
      int st = ((CommonToken) (ec.token)).getStartIndex();
      String sm = ec.token.getText();
      int et = st + ((sm != null) ? sm.length() : 1);
      // if (et >= ((CommonToken) (ec.token)).getStopIndex()
      // - ((CommonToken) (ec.token)).getStartIndex()) {
      // et = (((CommonToken) (ec.token)).getStopIndex() - ((CommonToken)
      // (ec.token))
      // .getStartIndex()) - 1;
      // st -= 2;
      // }
      // reporter.handle(CompilerOptions.OFFSET, messages, messages,
      // st, et);
      DefaultProblem defaultProblem = new DefaultProblem("", messages[0], 0,
          new String[] {}, ProblemSeverities.Error, st, et, ec.line);
      if (!problems.contains(defaultProblem)) {
        reporter.reportProblem(defaultProblem);
        problems.add(defaultProblem);
      }
    } else {
      String[] messages = { "Syntax Error:" + message, message };
      int st = ((CommonToken) (re.token)).getStartIndex();
      int et = st + 1;
      // reporter.handle(CompilerOptions.OFFSET, messages, messages,
      // st, et);
      DefaultProblem defaultProblem = new DefaultProblem("", messages[0], 0,
          new String[] {}, ProblemSeverities.Error, st, et, re.token.getLine());
      if (!problems.contains(defaultProblem)) {
        reporter.reportProblem(defaultProblem);
        problems.add(defaultProblem);
      }
    }
  }

  public void reportThrowable(Throwable extre) {
    // if(DLTKCore.DEBUG ) {
    extre.printStackTrace();
    // }
  }

  public void reportMessage(String msg) {
    // if( DLTKCore.DEBUG ) {
    System.err.println("BlitzMaxParser:" + msg);
    // }
  }
}
