package net.brucey.dltk.blitzmax.debugger.dbgp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DbgpBlitzMaxConnector {

  private final int dbgpPort;
  private final String dbgpHost;

  private final String exePath;
  private final String[] blitzMaxArgs = { "" };

  private InputStream blitzStdErr;
  private InputStream blitzStdIn;
  private OutputStream blitzStdOut;

  private Process debugProcess;

  private BlitzMaxDebugManager manager;

  /**
   * @param args
   */
  public static void main(String[] args) {

    // TODO : remove test data
    //    String[] a = { "127.0.0.1", "9000",
    //        "/Users/brucey/Documents/programming/Blitz/remote_debugging/java_test.debug" };
    // String[] a = { "127.0.0.1", "9000",
    // "C:/000_programming/blitz/debugging/java_test.debug.exe" };
    //    args = a;

    DbgpBlitzMaxConnector connector = new DbgpBlitzMaxConnector(args);

    connector.start();

    connector.run();
  }

  private void run() {
    manager.run(exePath);

    finish();
  }

  private void finish() {
    debugProcess.destroy();
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

    BlitzMaxIDEDebugProcessor ideProcessor = new BlitzMaxIDEDebugProcessor(
        dbgpHost, dbgpPort);
    ideProcessor.connect();

    ProcessBuilder pb = new ProcessBuilder(blitzMaxArgs);
    pb.directory(new File(exePath).getParentFile()); // set the working
    // directory

    try {
      debugProcess = pb.start();

      blitzStdErr = new BufferedInputStream(debugProcess.getErrorStream());
      blitzStdIn = new BufferedInputStream(debugProcess.getInputStream());
      blitzStdOut = new BufferedOutputStream(debugProcess.getOutputStream());

      BlitzMaxStdDebugProcessor processor = new BlitzMaxStdDebugProcessor(
          blitzStdIn, blitzStdOut, blitzStdErr, debugProcess);

      manager = new BlitzMaxDebugManager(processor, ideProcessor);

    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    return true;
  }

}
