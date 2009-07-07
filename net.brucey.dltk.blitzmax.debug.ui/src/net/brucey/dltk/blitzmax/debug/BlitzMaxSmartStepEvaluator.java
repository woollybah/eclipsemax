package net.brucey.dltk.blitzmax.debug;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.debug.core.ISmartStepEvaluator;
import org.eclipse.dltk.debug.core.model.IScriptStackFrame;
import org.eclipse.dltk.debug.core.model.IScriptThread;

public class BlitzMaxSmartStepEvaluator implements ISmartStepEvaluator {

  public BlitzMaxSmartStepEvaluator() {
  }

  public boolean isFiltered(String[] filters, IScriptThread thread) {
    try {
      final IStackFrame topFrame = thread.getTopStackFrame();
      if (topFrame instanceof IScriptStackFrame) {
        final String where = ((IScriptStackFrame) topFrame).getWhere();
        final int colonPos = where.lastIndexOf("::"); //$NON-NLS-1$
        if (colonPos > 0) {
          final String className = where.substring(0, colonPos);
          if (filter(className, filters)) {
            return true;
          }
        } else {
          if (filter(where, filters)) {
            return true;
          }
        }
      }
    } catch (DebugException e) {
      if (DLTKCore.DEBUG) {
        e.printStackTrace();
      }
    }
    return false;
  }

  private boolean filter(String typeQualifiedName, String[] filters) {
    typeQualifiedName = typeQualifiedName.replaceAll("::", "."); //$NON-NLS-1$ //$NON-NLS-2$
    for (int i = 0; i < filters.length; i++) {
      if (filters[i].equals(typeQualifiedName)) {
        return true;
      }
    }
    return false;
  }

}
