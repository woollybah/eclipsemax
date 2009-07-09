package net.brucey.dltk.blitzmax.debugger.dbgp.command;

import net.brucey.dltk.blitzmax.debugger.dbgp.CommandType;

public class PropSetCommand extends Command {

  public PropSetCommand(String[] cmdParts) {
    super(cmdParts);
  }

  @Override
  public CommandType getType() {
    return CommandType.PROP_SET;
  }

}
