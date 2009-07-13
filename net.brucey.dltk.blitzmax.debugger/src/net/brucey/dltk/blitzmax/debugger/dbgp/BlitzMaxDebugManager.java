package net.brucey.dltk.blitzmax.debugger.dbgp;

import java.util.List;

import net.brucey.dltk.blitzmax.debugger.dbgp.command.Command;
import net.brucey.dltk.blitzmax.debugger.dbgp.command.ContextNamesCommand;
import net.brucey.dltk.blitzmax.debugger.dbgp.command.FeatureGetCommand;
import net.brucey.dltk.blitzmax.debugger.dbgp.command.FeatureSetCommand;
import net.brucey.dltk.blitzmax.debugger.dbgp.command.StackGetCommand;

public class BlitzMaxDebugManager {

  private final BlitzMaxStdDebugProcessor processor;
  private final BlitzMaxIDEDebugProcessor ideProcessor;

  private boolean finish = false;
  private boolean needCommand = false;
  private String transactionId;

  private DebugState state = DebugState.STARTING;

  private static final int MODE_WAITING = 0;
  private static final int MODE_RUNNING = 1;
  private static final int MODE_RUNWAIT = 2;

  private int mode = MODE_WAITING;
  private final BlitzMaxFeatures features;

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

    while (!finish && (!state.equals(DebugState.STOPPED))) {

      // check the IDE commands.
      checkForCommands();

      if (mode > MODE_WAITING) {
        // check the app buffers
        finish = processor.monitor();

        checkForBreak();

      }
      // sleep a little
      try {
        Thread.sleep(20);
      } catch (InterruptedException e1) {
      }

    }

  }

  private void checkForBreak() {

    // we are currently stopped? (perhaps due to DebugStop, or step, etc.
    if (processor.getBreakpointHandler().hasDebugStopped()) {
      state = DebugState.BREAK;
      ideProcessor.breakpoint(transactionId);
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

          List<BlitzMaxStackScope> stack = processor
              .stackGet(((ContextNamesCommand) command).getDepth());

          ideProcessor.contextNames(transactionId, stack);

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

          // ideProcessor.run(transactionId, state, success); - spec says doesn't expect response yet.

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
          stack = processor.stackGet(((StackGetCommand) command).getDepth());

          ideProcessor.stackGet(transactionId, stack);

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
          processor.shutdown();

          state = DebugState.STOPPING;

          ideProcessor.stop(transactionId, state);

          state = DebugState.STOPPED;

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
