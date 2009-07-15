package net.brucey.dltk.blitzmax.debugger.dbgp;

import java.util.ArrayList;
import java.util.List;

public class BlitzMaxObjectScope {

  private final String address;
  private int offset = 0;

  private List<BlitzMaxScopeVariable> variables;

  public BlitzMaxObjectScope(String details) {
    String base[] = details.substring(0, details.indexOf('{')).split(":");

    address = base[0];
    if (base.length > 1) {
      offset = Integer.parseInt(base[1]);
    }

  }

  public void addVariable(String var) {
    if (!var.startsWith("Type")) {

      if (variables == null) {
        variables = new ArrayList<BlitzMaxScopeVariable>();
      }

      variables.add(new BlitzMaxScopeVariable(var));
    }
  }

  public String getAddress() {
    return address;
  }

  public int getOffset() {
    return offset;
  }

  public List<BlitzMaxScopeVariable> getVariables() {
    return variables;
  }

}
