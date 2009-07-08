package net.brucey.dltk.blitzmax.debugger.dbgp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DbgpBlitzMaxConnector {

  private int dbgpPort;
  private String dbgpHost;

  private String exePath;
  private String[] blitzMaxArgs = { "" };

  private InputStream blitzStdErr;
  private InputStream blitzStdIn;
  private OutputStream blitzStdOut;

  private Process debugProcess;

  private DataBuffer inputBuffer = new DataBuffer();
  private BlitzMaxStdDebugProcessor processor;

  /**
   * @param args
   */
  public static void main(String[] args) {

    // TODO : remove test data
    //    String[] a = { "127.0.0.1", "9000",
    //        "/Users/brucey/Documents/programming/Blitz/remote_debugging/java_test.debug" };
    //    args = a;

    DbgpBlitzMaxConnector connector = new DbgpBlitzMaxConnector(args);

    connector.start();

    connector.monitor();

    connector.finish();
  }

  private void finish() {
    debugProcess.destroy();
  }

  private void monitor() {

    byte[] inBuffer = new byte[4096];

    while (true) {

      try {
        int inBytes = blitzStdIn.available();
        int bytesRead = 0;

        if (inBytes > 0) {

          bytesRead = blitzStdIn.read(inBuffer, 0,
              (inBytes < inBuffer.length) ? inBytes : inBuffer.length);

          System.out.println(inBuffer);

        }

        inBytes = blitzStdErr.available();

        if (inBytes > 0) {
          bytesRead = blitzStdErr.read(inBuffer, 0,
              (inBytes < inBuffer.length) ? inBytes : inBuffer.length);

          inputBuffer.addData(inBuffer, bytesRead);

        }

        while (inputBuffer.lineAvail()) {

          String line = inputBuffer.readLine();

          line = processor.processLine(line);

          if (line != null) {
            System.out.println(line);
          }

        }

        debugProcess.exitValue();
      } catch (IllegalThreadStateException e) {
        // sleep a little
        try {
          Thread.sleep(10);
        } catch (InterruptedException e1) {
        }
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }

    }
  }

  public DbgpBlitzMaxConnector(String[] args) {
    // expected in this order :
    // host
    // port
    // /path/to/exe
    // params
    dbgpHost = args[0];
    dbgpPort = Integer.parseInt(args[1]);
    exePath = args[2];

    System.arraycopy(args, 2, blitzMaxArgs, 0, args.length - 2);

  }

  private boolean start() {
    ProcessBuilder pb = new ProcessBuilder(blitzMaxArgs);
    pb.directory(new File(exePath).getParentFile()); // set the working directory

    try {
      debugProcess = pb.start();

      blitzStdErr = new BufferedInputStream(debugProcess.getErrorStream());
      blitzStdIn = new BufferedInputStream(debugProcess.getInputStream());
      blitzStdOut = new BufferedOutputStream(debugProcess.getOutputStream());

      processor = new BlitzMaxStdDebugProcessor(blitzStdIn, blitzStdOut,
          blitzStdErr);

    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    return true;
  }

}
