package net.brucey.dltk.blitzmax.debugger.dbgp.xml;

import java.util.ArrayList;
import java.util.List;

/**
 * An XML Node.
 * 
 */
public class Node {

  private String name;
  private List<Attribute> attributes;
  private List<Node> nodes;

  public Node(String name) {
    this.name = name;
  }

  /**
   * Renders the node to the provided StringBuffer.
   * 
   * @param buf
   */
  public void render(StringBuffer buf) {

    boolean empty = false;

    buf.append('<').append(name);

    // attributes
    if (attributes != null) {
      for (Attribute att : attributes) {
        att.render(buf);
      }
    }

    // no children?, we can close this node now
    if (nodes == null || nodes.isEmpty()) {
      buf.append('/');
      empty = true;
    }

    buf.append('>');

    // children
    if (nodes != null) {
      for (Node node : nodes) {
        node.render(buf);
      }
    }

    // if we have content, then we need to close the node
    if (!empty) {
      buf.append("</").append(name).append('>');
    }

  }

  /**
   * 
   * @param name
   * @param value
   * @return this node.
   */
  public Node addAttribute(String name, String value) {
    if (attributes == null) {
      attributes = new ArrayList<Attribute>();
    }
    attributes.add(new Attribute(name, value));

    return this;
  }

  /**
   * 
   * @param name
   * @return the new node.
   */
  public Node addNode(String name) {
    Node node = new Node(name);

    if (nodes == null) {
      nodes = new ArrayList<Node>();
    }

    nodes.add(node);

    return node;
  }

}
