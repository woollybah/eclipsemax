package net.brucey.dltk.blitzmax.debugger.dbgp;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.LinkedList;
import java.util.List;

import net.brucey.dltk.blitzmax.debugger.dbgp.command.Command;

/**
 * Communicates with the IDE.
 * 
 */
public class BlitzMaxIDEDebugProcessor {

  private final String ideHost;
  private final int idePort;
  private final String session;

  private Socket socket;

  private InputStream in;
  private OutputStream out;

  private DbgpResponse response;

  private final LinkedList<Command> commands = new LinkedList<Command>();
  private final DataBuffer inputBuffer = new DataBuffer();

  public BlitzMaxIDEDebugProcessor(String ideHost, int idePort, String session) {
    this.ideHost = ideHost;
    this.idePort = idePort;
    this.session = session;
  }

  public boolean connect() {

    response = new DbgpResponse();

    boolean success = true;

    try {
      socket = new Socket(ideHost, idePort);

      in = new DataInputStream(socket.getInputStream());
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
    System.out.println("Sending response : " + xml);

    byte[] bytes = xml.getBytes();
    int length = bytes.length;

    try {

      // length
      out.write(String.valueOf(length).getBytes());
      out.write(0);

      // response
      out.write(bytes);
      out.write(0);

      // flush
      out.flush();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void monitor(boolean needCommand) {
    byte[] inBuffer = new byte[1024];

    try {

      int inBytes = in.available();

      if (inBytes > 0 || needCommand) {
        //      System.out.println("bytes available : " + inBytes);

        // loop until there's nothing left in the buffers
        // while (inBytes > 0) {

        int bytesRead = 0;
        int c;

        // if (inBytes > 0) {
        while ((c = in.read()) != 0) {
          if (c == -1) {
            break;
          }

          inBuffer[bytesRead++] = (byte) c;

        }

        //       bytesRead = in.read(inBuffer, 0,
        //         (inBytes < inBuffer.length) ? inBytes : inBuffer.length);

        inputBuffer.addNullBasedData(inBuffer, bytesRead);

        System.out.println("Receiving command data... : "
            + new String(inBuffer, 0, bytesRead));

        // process the commands
        while (inputBuffer.lineAvail()) {

          commands.add(DbgpCommand.parseCommand(inputBuffer.readBytes()));

        }

      }

      // inBytes = in.available();

      //  }

    } catch (IOException e) {
      // TODO throw an exception ?
      e.printStackTrace();

    }

  }

  public LinkedList<Command> getCommands() {
    return commands;
  }

  public void featureGet(String id, String name, boolean supported, String value) {
    sendResponse(response.featureGet(id, name, supported, value));
  }

  public void featureSet(String id, String name, boolean success) {
    sendResponse(response.featureSet(id, name, success));
  }

  public void stdin(String id, boolean success) {
    sendResponse(response.stdin(id, success));
  }

  public void stderr(String id, boolean success) {
    sendResponse(response.stderr(id, success));
  }

  public void stdout(String id, boolean success) {
    sendResponse(response.stdout(id, success));
  }

  public BlitzMaxStreamRedirect getStderrRedirect() {
    return new BlitzMaxStreamRedirect(this, BlitzMaxStreamRedirect.STDERR);
  }

  public BlitzMaxStreamRedirect getStdoutRedirect() {
    return new BlitzMaxStreamRedirect(this, BlitzMaxStreamRedirect.STDOUT);
  }

  public void stream(String type, byte[] buf) {
    sendResponse(response.stream(type, buf));
  }

  public void run(String id, DebugState state, boolean success) {
    sendResponse(response.run(id, state, success));
  }

  public void breakpoint(String id) {
    sendResponse(response.breakpoint(id));
  }

  public void stackGet(String id, List<BlitzMaxStackScope> stack) {
    sendResponse(response.stackGet(id, stack));
  }

  public void contextNames(String id, List<BlitzMaxStackScope> stack) {
    sendResponse(response.contextNames(id, stack));
  }

  public void stop(String id, DebugState state) {
    sendResponse(response.stop(id, state));
  }

  public void contextGet(String id, List<BlitzMaxStackScope> stack, int depth,
      int context) {
    sendResponse(response.contextGet(id, stack, depth, context));
  }

}
