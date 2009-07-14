package net.brucey.dltk.blitzmax.debug;

import org.eclipse.dltk.debug.core.model.AtomicScriptType;
import org.eclipse.dltk.debug.core.model.ComplexScriptType;
import org.eclipse.dltk.debug.core.model.IScriptType;
import org.eclipse.dltk.debug.core.model.IScriptTypeFactory;
import org.eclipse.dltk.debug.core.model.StringScriptType;

public class BlitzMaxTypeFactory implements IScriptTypeFactory {

  private static final String[] atomicTypes = { "Byte", "Short", "Int", "Long",
      "Float", "Double" };

  public IScriptType buildType(String type) {
    if (STRING.equalsIgnoreCase(type)) {
      return new StringScriptType(type);
    }
    for (int i = 0; i < atomicTypes.length; ++i) {
      if (atomicTypes[i].equals(type)) {
        return new AtomicScriptType(type);
      }
    }

    return new ComplexScriptType(type);
  }

}
