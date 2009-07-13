package net.brucey.dltk.blitzmax.debugger.dbgp;

public class BlitzMaxBreakpointHandler {

  private boolean debugStopped = false;

  public void setDebugStopped() {
    debugStopped = true;
  }

  public boolean hasDebugStopped() {
    if (debugStopped) {
      debugStopped = false;
      return true;
    }

    return false;
  }

}
