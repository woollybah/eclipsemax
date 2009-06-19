package net.brucey.dltk.blitzmax.ui.editor;

import org.eclipse.jface.text.IDocument;

public interface IBlitzMaxPartitions {

  public final static String BLITZMAX_PARTITIONING = "__blitzmax_partitioning";
  public final static String BLITZMAX_COMMENT = "__blitzmax_comment";
  public final static String BLITZMAX_STRING = "__blitzmax_string";
  public final static String BLITZMAX_MULTILINE_COMMENT = "__blitzmax_multiline_comment";

  public final static String[] BLITZMAX_PARITION_TYPES = new String[] {
      IDocument.DEFAULT_CONTENT_TYPE, IBlitzMaxPartitions.BLITZMAX_STRING,
      IBlitzMaxPartitions.BLITZMAX_COMMENT,
      IBlitzMaxPartitions.BLITZMAX_MULTILINE_COMMENT };

}
