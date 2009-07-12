package net.brucey.dltk.blitzmax.debugger.dbgp;

public class DbgpBlitzMaxConnector {

  private final int dbgpPort;
  private final String dbgpHost;

  //private final String exePath;
  private String[] blitzMaxArgs = { "" };

  //  private InputStream blitzStdErr;
  //  private InputStream blitzStdIn;
  //  private OutputStream blitzStdOut;

  //  private Process debugProcess;

  private BlitzMaxDebugManager manager;
  private String dbgpSession;
  private String sourcePath;

  /**
   * @param args
   * @throws Exception
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

    try {

      connector.run();

    } catch (Exception e) {

      e.printStackTrace();
    }
  }

  private void run() throws Exception {
    manager.initIDEProcessor();

    manager.run(sourcePath);

    finish();
  }

  private void finish() {
    manager.destroy();
  }

  public DbgpBlitzMaxConnector(String[] args) {
    // expected in this order :
    // host
    // port
    // session_id
    // bmk path
    // bmk params ...
    // app params
    dbgpHost = args[0];
    dbgpPort = Integer.parseInt(args[1]);
    dbgpSession = args[2];

    // find source path...
    getSourcePath(args);

    blitzMaxArgs = new String[args.length - 3];
    System.arraycopy(args, 3, blitzMaxArgs, 0, args.length - 3);

  }

  private void getSourcePath(String[] args) {

    int count = 0;
    for (String arg : args) {
      if (arg.equals("-o")) {
        count++;
        continue;
      }

      if (count > 0) {
        if (count == 2) {
          sourcePath = arg;
          return;
        }
        count++;
      }

    }

  }

  private boolean start() {

    BlitzMaxIDEDebugProcessor ideProcessor = new BlitzMaxIDEDebugProcessor(
        dbgpHost, dbgpPort, dbgpSession);

    BlitzMaxStdDebugProcessor processor = new BlitzMaxStdDebugProcessor(
        sourcePath, blitzMaxArgs);

    manager = new BlitzMaxDebugManager(processor, ideProcessor);

    return true;
  }

}
