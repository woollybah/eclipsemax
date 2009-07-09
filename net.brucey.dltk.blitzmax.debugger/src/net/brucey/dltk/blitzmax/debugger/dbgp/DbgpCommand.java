/*******************************************************************************
 * Copyright (c) 2006, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial implementation
 *******************************************************************************/
package net.brucey.dltk.blitzmax.debugger.dbgp;

public class DbgpCommand {

  private static final String id = " -i ";

  // -------------------------------------------------------------------------
  // status and feature management commands
  // -------------------------------------------------------------------------
  public static final String status = "status";
  public static final String featureGet = "feature_get";
  public static final String featureSet = "feature_set";

  // -------------------------------------------------------------------------
  // execution commands "cmd -i id"
  // -------------------------------------------------------------------------
  public static final String run = "run";
  public static final String stepInto = "step_into";
  public static final String stepOver = "step_over";
  public static final String StepOut = "step_out";
  public static final String stop = "stop";
  public static final String detach = "detach";

  // -------------------------------------------------------------------------
  // breakpoint cmds
  // -------------------------------------------------------------------------
  // breakpoint_set -i id [arguments] -- base64(expression)
  // arguments are:
  // -t type: line/call/return/conditional/exception/watch
  // -s state: enabled/disabled
  // -f filename
  // -n lineno
  // -m function
  // -x exception
  // -h hit_value
  // -o hit_condidtion
  // -r 0|1
  // expression in php for conditional breakpoints
  public static final String breakPointSet = "breakpoint_set";

  // breakpoint_get -i id -d bp_id (bp_id = breakpoint id);
  public static final String breakPointGet = "breakpoint_get";

  // breakpoint_update -i id -d bp_id [arguments]
  // -s
  // -n
  // -h
  // -o
  public static final String breakPointUpdate = "breakpoint_update";

  // breakpoint_remove -i id -d bp_id
  public static final String breakPointRemove = "breakpoint_remove";

  // breakpoint_list -i id
  public static final String breakPointList = "breakpoint_list";

  // -------------------------------------------------------------------------
  // stack commands
  // -------------------------------------------------------------------------
  // stack-depth -i id
  public static final String stackDepth = "stack-depth";

  // stack_get -i id -d depth (-d is optional)
  public static final String stackGet = "stack_get";

  // -------------------------------------------------------------------------
  // variable/streams management commands
  // -------------------------------------------------------------------------
  // property_set -i id -n property_long_name -d {NUM} -l data_length -- {DATA}
  public static final String propSet = "property_set";

  // property_get -i id -n property_long_name
  public static final String propGet = "property_get";

  // property_value -i id -n property_long_name
  public static final String propValue = "property_value";

  // context_get -i id -d depth
  public static final String contextGet = "context_get";

  // eval -i id -- {DATA}
  public static final String eval = "eval";

  // stdout/stderr -i id -c 0|1|2
  public static final String stdout = "stdout";
  public static final String stderr = "stderr";

  // break
  public static final String suspend = "break";

  // Socket socket;
  // OutputStreamWriter outStream;

  // private static int trId = 0;
  // private static Object idMonitor = new Object();

  // private int lastIdSent;
  // private String lastCmdSent;

  // public String getLastCmdSent() {
  // return lastCmdSent;
  // }

  public DbgpCommand() {
  }

  /**
   * Parses incoming command from the IDE.
   * 
   * @param command
   */
  public void parseCommand(byte[] command) {

    String cmd = new String(command);
    String[] cmdParts = cmd.split(" ");

    CommandType type = CommandType.fromString(cmdParts[0]);

  }

}
