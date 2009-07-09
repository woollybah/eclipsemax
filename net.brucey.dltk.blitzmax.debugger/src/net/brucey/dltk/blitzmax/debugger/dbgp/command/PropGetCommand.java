package net.brucey.dltk.blitzmax.debugger.dbgp.command;

import net.brucey.dltk.blitzmax.debugger.dbgp.CommandType;

public class PropGetCommand extends Command {

  public PropGetCommand(String[] cmdParts) {
    super(cmdParts);
  }

  @Override
  public CommandType getType() {
    return CommandType.PROP_GET;
  }

}
