package net.brucey.dltk.blitzmax.debugger.dbgp;

public enum CommandType {

  STATUS, FEATURE_GET, FEATURE_SET, RUN, STEP_INTO, STEP_OUT, STEP_OVER, STOP, DETACH, STACK_DEPTH, STACK_GET, PROP_SET, PROP_GET, PROP_VALUE, CONTEXT_GET, EVAL, STDOUT, STDERR, BREAK,

  UNKOWN;

  public static CommandType fromString(String cmd) {
    if (("status").equals(cmd)) {
      return STATUS;
    } else if (("feature_get").equals(cmd)) {
      return FEATURE_GET;
    } else if (("feature_set").equals(cmd)) {
      return FEATURE_SET;
    } else if (("run").equals(cmd)) {
      return RUN;
    } else if (("step_into").equals(cmd)) {
      return STEP_INTO;
    } else if (("step_out").equals(cmd)) {
      return STEP_OUT;
    } else if (("step_over").equals(cmd)) {
      return STEP_OVER;
    } else if (("stop").equals(cmd)) {
      return STOP;
    } else if (("detach").equals(cmd)) {
      return DETACH;
    } else if (("stack-depth").equals(cmd)) {
      return STACK_DEPTH;
    } else if (("stack_get").equals(cmd)) {
      return STACK_GET;
    } else if (("property_set").equals(cmd)) {
      return PROP_SET;
    } else if (("property_get").equals(cmd)) {
      return PROP_GET;
    } else if (("property_value").equals(cmd)) {
      return PROP_VALUE;
    } else if (("context_get").equals(cmd)) {
      return CONTEXT_GET;
    } else if (("eval").equals(cmd)) {
      return EVAL;
    } else if (("stdout").equals(cmd)) {
      return STDOUT;
    } else if (("stderr").equals(cmd)) {
      return STDERR;
    } else if (("break").equals(cmd)) {
      return BREAK;
    }
    return UNKOWN;
  }
}
