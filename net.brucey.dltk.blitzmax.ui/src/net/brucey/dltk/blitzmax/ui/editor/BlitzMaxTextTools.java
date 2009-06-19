package net.brucey.dltk.blitzmax.ui.editor;

import org.eclipse.dltk.ui.text.ScriptSourceViewerConfiguration;
import org.eclipse.dltk.ui.text.ScriptTextTools;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;
import org.eclipse.ui.texteditor.ITextEditor;

public class BlitzMaxTextTools extends ScriptTextTools {

  private final static String[] LEGAL_CONTENT_TYPES = new String[] {
      IBlitzMaxPartitions.BLITZMAX_STRING,
      IBlitzMaxPartitions.BLITZMAX_COMMENT,
      IBlitzMaxPartitions.BLITZMAX_MULTILINE_COMMENT };

  private IPartitionTokenScanner partitionScanner;

  public BlitzMaxTextTools(boolean autoDisposeOnDisplayDispose) {

    super(IBlitzMaxPartitions.BLITZMAX_PARTITIONING, LEGAL_CONTENT_TYPES,
        autoDisposeOnDisplayDispose);

    partitionScanner = new BlitzMaxPartitionScanner();
  }

  @Override
  public ScriptSourceViewerConfiguration createSourceViewerConfiguraton(
      IPreferenceStore preferenceStore, ITextEditor editor, String partitioning) {

    return new BlitzMaxSourceViewerConfiguration(getColorManager(),
        preferenceStore, editor, partitioning);

  }

  public IPartitionTokenScanner getPartitionScanner() {
    return partitionScanner;
  }

}
