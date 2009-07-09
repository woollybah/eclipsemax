package net.brucey.dltk.blitzmax.debugger.dbgp.command;

import net.brucey.dltk.blitzmax.debugger.dbgp.CommandType;

/**
 * The names of currently available contexts at a given stack depth, typically
 * Local, Global and Class.
 * 
 */
public class ContextNamesCommand extends Command {

  public ContextNamesCommand(String[] cmdParts) {
    super(cmdParts);
  }

  @Override
  public CommandType getType() {
    return CommandType.CONTEXT_NAMES;
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
}
