package net.brucey.dltk.blitzmax.debugger.dbgp.command;

import net.brucey.dltk.blitzmax.debugger.dbgp.CommandType;

/**
 * Returns stack information for a given stack depth.
 * 
 */
public class StackGetCommand extends Command {

  public StackGetCommand(String[] cmdParts) {
    super(cmdParts);
  }

  @Override
  public CommandType getType() {
    return CommandType.STACK_GET;
  }

  /**
   * 
   * @return the depth of the stack to return, or -1 for all.
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
