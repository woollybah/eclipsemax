package net.brucey.dltk.blitzmax.debugger.dbgp.xml;

import net.brucey.dltk.blitzmax.debugger.dbgp.Base64;

/**
 * A base64 encoded CDATA node.
 * 
 */
public class DataNode extends Node {

  /**
   * A new DataNode. Pass in raw data. It will be encoded here.
   * 
   * @param data
   *          the raw data.
   */
  public DataNode(byte[] data) {
    super(Base64.encode(data));
  }

  @Override
  public void render(StringBuffer buf) {
    buf.append("<![CDATA[").append(name).append("]]>");
  }

}
