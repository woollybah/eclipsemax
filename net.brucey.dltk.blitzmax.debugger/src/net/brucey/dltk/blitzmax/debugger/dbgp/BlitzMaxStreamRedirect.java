package net.brucey.dltk.blitzmax.debugger.dbgp;

public class BlitzMaxStreamRedirect {

  public static final int STDERR = 0;
  public static final int STDIN = 1;
  public static final int STDOUT = 2;

  private BlitzMaxIDEDebugProcessor processor;

  private int type;

  public BlitzMaxStreamRedirect(BlitzMaxIDEDebugProcessor processor, int type) {

    this.processor = processor;
    this.type = type;

  }

  public void println(String line) {
    println(line.getBytes());
  }

  public void println(byte[] buf) {
    processor.stream(getType(), buf);
  }

  private String getType() {
    switch (type) {
    case 0:
      return "stderr";
    case 1:
      return "stdin";
    case 2:
      return "stdout";
    }

    return null;
  }

}
