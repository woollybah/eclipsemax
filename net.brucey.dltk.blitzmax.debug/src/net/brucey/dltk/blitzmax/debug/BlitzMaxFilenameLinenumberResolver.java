package net.brucey.dltk.blitzmax.debug;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.variables.IDynamicVariable;
import org.eclipse.core.variables.IDynamicVariableResolver;

public class BlitzMaxFilenameLinenumberResolver implements
    IDynamicVariableResolver {

  public String resolveValue(IDynamicVariable variable, String argument)
      throws CoreException {
    // FIXME : This should return a regex for determining file, line etc of
    // variable.
    return null;
  }

}
