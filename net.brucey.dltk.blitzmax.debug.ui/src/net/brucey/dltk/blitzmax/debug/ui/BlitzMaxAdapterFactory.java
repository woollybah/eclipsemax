package net.brucey.dltk.blitzmax.debug.ui;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.debug.internal.ui.viewers.model.provisional.IColumnPresentationFactory;
import org.eclipse.debug.internal.ui.viewers.model.provisional.IElementLabelProvider;
import org.eclipse.dltk.debug.core.model.IScriptStackFrame;
import org.eclipse.dltk.debug.core.model.IScriptVariable;

public class BlitzMaxAdapterFactory implements IAdapterFactory {

  private static final IColumnPresentationFactory columnPresentation = new BlitzMaxVariableColumnPresentationFactory();

  private static final IElementLabelProvider labelProvider = new BlitzMaxVariableLabelProvider();

  public Object getAdapter(Object adaptableObject, Class adapterType) {
    if (adaptableObject instanceof IScriptStackFrame) {
      if (IColumnPresentationFactory.class.equals(adapterType)) {
        return columnPresentation;
      }
    }

    if (adaptableObject instanceof IScriptVariable) {
      if (IElementLabelProvider.class.equals(adapterType)) {
        return labelProvider;
      }
    }

    return null;
  }

  public Class[] getAdapterList() {
    return new Class[] { IColumnPresentationFactory.class,
        IElementLabelProvider.class };
  }
}
