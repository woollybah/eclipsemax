package net.brucey.dltk.blitzmax.debugger.dbgp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Communicates with the IDE.
 * 
 */
public class BlitzMaxIDEDebugProcessor {

  private String ideHost;
  private int idePort;

  private Socket socket;

  private InputStream in;
  private OutputStream out;

  private DbgpCommand command;
  private DbgpResponse response;

  public BlitzMaxIDEDebugProcessor(String ideHost, int idePort) {
    this.ideHost = ideHost;
    this.idePort = idePort;
  }

  public boolean connect() {

    command = new DbgpCommand();
    response = new DbgpResponse();

    boolean success = true;

    try {
      socket = new Socket(ideHost, idePort);

      in = new BufferedInputStream(socket.getInputStream());
      out = new BufferedOutputStream(socket.getOutputStream());

    } catch (UnknownHostException e) {
      success = false;
      e.printStackTrace();
    } catch (IOException e) {
      success = false;
      e.printStackTrace();
    }

    return success;
  }

  /**
   * Send init response.
   * 
   * @param file
   */
  public void init(String file) {
    sendResponse(response.init(file));
  }

  private void sendResponse(String xml) {
    int length = xml.length();

    try {

      // length
      out.write(String.valueOf(length).getBytes());
      out.write(0);

      // response
      out.write(xml.getBytes());
      out.write(0);

      // flush
      out.flush();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
