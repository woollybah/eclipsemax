package net.brucey.dltk.blitzmax.debugger.dbgp.command;

import net.brucey.dltk.blitzmax.debugger.dbgp.CommandType;

/**
 * Steps to the next statement.
 * 
 */
public class StepIntoCommand extends Command {

  public StepIntoCommand(String[] cmdParts) {
    super(cmdParts);
  }

  @Override
  public CommandType getType() {
    return CommandType.STEP_INTO;
  }

}
