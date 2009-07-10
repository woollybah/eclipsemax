package net.brucey.dltk.blitzmax.ui.editor;

import net.brucey.dltk.blitzmax.core.BlitzMaxLanguageToolkit;
import net.brucey.dltk.blitzmax.ui.BlitzMaxUIPlugin;
import net.brucey.dltk.blitzmax.ui.text.folding.BlitzMaxFoldingStructureProvider;

import org.eclipse.dltk.core.IDLTKLanguageToolkit;
import org.eclipse.dltk.internal.ui.actions.FoldingActionGroup;
import org.eclipse.dltk.internal.ui.editor.ScriptEditor;
import org.eclipse.dltk.internal.ui.editor.ScriptOutlinePage;
import org.eclipse.dltk.ui.text.ScriptTextTools;
import org.eclipse.dltk.ui.text.folding.IFoldingStructureProvider;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentExtension3;
import org.eclipse.ui.IEditorInput;

public class BlitzMaxEditor extends ScriptEditor {

  public static final String EDITOR_ID = "net.brucey.dltk.blitzmax.ui.editor.BlitzMaxEditor";

  public static final String EDITOR_CONTEXT = "#BlitzMaxEditorContext";

  public static final String RULER_CONTEXT = "#BlitzMaxRulerContext"; //$NON-NLS-1$

  @Override
  protected void initializeEditor() {
    super.initializeEditor();
    setEditorContextMenuId(EDITOR_CONTEXT);
    setRulerContextMenuId(RULER_CONTEXT);
  }

  @Override
  public String getEditorId() {
    return EDITOR_ID;
  }

  @Override
  public IDLTKLanguageToolkit getLanguageToolkit() {
    return BlitzMaxLanguageToolkit.getDefault();
  }

  @Override
  protected IPreferenceStore getScriptPreferenceStore() {
    return BlitzMaxUIPlugin.getDefault().getPreferenceStore();
  }

  @Override
  public ScriptTextTools getTextTools() {
    return BlitzMaxUIPlugin.getDefault().getTextTools();
  }

  @Override
  protected ScriptOutlinePage doCreateOutlinePage() {
    return new BlitzMaxOutlinePage(this, BlitzMaxUIPlugin.getDefault()
        .getPreferenceStore());
  }

  @Override
  protected void connectPartitioningToElement(IEditorInput input,
      IDocument document) {
    if (document instanceof IDocumentExtension3) {
      IDocumentExtension3 extension = (IDocumentExtension3) document;
      if (extension
          .getDocumentPartitioner(IBlitzMaxPartitions.BLITZMAX_PARTITIONING) == null) {
        BlitzMaxDocumentSetupParticipant participant = new BlitzMaxDocumentSetupParticipant();
        participant.setup(document);
      }
    }
  }

  private IFoldingStructureProvider foldingProvider = null;

  @Override
  protected IFoldingStructureProvider getFoldingStructureProvider() {
    if (foldingProvider == null) {
      foldingProvider = new BlitzMaxFoldingStructureProvider();
    }
    return foldingProvider;
  }

  @Override
  protected FoldingActionGroup createFoldingActionGroup() {
    return new FoldingActionGroup(this, getViewer(), BlitzMaxUIPlugin
        .getDefault().getPreferenceStore());
  }

}
