package net.brucey.dltk.blitzmax.debugger.dbgp.command;

import net.brucey.dltk.blitzmax.debugger.dbgp.CommandType;

/**
 * Returns the stack depth.
 * 
 */
public class StackDepthCommand extends Command {

  public StackDepthCommand(String[] cmdParts) {
    super(cmdParts);
  }

  @Override
  public CommandType getType() {
    return CommandType.STACK_DEPTH;
  }

}
