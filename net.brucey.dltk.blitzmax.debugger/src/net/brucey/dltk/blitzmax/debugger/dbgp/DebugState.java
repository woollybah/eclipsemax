package net.brucey.dltk.blitzmax.debugger.dbgp;

/**
 * The debugger state.
 * 
 */
public enum DebugState {
  /**
   * State prior to execution of any code.
   */
  STARTING,
  /**
   * State after completion of code execution. This typically happens at the end
   * of code execution, allowing the IDE to further interact with the debugger
   * engine (for example, to collect performance data, or use other extended
   * commands).
   */
  STOPPING,
  /**
   * IDE is detached from process, no further interaction is possible.
   */
  STOPPED,
  /**
   * Code is currently executing. Note that this state would only be seen with
   * async support turned on, otherwise the typical state during IDE/debugger
   * interaction would be 'break'.
   */
  RUNNING,
  /**
   * Code execution is paused, for whatever reason. The IDE/debugger can pass
   * information back and forth.
   */
  BREAK;

  /**
   * Map a DebugState to a String.
   * 
   * @param state
   * @return a string representation of the state.
   */
  public static String map(DebugState state) {

    switch (state) {
    case BREAK:
      return "break";
    case RUNNING:
      return "running";
    case STARTING:
      return "starting";
    case STOPPED:
      return "stopped";
    case STOPPING:
      return "stopping";
    }

    return null;
  }

}
