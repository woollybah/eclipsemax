/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial implementation
 *******************************************************************************/
package net.brucey.dltk.blitzmax.debugger.dbgp;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import net.brucey.dltk.blitzmax.debugger.dbgp.xml.DataNode;
import net.brucey.dltk.blitzmax.debugger.dbgp.xml.Node;

/**
 * Handle Init and Response DBGp Responses Init and Engine Child only Response,
 * status attributes and Error code child only status entries occur when a
 * program suspends or a status request is made
 * 
 */
public class DbgpResponse {

  /*
   * Example Responses <response command="property_get" transaction_id="95"
   * status="break" reason="ok"> <error code="300"> <message> <![CDATA[can not
   * get property]]> </message> </error> </response>
   * 
   * <response command="stop" transaction_id="32" status="stopped"
   * reason="ok"></response>
   * 
   * <response command="breakpoint_set" transaction_id="1"
   * id="49240001"></response> <response command="feature_set"
   * transaction_id="19" feature="max_depth" success="1"></response>
   */

  /*
   * status codes {"", "starting", "stopping", "stopped", "running", "break"};
   */
  // public static final String STATUS_STARTING = "starting";
  // public static final String STATUS_STOPPING = "stopping";
  // public static final String STATUS_STOPPED = "stopped";
  // public static final String STATUS_RUNNING = "running";
  // public static final String STATUS_BREAK = "break";

  /*
   * reason codes {"ok", "error", "aborted", "exception"};
   */

  public static final String REASON_OK = "ok";
  public static final String REASON_ERROR = "error";
  public static final String REASON_ABORTED = "aborted";
  public static final String REASON_EXCEPTION = "exception";

  // type
  public static final int PARSE_FAILURE = 0;
  public static final int INIT = 1;
  public static final int RESPONSE = 2;
  public static final int STREAM = 3;
  public static final int PROXY_INIT = 4;
  public static final int PROXY_ERROR = 5;

  public static final int UNKNOWN_TYPE = 99;

  int type;

  // error responses

  /*
   * Error codes, eg
   * 
   * { 0, "no error" }, { 1, "parse error in command" }, { 2,
   * "duplicate arguments in command" }, { 3, "invalid or missing options" }, {
   * 4, "unimplemented command" }, { 5, "command is not available" }, { 100,
   * "can not open file" }, { 101, "stream redirect failed" }, { 200,
   * "breakpoint could not be set" }, { 201, "breakpoint type is not supported"
   * }, { 202, "invalid breakpoint line" }, { 203, "no code on breakpoint line"
   * }, { 204, "invalid breakpoint state" }, { 205, "no such breakpoint" }, {
   * 206, "error evaluating code" }, { 207, "invalid expression" }, { 300,
   * "can not get property" }, { 301, "stack depth invalid" }, { 302,
   * "context invalid" }, { 900, "encoding not supported" }, { 998,
   * "an internal exception in the debugger" }, { 999, "unknown error" },
   */
  public static final int ERROR_OK = 0;
  public static final int ERROR_CANT_GET_PROPERTY = 300;

  // own internal error codes
  public static final int ERROR_UNKNOWN_ERROR_CODE = 10000;
  public static final int ERROR_UNKNOWN_TYPE = 10001;
  public static final int ERROR_PARSE_FAILURE = 10002;
  public static final int ERROR_INVALID_RESPONSE = 10003;

  int errorCode;
  String errorMessage;

  /*
   * 
   * Example Init <initfileuri=
   * "file:///C%3A%5Cudata-eclipse%5Cphpide025%5CtestXdebug%5CPhpCode%5Ctestcase3.php"
   * language="PHP" protocol_version="1.0" appid="2116"
   * idekey="ECLIPSE_XDEBUG11623014568921"> <engine version="2.0.0RC2-dev">
   * <![CDATA[Xdebug]]> </engine> <author> <![CDATA[Derick Rethans]]> </author>
   * <url> <![CDATA[http://xdebug.org]]> </url> <copyright> <![CDATA[Copyright
   * (c) 2002-2006 by Derick Rethans]]> </copyright> </init>
   */
  public String init(String file, String session) {
    StringBuffer buf = xml();

    Node init = new Node("init");
    init.addAttribute("fileuri", fileToURI(file));
    init.addAttribute("idekey", session);
    init.addAttribute("language", "BlitzMax");
    init.addAttribute("protocol_version", "1.0");
    init.addAttribute("appid", "blitzmax_debugger");
    // put here?
    // init.addAttribute("idekey", "ECLIPSEBLITZMAX"); // TODO : what should we
    // put here?

    init.render(buf);
    return buf.toString();
  }

  private static String fileToURI(String file) {
    URI uri = null;
    try {

      uri = new URI("file", "", file, null, null);

    } catch (URISyntaxException e) {

      // We'll get here on Windows.... so we need to fix up the URI ourselves.

      uri = new File(file).toURI();

      String f = uri.toASCIIString();
      if (!f.startsWith("file://")) {
        f = f.substring(f.indexOf(':') + 1);
        return "file://" + f;
      }
    }

    return uri.toASCIIString();
  }

  /**
   * Send a "status" response.
   * 
   * @param id
   *          the transaction id.
   * @param state
   *          the state.
   * @param reason
   *          the reason.
   * 
   * @return the rendered response.
   */
  public String status(String id, DebugState state, String reason) {
    StringBuffer buf = xml();

    Node response = newResponse("status", id);

    response.addAttribute("status", DebugState.map(state));
    response.addAttribute("reason", reason);

    response.render(buf);
    return buf.toString();
  }

  public String featureGet(String id) {
    return null;
  }

  // a response node
  private Node newResponse(String command, String id) {
    Node node = new Node("response");
    node.addAttribute("command", command);
    node.addAttribute("transaction_id", id);
    return node;
  }

  // xml header buffer
  private StringBuffer xml() {
    StringBuffer buf = new StringBuffer();
    buf.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");

    return buf;
  }

  public String featureGet(String id, String name, boolean supported,
      String value) {
    StringBuffer buf = xml();

    Node response = newResponse("feature_get", id);
    response.addAttribute("feature_name", name);
    response.addAttribute("supported", (supported) ? "1" : "0");

    response.addText(value);

    response.render(buf);
    return buf.toString();
  }

  public String featureSet(String id, String name, boolean success) {
    StringBuffer buf = xml();

    Node response = newResponse("feature_set", id);
    response.addAttribute("feature_name", name);
    response.addAttribute("success", (success) ? "1" : "0");

    response.render(buf);
    return buf.toString();
  }

  private String simpleResponseWithSuccess(String name, String id,
      boolean success) {
    StringBuffer buf = xml();

    Node response = newResponse(name, id);
    response.addAttribute("success", (success) ? "1" : "0");

    response.render(buf);
    return buf.toString();
  }

  public String stdin(String id, boolean success) {
    return simpleResponseWithSuccess("stdin", id, success);
  }

  public String stderr(String id, boolean success) {
    return simpleResponseWithSuccess("stderr", id, success);
  }

  public String stdout(String id, boolean success) {
    return simpleResponseWithSuccess("stdout", id, success);
  }

  /*
   * Example stream
   * 
   * <stream type="stdout"encoding="base64"><![CDATA[PGh0bWw+
   * DQo8aGVhZD4NCjx0aXRsZT5HdWVzc2luZyBHYW1lPC90aXRsZT4NCjwvaGVhZD4NCjxib2R5Pg0KPGZvcm0gYWN0aW9uPScnIG1ldGhvZD0ncG9zdCc
   * +PGlucHV0IHR5cGU9J2hpZGRlbicgdmFsdWU9JzUnIG5hbWU9J3R4dE51bWJlcic+
   * PGlucHV0IHR5cGU9J2hpZGRlbicgdmFsdWU9JzAnIG5hbWU9J3R4dFRyaWVzJz5QbGVhc2UgR3Vlc3MgQSBOdW1iZXIgKDEgLSA1MCk8aW5wdXQgdHlwZT0ndGV4dCcgbmFtZT0ndHh0R3Vlc3MnIHNpemU9JzEwJz48aW5wdXQgdHlwZT0nc3VibWl0JyB2YWx1ZT0nU3VibWl0JyBuYW1lPSdTdWJtaXQnPjwvZm9ybT48YnIgLz4gPCEtLSA1LS0hPjwvYm9keT4NCjwvaHRtbD4
   * =]]></stream>
   */
  public String stream(String type, byte[] data) {
    StringBuffer buf = xml();

    Node stream = new Node("stream");
    stream.addAttribute("type", type);
    stream.addAttribute("encoding", "base64");

    stream.addNode(new DataNode(data));

    stream.render(buf);
    return buf.toString();
  }

  public String run(String id, DebugState state, boolean success) {
    StringBuffer buf = xml();

    Node response = newResponse("run", id);
    response.addAttribute("status", DebugState.map(state));
    response.addAttribute("reason", (success) ? "ok" : "error");

    response.render(buf);
    return buf.toString();

  }

  public String breakpoint(String id) {
    StringBuffer buf = xml();

    Node response = newResponse("break", id);
    response.addAttribute("status", DebugState.map(DebugState.BREAK));
    response.addAttribute("reason", "ok");

    response.render(buf);
    return buf.toString();
  }

  public String stackGet(String id, List<BlitzMaxStackScope> stack) {
    StringBuffer buf = xml();

    Node response = newResponse("stack_get", id);

    for (BlitzMaxStackScope scope : stack) {
      addToStack(response, scope, scope.getLevel());
    }

    response.render(buf);
    return buf.toString();
  }

  private void addToStack(Node parent, BlitzMaxStackScope scope, int level) {
    Node stack = parent.addNode("stack");

    stack.addAttribute("level", String.valueOf(level));
    stack.addAttribute("type", "file");
    stack.addAttribute("filename", fileToURI(scope.getSource()));
    stack.addAttribute("lineno", String.valueOf(scope.getLine()));

    // include the function/method name?
    if (level > 0) {
      if (scope.getWhere() != null) {
        stack.addAttribute("where", scope.getWhere());
      }
    }

  }

  public String contextNames(String id, List<BlitzMaxStackScope> stack) {
    // FIXME : make this work for different contexts. I'm hard-coding this to
    // Local for now.

    StringBuffer buf = xml();

    Node response = newResponse("context_names", id);

    Node context = response.addNode("context");
    context.addAttribute("name", "Local");
    context.addAttribute("id", "0");

    response.render(buf);
    return buf.toString();

  }

  public String stop(String id, DebugState state) {
    StringBuffer buf = xml();

    Node response = newResponse("stop", id);
    response.addAttribute("status", DebugState.map(state));
    response.addAttribute("reason", "ok");

    response.render(buf);
    return buf.toString();
  }

  public String contextGet(String id, List<BlitzMaxStackScope> stack,
      int depth, int context) {
    StringBuffer buf = xml();

    Node response = newResponse("context_get", id);
    response.addAttribute("context", String.valueOf(context));

    for (BlitzMaxStackScope scope : stack) {

      if (scope.getVariables() != null) {
        for (BlitzMaxScopeVariable var : scope.getVariables()) {
          addProperty(response, var);
        }
      }
      // only interested in the first one in the stack...
      break;
    }

    response.render(buf);
    return buf.toString();

  }

  private void addProperty(Node response, BlitzMaxScopeVariable var) {
    Node prop = response.addNode("property");

    prop.addAttribute("name", var.getName());
    prop.addAttribute("fullname", var.getName());
    prop.addAttribute("type", var.getType());

    prop.addAttribute("constant", "1"); // ie. NOT modifiable in the variable editor!

    if (var.getKey() != null) {
      prop.addAttribute("children", (var.hasChildren()) ? "1" : "0");

      prop.addAttribute("key", var.getKey());
      prop.addAttribute("address", var.getKey());
    } else {
      prop.addAttribute("children", (var.hasChildren()) ? "1" : "0");

      if (BlitzMaxType.isPrimitive(var.getBaseType())) {
        prop.addText(var.getValue());
      } else {
        if (BlitzMaxType.STRING.equals(var.getBaseType())) {
          prop.addAttribute("encoding", "base64");
          prop.addNode(new DataNode(var.getValue().getBytes()));
        }
      }
    }

  }

}
