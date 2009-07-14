package net.brucey.dltk.blitzmax.debugger.dbgp;

public enum ScopeType {
  LOCAL, GLOBAL, CONST, FIELD;

  public static String map(ScopeType scope) {

    switch (scope) {
    case CONST:
      return "Const";
    case FIELD:
      return "Field";
    case GLOBAL:
      return "Global";
    case LOCAL:
      return "Local";
    }

    return "Undefined";
  }

  public static ScopeType map(String scope) {
    if ("Const".equals(scope)) {
      return CONST;
    } else if ("Field".equals(scope)) {
      return FIELD;
    } else if ("Global".equals(scope)) {
      return GLOBAL;
    } else if ("Local".equals(scope)) {
      return LOCAL;
    }

    // default to local...
    return LOCAL;
  }
}
