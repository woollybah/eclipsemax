package net.brucey.dltk.blitzmax.debug.ui;

import org.eclipse.debug.internal.ui.model.elements.VariableEditor;
import org.eclipse.debug.internal.ui.viewers.model.provisional.IPresentationContext;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.swt.widgets.Composite;

public class BlitzMaxVariableEditor extends VariableEditor {

  @Override
  public ICellModifier getCellModifier(IPresentationContext context,
      Object element) {
    return null;
  }

  @Override
  public CellEditor getCellEditor(IPresentationContext context,
      String columnId, Object element, Composite parent) {
    //if (element instanceof IScriptVariable) {
    //IScriptVariable  var = (IScriptVariable)element;
    //if (JavaVariableCellModifier.isBoolean(var)) {
    //return new ComboBoxCellEditor(parent, new String[]{Boolean.toString(true), Boolean.toString(false)}, SWT.READ_ONLY);
    //}
    //}
    return super.getCellEditor(context, columnId, element, parent);
  }

}