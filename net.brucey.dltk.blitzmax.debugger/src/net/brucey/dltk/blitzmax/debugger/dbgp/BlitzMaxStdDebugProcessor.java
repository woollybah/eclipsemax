package net.brucey.dltk.blitzmax.debugger.dbgp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 
 * 
 */
public class BlitzMaxStdDebugProcessor {

  private String sourcePath;
  private String args[];

  private boolean inStack = false;
  private List<BlitzMaxStackScope> stack = new ArrayList<BlitzMaxStackScope>();

  private boolean inScope;
  private String currentFile;

  private BlitzMaxStackScope scope;

  private boolean inVariable;
  private boolean inFile;

  private InputStream blitzStdErr;
  private InputStream blitzStdIn;
  private OutputStream blitzStdOut;

  private BlitzMaxStreamRedirect stderrRedirect;
  private BlitzMaxStreamRedirect stdoutRedirect;

  private final DataBuffer inputBuffer = new DataBuffer();
  private Process debugProcess;

  public BlitzMaxStdDebugProcessor(String sourcePath, String[] args) {
    this.sourcePath = sourcePath;
    this.args = args;
  }

  public boolean start() {
    ProcessBuilder pb = new ProcessBuilder(args);

    pb.directory(new File(sourcePath).getParentFile()); // set the working directory

    try {
      debugProcess = pb.start();

      blitzStdErr = new BufferedInputStream(debugProcess.getErrorStream());
      blitzStdIn = new BufferedInputStream(debugProcess.getInputStream());
      blitzStdOut = new BufferedOutputStream(debugProcess.getOutputStream());

    } catch (IOException e) {
      return false;
    }

    return true;
  }

  public boolean reset() {
    // clear the buffers
    boolean finished = monitor();

    inVariable = false;
    inFile = false;
    stack.clear();
    inStack = false;
    scope = null;

    return finished;
  }

  /**
   * 
   * @return true if app has terminated, false otherwise.
   */
  public boolean monitor() {

    byte[] inBuffer = new byte[1024];

    try {

      int inBytes = blitzStdIn.available();
      int errBytes = blitzStdErr.available();

      // loop until there's nothing left in the buffers
      while (inBytes > 0 || errBytes > 0) {

        int bytesRead = 0;

        if (inBytes > 0) {

          bytesRead = blitzStdIn.read(inBuffer, 0,
              (inBytes < inBuffer.length) ? inBytes : inBuffer.length);

          if (stdoutRedirect == null) {
            System.out.println(inBuffer);
          } else {
            // redirect output
            stdoutRedirect.println(inBuffer);
          }

        }

        if (errBytes > 0) {
          bytesRead = blitzStdErr.read(inBuffer, 0,
              (errBytes < inBuffer.length) ? errBytes : inBuffer.length);

          inputBuffer.addLineBasedData(inBuffer, bytesRead);

        }

        while (inputBuffer.lineAvail()) {

          String line = inputBuffer.readLine();

          line = processLine(line);

          if (line != null) {
            if (stderrRedirect == null) {
              System.out.println(line);
            } else {
              // redirect output
              stderrRedirect.println(line);
            }
          }

        }

        inBytes = blitzStdIn.available();
        errBytes = blitzStdErr.available();

      }

      debugProcess.exitValue();

      // we get here if the app has terminated.
      return true;

    } catch (IllegalThreadStateException e) {

      // ignored - the app is still running.

    } catch (IOException e) {
      // TODO throw an exception ?
      e.printStackTrace();

    }

    return false;

  }

  public String processLine(String line) {

    int pos = 0;
    int len = line.length();
    while (pos < len && (line.charAt(pos++) == '>')) {
    }

    if (pos == len) {
      return null;
    }
    pos--;

    line = line.substring(pos);

    // This is not a debug-command line? Return it
    if (!line.startsWith("~>")) {
      return line;
    }

    line = line.substring(2);

    if (inVariable) {
      if (line.equals("}")) {
        //SetValue invar
        //invar.Free
        //invar=Null
      } else {
        //invar.AddVar line
      }
      return null;
    }

    // we are processing the stack?
    if (inStack) {

      // end of the stack?
      if (line.equals("}")) {

        // TODO : send the stack details to IDE....

        inStack = false;
        inScope = false;

        stack.clear();

        return null;
      }

      if (inFile) {
        if (!line.equals("Local <local>")) {
          scope = new BlitzMaxStackScope(line);
          stack.add(scope);
        }
        if (inScope) {
          scope.setSource(currentFile);
        }
        currentFile = null;
        return null;
      }

      if (line.startsWith("@") && line.indexOf('<') > 0) {
        currentFile = line.substring(1);
      } else {
        if (inScope) {
          scope.addVariable(line);
        }
      }

      return null;
    }

    // 
    if (line.startsWith("Unhandled Exception:")) {
      // TODO: we should tell the IDE something bad happened.
      //inexception=line
      //host.output.WritePipe "t"
      //cancontinue=False
      return null;
    }

    if (line.equals("StackTrace{")) {
      inStack = true;
      stack = new ArrayList<BlitzMaxStackScope>();
      return null;
    }

    if (line.equals("Debug:") || line.equals("DebugStop:")) {
      // TODO: if we are running, we need to tell the IDE we've stopped.
      // requestCurrentStack();
      //      If Not cancontinue Then
      //        cancontinue=True
      //        host.RefreshToolbar()
      //      EndIf
      return null;
    }

    if (line.startsWith("ObjectDump@")) {

      // TODO : implement object dump
      //      p=line.find("{")
      //      If p=-1 Return line
      //      line=line[11..p]
      //      invar=New TVar
      //      invar.obj=FindObj(line)
      //      invar.owner=Self
      return null;
    }

    return null;

  }

  public void requestCurrentStack() {
    sendCommand("t\n");
  }

  public void run() {
    sendCommand("r\n");
  }

  public void stepIn() {
    sendCommand("e\n");
  }

  public void stepOver() {
    sendCommand("s\n");
  }

  public void stepOut() {
    sendCommand("l\n");
  }

  private void sendCommand(String command) {
    try {
      blitzStdOut.write(command.getBytes());
      blitzStdOut.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void shutdown() {
    debugProcess.destroy();
  }

  public void setStderrRedirect(BlitzMaxStreamRedirect redirect) {
    stderrRedirect = redirect;
  }

  public void setStdoutRedirect(BlitzMaxStreamRedirect redirect) {
    stdoutRedirect = redirect;
  }

}
