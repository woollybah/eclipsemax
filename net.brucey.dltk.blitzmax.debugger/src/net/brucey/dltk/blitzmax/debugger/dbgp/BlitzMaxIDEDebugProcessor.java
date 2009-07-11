package net.brucey.dltk.blitzmax.debugger.dbgp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.LinkedList;

import net.brucey.dltk.blitzmax.debugger.dbgp.command.Command;

/**
 * Communicates with the IDE.
 * 
 */
public class BlitzMaxIDEDebugProcessor {

  private String ideHost;
  private int idePort;
  private String session;

  private Socket socket;

  private InputStream in;
  private OutputStream out;

  private DbgpCommand command;
  private DbgpResponse response;

  private LinkedList<Command> commands = new LinkedList<Command>();
  private final DataBuffer inputBuffer = new DataBuffer();

  public BlitzMaxIDEDebugProcessor(String ideHost, int idePort, String session) {
    this.ideHost = ideHost;
    this.idePort = idePort;
    this.session = session;
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
    sendResponse(response.init(file, session));
  }

  /**
   * Send status response.
   * 
   * @param state
   */
  public void status(String id, DebugState state, String reason) {
    sendResponse(response.status(id, state, reason));
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

  public void monitor() {
    byte[] inBuffer = new byte[1024];

    try {

      int inBytes = in.available();

      // loop until there's nothing left in the buffers
      while (inBytes > 0) {

        int bytesRead = 0;

        if (inBytes > 0) {
          bytesRead = in.read(inBuffer, 0,
              (inBytes < inBuffer.length) ? inBytes : inBuffer.length);

          inputBuffer.addNullBasedData(inBuffer, bytesRead);

          // process the commands
          while (inputBuffer.lineAvail()) {

            commands.add(DbgpCommand.parseCommand(inputBuffer.readBytes()));

          }

        }

        inBytes = in.available();

      }

    } catch (IOException e) {
      // TODO throw an exception ?
      e.printStackTrace();

    }

  }

  public LinkedList<Command> getCommands() {
    return commands;
  }

}
