package net.brucey.dltk.blitzmax.debugger.dbgp.command;

import net.brucey.dltk.blitzmax.debugger.dbgp.CommandType;

public class FeatureGetCommand extends Command {

  public FeatureGetCommand(String[] cmdParts) {
    super(cmdParts);
  }

  @Override
  public CommandType getType() {
    return CommandType.FEATURE_GET;
  }

  /**
   * 
   * @return the feature name.
   */
  public String getName() {
    return commands.get("-n");
  }

}
