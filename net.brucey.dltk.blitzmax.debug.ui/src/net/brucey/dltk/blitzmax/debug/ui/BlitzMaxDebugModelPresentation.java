package net.brucey.dltk.blitzmax.debug.ui;

import net.brucey.dltk.blitzmax.ui.editor.BlitzMaxEditor;

import org.eclipse.dltk.debug.core.model.IScriptValue;
import org.eclipse.dltk.debug.ui.ScriptDebugModelPresentation;
import org.eclipse.dltk.internal.ui.editor.EditorUtility;
import org.eclipse.ui.IEditorInput;

public class BlitzMaxDebugModelPresentation extends
    ScriptDebugModelPresentation {

  @Override
  public String getEditorId(IEditorInput input, Object element) {
    String editorId = EditorUtility.getEditorID(input, element);
    if (editorId == null) {
      editorId = BlitzMaxEditor.EDITOR_ID;
    }

    return editorId;
  }

  @Override
  public String getDetailPaneText(IScriptValue value) {
    return value.getRawValue();
  }
}
