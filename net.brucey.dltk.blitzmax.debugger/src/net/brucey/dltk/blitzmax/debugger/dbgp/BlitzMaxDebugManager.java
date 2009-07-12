package net.brucey.dltk.blitzmax.debugger.dbgp;

import net.brucey.dltk.blitzmax.debugger.dbgp.command.Command;
import net.brucey.dltk.blitzmax.debugger.dbgp.command.FeatureGetCommand;
import net.brucey.dltk.blitzmax.debugger.dbgp.command.FeatureSetCommand;

public class BlitzMaxDebugManager {

  private BlitzMaxStdDebugProcessor processor;
  private BlitzMaxIDEDebugProcessor ideProcessor;

  private boolean finish = false;
  private boolean needCommand = false;
  private String transactionId;

  private DebugState state = DebugState.STARTING;

  private static final int MODE_WAITING = 0;
  private static final int MODE_RUNNING = 1;
  private static final int MODE_RUNWAIT = 2;

  private int mode = MODE_WAITING;
  private BlitzMaxFeatures features;

  public BlitzMaxDebugManager(BlitzMaxStdDebugProcessor processor,
      BlitzMaxIDEDebugProcessor ideProcessor) {
    this.processor = processor;
    this.ideProcessor = ideProcessor;

    this.features = new BlitzMaxFeatures();
  }

  public void initIDEProcessor() throws Exception {
    if (!ideProcessor.connect()) {
      // error... need to quit
      throw new Exception("Failed to connect to IDE");
    }
  }

  public void initDebugProcessor() {
    processor.start();
  }

  public void run(String file) {

    // initialise IDE connection
    ideProcessor.init(file);
    needCommand = true;

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

    //if (needCommand) {
    ideProcessor.monitor(needCommand);

    needCommand = false;

    while (!ideProcessor.getCommands().isEmpty()) {

      Command command = ideProcessor.getCommands().remove();

      if (command != null) {

        transactionId = command.getTransactionId();

        switch (command.getType()) {
        case FEATURE_SET:
          String name = ((FeatureSetCommand) command).getName();
          String value = ((FeatureSetCommand) command).getValue();
          boolean supported = features.isSupported(name);
          boolean success = false;

          if (supported) {
            success = features.setValue(name, value);
          }

          ideProcessor.featureSet(transactionId, name, success);

          break;
        case FEATURE_GET:
          name = ((FeatureGetCommand) command).getName();
          supported = features.isSupported(name);

          ideProcessor.featureGet(transactionId, name, supported, features
              .getValue(name));

          break;
        case STATUS:
          // TODO : implement me
          break;
        case BREAK:
          // TODO : implement me
          break;
        case CONTEXT_GET:
          // TODO : implement me
          break;
        case CONTEXT_NAMES:
          // TODO : implement me
          break;
        case DETACH:
          // TODO : implement me
          break;
        case EVAL:
          // TODO : implement me
          break;
        case PROP_GET:
          // TODO : implement me
          break;
        case PROP_SET:
          // TODO : implement me
          break;
        case PROP_VALUE:
          // TODO : implement me
          break;
        case RUN:

          success = true;

          switch (state) {
          case STARTING:
            success = processor.start();

            break;
          case BREAK:
            processor.run();
            break;
          }

          ideProcessor.run(transactionId, state, success);

          if (success) {
            state = DebugState.RUNNING;
            mode = MODE_RUNNING;
          }

          break;
        case STACK_DEPTH:
          // TODO : implement me
          break;
        case STDIN:
          // TODO: set something and redirect
          success = true;
          ideProcessor.stdin(transactionId, success);

          break;
        case STDERR:
          success = true;

          processor.setStderrRedirect(ideProcessor.getStderrRedirect());

          ideProcessor.stderr(transactionId, success);

          break;
        case STDOUT:
          success = true;

          processor.setStdoutRedirect(ideProcessor.getStdoutRedirect());

          ideProcessor.stdout(transactionId, success);

          break;
        case STACK_GET:
          // TODO : implement me
          break;
        case STEP_INTO:
          // TODO : implement me
          break;
        case STEP_OUT:
          // TODO : implement me
          break;
        case STEP_OVER:
          // TODO : implement me
          break;
        case STOP:
          // TODO : implement me
          break;
        }
      } else {
        System.out.println("Null command??");
      }

      //}

      // }
    }
  }

  public void destroy() {
    processor.shutdown();

  }
}
