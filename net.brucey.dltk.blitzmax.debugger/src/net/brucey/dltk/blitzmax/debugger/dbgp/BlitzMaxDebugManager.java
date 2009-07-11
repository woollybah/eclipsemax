package net.brucey.dltk.blitzmax.debugger.dbgp;

import java.util.LinkedList;

import net.brucey.dltk.blitzmax.debugger.dbgp.command.Command;

public class BlitzMaxDebugManager {

  private BlitzMaxStdDebugProcessor processor;
  private BlitzMaxIDEDebugProcessor ideProcessor;

  private boolean finish = false;

  private DebugState state = DebugState.STARTING;

  private static final int MODE_WAITING = 0;
  private static final int MODE_RUNNING = 1;
  private static final int MODE_RUNWAIT = 2;

  private int mode = MODE_WAITING;

  public BlitzMaxDebugManager(BlitzMaxStdDebugProcessor processor,
      BlitzMaxIDEDebugProcessor ideProcessor) {
    this.processor = processor;
    this.ideProcessor = ideProcessor;
  }

  public void run(String file) {

    // initialise IDE connection
    ideProcessor.init(file);

    while (!finish) {

      // check the IDE commands.
      checkForCommands();

      if (mode > MODE_WAITING) {
        // check the app buffers
        finish = processor.monitor();
      }
      // sleep a little
      try {
        Thread.sleep(20);
      } catch (InterruptedException e1) {
      }

    }

  }

  private void checkForCommands() {
    ideProcessor.monitor();

    LinkedList<Command> commands = ideProcessor.getCommands();

    if (!commands.isEmpty()) {

    }

  }

}
