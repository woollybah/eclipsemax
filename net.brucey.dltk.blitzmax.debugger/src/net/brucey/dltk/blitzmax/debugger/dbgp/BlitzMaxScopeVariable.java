package net.brucey.dltk.blitzmax.debugger.dbgp;

public class BlitzMaxScopeVariable {

  private ScopeType scope;

  private String name;
  private String classname;
  private int page;
  private int pagesize;
  private BlitzMaxType baseType;
  private String type;
  private String facet;
  private int size;
  private boolean children;
  private String key;

  private String value;

  public BlitzMaxScopeVariable(final String line) {

    // the scope type (Local, Const etc)
    int i = line.indexOf(' ');
    scope = ScopeType.map(line.substring(0, i));

    String var = line.substring(i + 1);

    // the variable name
    i = var.indexOf(':');
    name = var.substring(0, i);

    var = var.substring(i + 1);

    // the variable type
    i = var.indexOf('=');
    type = var.substring(0, i);
    baseType = BlitzMaxType.map(type);

    if (baseType.equals(BlitzMaxType.OBJECT)) {
      children = true;
    }

    value = var.substring(i + 1);

    if (value.startsWith("$")) {
      key = value.substring(1);
      value = null;
    }

  }

  public ScopeType getScope() {
    return scope;
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public BlitzMaxType getBaseType() {
    return baseType;
  }

  public boolean hasChildren() {
    return children;
  }

  public String getKey() {
    return key;
  }

  public String getValue() {
    return value;
  }

}
