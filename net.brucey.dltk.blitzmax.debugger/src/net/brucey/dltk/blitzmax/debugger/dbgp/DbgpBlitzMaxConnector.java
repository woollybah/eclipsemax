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
  private String[] blitzMaxArgs;

  private InputStream blitzStdErr;
  private InputStream blitzStdIn;
  private OutputStream blitzStdOut;

  private Process debugProcess;

  /**
   * @param args
   */
  public static void main(String[] args) {
    DbgpBlitzMaxConnector connector = new DbgpBlitzMaxConnector(args);

    connector.start();

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
    System.arraycopy(args, 3, blitzMaxArgs, 0, args.length - 3);
  }

  private boolean start() {
    ProcessBuilder pb = new ProcessBuilder(exePath + blitzMaxArgs);
    pb.directory(new File(exePath).getParentFile()); // set the working directory

    try {
      debugProcess = pb.start();

      blitzStdErr = new BufferedInputStream(debugProcess.getErrorStream());
      blitzStdIn = new BufferedInputStream(debugProcess.getInputStream());
      blitzStdOut = new BufferedOutputStream(debugProcess.getOutputStream());

    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    return true;
  }

}
