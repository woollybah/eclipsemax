package net.brucey.dltk.blitzmax.ui.editor;

import net.brucey.dltk.blitzmax.ui.text.BlitzMaxCodeScanner;
import net.brucey.dltk.blitzmax.ui.text.BlitzMaxOutlineInformationControl;
import net.brucey.dltk.blitzmax.ui.text.BlitzMaxRemScanner;
import net.brucey.dltk.blitzmax.ui.text.BlitzMaxScriptCommentScanner;
import net.brucey.dltk.blitzmax.ui.text.IBlitzMaxColorConstants;

import org.eclipse.dltk.compiler.task.ITodoTaskPreferences;
import org.eclipse.dltk.ui.text.AbstractScriptScanner;
import org.eclipse.dltk.ui.text.IColorManager;
import org.eclipse.dltk.ui.text.ScriptPresentationReconciler;
import org.eclipse.dltk.ui.text.ScriptSourceViewerConfiguration;
import org.eclipse.dltk.ui.text.SingleTokenScriptScanner;
import org.eclipse.dltk.ui.text.completion.ContentAssistPreference;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.DefaultIndentLineAutoEditStrategy;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IInformationControl;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.information.IInformationProvider;
import org.eclipse.jface.text.information.InformationPresenter;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.texteditor.ITextEditor;

public class BlitzMaxSourceViewerConfiguration extends
    ScriptSourceViewerConfiguration {

  private AbstractScriptScanner codeScanner;
  private AbstractScriptScanner stringScanner;
  private AbstractScriptScanner commentScanner;
  private AbstractScriptScanner remScanner;

  public BlitzMaxSourceViewerConfiguration(IColorManager colorManager,
      IPreferenceStore preferenceStore, ITextEditor editor, String partitioning) {
    super(colorManager, preferenceStore, editor, partitioning);
  }

  @Override
  public IAutoEditStrategy[] getAutoEditStrategies(ISourceViewer sourceViewer,
      String contentType) {
    return new IAutoEditStrategy[] { new DefaultIndentLineAutoEditStrategy() };
  }

  @Override
  public String[] getIndentPrefixes(ISourceViewer sourceViewer,
      String contentType) {
    return new String[] { "\t", "    " };
  }

  @Override
  protected ContentAssistPreference getContentAssistPreference() {
    return BlitzMaxContentAssistPreference.getDefault();
  }

  @Override
  protected IInformationControlCreator getOutlinePresenterControlCreator(
      ISourceViewer sourceViewer, final String commandId) {
    return new IInformationControlCreator() {
      public IInformationControl createInformationControl(Shell parent) {
        int shellStyle = SWT.RESIZE;
        int treeStyle = SWT.V_SCROLL | SWT.H_SCROLL;
        return new BlitzMaxOutlineInformationControl(parent, shellStyle,
            treeStyle, commandId);
      }
    };
  }

  @Override
  public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
    return IBlitzMaxPartitions.BLITZMAX_PARITION_TYPES;
  }

  @Override
  protected void initializeScanners() {
    this.codeScanner = new BlitzMaxCodeScanner(this.getColorManager(),
        this.fPreferenceStore);
    this.stringScanner = new SingleTokenScriptScanner(this.getColorManager(),
        this.fPreferenceStore, IBlitzMaxColorConstants.BLITZMAX_STRING);
    this.commentScanner = createCommentScanner(
        IBlitzMaxColorConstants.BLITZMAX_SINGLE_LINE_COMMENT,
        IBlitzMaxColorConstants.BLITZMAX_TODO_COMMENT);
    this.remScanner = new BlitzMaxRemScanner(this.getColorManager(),
        this.fPreferenceStore);
  }

  @Override
  protected AbstractScriptScanner createCommentScanner(String commentColor,
      String tagColor, ITodoTaskPreferences taskPrefs) {
    return new BlitzMaxScriptCommentScanner(getColorManager(),
        fPreferenceStore, commentColor, tagColor, taskPrefs);
  }

  @Override
  public IPresentationReconciler getPresentationReconciler(
      ISourceViewer sourceViewer) {
    PresentationReconciler reconciler = new ScriptPresentationReconciler();
    reconciler.setDocumentPartitioning(this
        .getConfiguredDocumentPartitioning(sourceViewer));

    DefaultDamagerRepairer dr = new DefaultDamagerRepairer(this.codeScanner);
    reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
    reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);

    dr = new DefaultDamagerRepairer(this.stringScanner);
    reconciler.setDamager(dr, IBlitzMaxPartitions.BLITZMAX_STRING);
    reconciler.setRepairer(dr, IBlitzMaxPartitions.BLITZMAX_STRING);

    dr = new DefaultDamagerRepairer(this.remScanner);
    reconciler.setDamager(dr, IBlitzMaxPartitions.BLITZMAX_MULTILINE_COMMENT);
    reconciler.setRepairer(dr, IBlitzMaxPartitions.BLITZMAX_MULTILINE_COMMENT);

    dr = new DefaultDamagerRepairer(this.commentScanner);
    reconciler.setDamager(dr, IBlitzMaxPartitions.BLITZMAX_COMMENT);
    reconciler.setRepairer(dr, IBlitzMaxPartitions.BLITZMAX_COMMENT);

    return reconciler;
  }

  @Override
  public void handlePropertyChangeEvent(PropertyChangeEvent event) {
    if (this.codeScanner.affectsBehavior(event)) {
      this.codeScanner.adaptToPreferenceChange(event);
    }
    if (this.stringScanner.affectsBehavior(event)) {
      this.stringScanner.adaptToPreferenceChange(event);
    }
    if (this.commentScanner.affectsBehavior(event)) {
      this.commentScanner.adaptToPreferenceChange(event);
    }
    if (this.remScanner.affectsBehavior(event)) {
      this.remScanner.adaptToPreferenceChange(event);
    }
  }

  @Override
  public boolean affectsTextPresentation(PropertyChangeEvent event) {
    return codeScanner.affectsBehavior(event)
        || stringScanner.affectsBehavior(event)
        || commentScanner.affectsBehavior(event)
        || remScanner.affectsBehavior(event);
  }

  @Override
  protected void alterContentAssistant(ContentAssistant assistant) {
    // IDocument.DEFAULT_CONTENT_TYPE
    IContentAssistProcessor scriptProcessor = new BlitzMaxCompletionProcessor(
        getEditor(), assistant, IDocument.DEFAULT_CONTENT_TYPE);
    assistant.setContentAssistProcessor(scriptProcessor,
        IDocument.DEFAULT_CONTENT_TYPE);
    assistant.setContentAssistProcessor(scriptProcessor,
        IBlitzMaxPartitions.BLITZMAX_STRING);
  }

  @Override
  protected void initializeQuickOutlineContexts(InformationPresenter presenter,
      IInformationProvider provider) {
    presenter.setInformationProvider(provider,
        IBlitzMaxPartitions.BLITZMAX_COMMENT);
    presenter.setInformationProvider(provider,
        IBlitzMaxPartitions.BLITZMAX_MULTILINE_COMMENT);
    presenter.setInformationProvider(provider,
        IBlitzMaxPartitions.BLITZMAX_STRING);
  }

}
