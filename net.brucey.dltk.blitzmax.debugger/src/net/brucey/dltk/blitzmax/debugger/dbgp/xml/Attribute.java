package net.brucey.dltk.blitzmax.debugger.dbgp.xml;

public class Attribute {

  private String name;
  private String value;

  public Attribute(String name, String value) {
    this.name = name;
    this.value = value;
  }

  public void render(StringBuffer buf) {
    buf.append(' ').append(name).append("=\"").append(value).append('"');
  }

}
