package net.brucey.dltk.blitzmax.debugger.dbgp.xml;

import net.brucey.dltk.blitzmax.debugger.dbgp.Base64;

public class DataNode extends Node {

  public DataNode(byte[] data) {
    super(Base64.encode(data));
  }

  @Override
  public void render(StringBuffer buf) {
    buf.append("<![CDATA[").append(buf).append("]]>");
  }

}
