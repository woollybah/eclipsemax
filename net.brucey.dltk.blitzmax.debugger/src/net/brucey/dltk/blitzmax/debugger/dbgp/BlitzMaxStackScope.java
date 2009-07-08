package net.brucey.dltk.blitzmax.debugger.dbgp;

import java.util.ArrayList;
import java.util.List;

public class BlitzMaxStackScope {

  private String name;

  private String source;
  private int line;
  private int column;

  private List variables;

  public BlitzMaxStackScope(String name) {
    this.name = name;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public void addVariable(String var) {
    if (variables == null) {
      variables = new ArrayList();
    }

    variables.add(var);
  }

}
