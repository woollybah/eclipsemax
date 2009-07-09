package net.brucey.dltk.blitzmax.debugger.dbgp.command;

import net.brucey.dltk.blitzmax.debugger.dbgp.CommandType;

/**
 * Returns an array of properties in a given context at a given stack depth.
 * 
 */
public class ContextGetCommand extends Command {

  public ContextGetCommand(String[] cmdParts) {
    super(cmdParts);
  }

  @Override
  public CommandType getType() {
    return CommandType.CONTEXT_GET;
  }

  /**
   * 
   * @return the depth of the stack to return, or -1 for default.
   */
  public int getDepth() {
    String depth = commands.get("-d");
    if (depth == null) {
      return -1;
    } else {
      return Integer.parseInt(depth);
    }
  }

  /**
   * 
   * @return the context id, or 0 for default.
   */
  public int getContextId() {
    String depth = commands.get("-c");
    if (depth == null) {
      return 0;
    } else {
      return Integer.parseInt(depth);
    }
  }
}
