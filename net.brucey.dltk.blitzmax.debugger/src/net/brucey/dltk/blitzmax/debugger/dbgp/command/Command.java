package net.brucey.dltk.blitzmax.debugger.dbgp.command;

import java.util.TreeMap;

import net.brucey.dltk.blitzmax.debugger.dbgp.CommandType;

/**
 * A dbgp command from the IDE
 * 
 */
public abstract class Command {

  protected TreeMap<String, String> commands;

  public Command(String[] cmdParts) {

    commands = new TreeMap<String, String>();

    int i = 1;
    int count = cmdParts.length;

    while (i < count) {
      String attr = cmdParts[i++];
      String value = cmdParts[i++];

      commands.put(attr, value);
    }
  }

  public String getTransactionId() {
    return commands.get("-i");
  }

  public abstract CommandType getType();

}
