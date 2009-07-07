package net.brucey.dltk.blitzmax.debug.ui;

import org.eclipse.debug.internal.ui.elements.adapters.VariableColumnPresentation;

public class BlitzMaxVariableColumnPresentation extends
    VariableColumnPresentation {
  /**
   * Constant identifier for the Java variable column presentation.
   */
  public final static String BLITZMAX_VARIABLE_COLUMN_PRESENTATION = "BlitzMax" + ".VARIABLE_COLUMN_PRESENTATION"; //$NON-NLS-1$ //$NON-NLS-2$
  /**
   * Default column identifiers
   */
  public final static String COLUMN_INSTANCE_ID = BLITZMAX_VARIABLE_COLUMN_PRESENTATION
      + ".COL_INSTANCE_ID"; //$NON-NLS-1$

  /**
   * Column ids
   */
  private static String[] fgAllColumns = null;

  @Override
  public String[] getAvailableColumns() {
    if (fgAllColumns == null) {
      String[] basic = super.getAvailableColumns();
      fgAllColumns = new String[basic.length + 1];
      System.arraycopy(basic, 0, fgAllColumns, 0, basic.length);
      fgAllColumns[basic.length] = COLUMN_INSTANCE_ID;
    }
    return fgAllColumns;
  }

  @Override
  public String getHeader(String id) {
    if (COLUMN_INSTANCE_ID.equals(id)) {
      return "Object ID"; //$NON-NLS-1$
    }

    return super.getHeader(id);
  }

  @Override
  public String getId() {
    return BLITZMAX_VARIABLE_COLUMN_PRESENTATION;
  }
}