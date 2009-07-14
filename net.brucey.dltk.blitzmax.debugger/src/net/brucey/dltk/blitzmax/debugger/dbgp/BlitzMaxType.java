package net.brucey.dltk.blitzmax.debugger.dbgp;

public enum BlitzMaxType {
  BYTE, SHORT, INT, LONG, FLOAT, DOUBLE, STRING, OBJECT;

  public static BlitzMaxType map(String type) {
    if ("Byte".equals(type)) {
      return BYTE;
    } else if ("Short".equals(type)) {
      return SHORT;
    } else if ("Int".equals(type)) {
      return INT;
    } else if ("Long".equals(type)) {
      return LONG;
    } else if ("Float".equals(type)) {
      return FLOAT;
    } else if ("Double".equals(type)) {
      return DOUBLE;
    } else if ("String".equals(type)) {
      return STRING;
    }
    return OBJECT;
  }

  public static boolean isPrimitive(BlitzMaxType type) {
    switch (type) {
    case OBJECT:
    case STRING:
      return false;
    default:
      return true;
    }
  }
}
