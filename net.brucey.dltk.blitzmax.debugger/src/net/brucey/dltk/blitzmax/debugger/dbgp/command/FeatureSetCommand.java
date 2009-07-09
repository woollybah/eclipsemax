package net.brucey.dltk.blitzmax.debugger.dbgp.command;

import net.brucey.dltk.blitzmax.debugger.dbgp.CommandType;

public class FeatureSetCommand extends Command {

  public FeatureSetCommand(String[] cmdParts) {
    super(cmdParts);
  }

  @Override
  public CommandType getType() {
    return CommandType.FEATURE_SET;
  }

  public String getName() {
    return commands.get("-n");
  }

  public String getValue() {
    return commands.get("-v");
  }
}
