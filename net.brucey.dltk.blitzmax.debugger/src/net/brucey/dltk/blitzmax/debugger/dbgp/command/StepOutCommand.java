package net.brucey.dltk.blitzmax.debugger.dbgp.command;

import net.brucey.dltk.blitzmax.debugger.dbgp.CommandType;

/**
 * Steps out of the current scope and breaks on the statement after returning
 * from the current function.
 * 
 */
public class StepOutCommand extends Command {

  public StepOutCommand(String[] cmdParts) {
    super(cmdParts);
  }

  @Override
  public CommandType getType() {
    return CommandType.STEP_OUT;
  }

}
