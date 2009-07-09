package net.brucey.dltk.blitzmax.debugger.dbgp;

public class BlitzMaxDebugManager {

  private BlitzMaxStdDebugProcessor processor;
  private BlitzMaxIDEDebugProcessor ideProcessor;

  private boolean finish = false;

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
      // TODO : check the IDE commands.

      // check the app buffers
      finish = processor.monitor();

      // sleep a little
      try {
        Thread.sleep(10);
      } catch (InterruptedException e1) {
      }

    }

  }

}
