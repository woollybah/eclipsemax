package net.brucey.dltk.blitzmax.debugger.dbgp.command;

import net.brucey.dltk.blitzmax.debugger.dbgp.CommandType;

/**
 * Steps to the next statement.
 * 
 */
public class StepOverCommand extends Command {

  public StepOverCommand(String[] cmdParts) {
    super(cmdParts);
  }

  @Override
  public CommandType getType() {
    return CommandType.STEP_OVER;
  }

}
