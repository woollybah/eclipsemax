package net.brucey.dltk.blitzmax.debugger.dbgp;

import java.util.ArrayList;
import java.util.List;

public class BlitzMaxStackScope {

  private final String name;

  private String source;
  private int line;
  private int column;

  private List variables;

  private static boolean osChecked = false;
  private static boolean isWindows = false;

  public BlitzMaxStackScope(String name) {
    this.name = name;
  }

  public void setSource(String source) {
    String[] parts = source.split("\\<");
    this.source = convertPath(parts[0]);

    String[] lc = parts[1].substring(0, parts[1].length() - 1).split(",");

    line = Integer.parseInt(lc[0]);
    column = Integer.parseInt(lc[1]);

  }

  private String convertPath(String path) {
    if (!osChecked) {
      isWindows = System.getProperty("os.name").startsWith("Windows");
      osChecked = true;
    }

    if (isWindows) {
      return path.replaceAll("/", "\\\\");
    } else {
      return path;
    }
  }

  public void addVariable(String var) {
    if (variables == null) {
      variables = new ArrayList();
    }

    variables.add(var);
  }

  public String getSource() {
    return source;
  }

  public int getLine() {
    return line;
  }

  public int getColumn() {
    return column;
  }

}
