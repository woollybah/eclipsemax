package net.brucey.dltk.blitzmax.ui;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.dltk.compiler.task.ITodoTaskPreferences;
import org.eclipse.dltk.compiler.task.TaskTagUtils;
import org.eclipse.dltk.compiler.util.Util;
import org.eclipse.dltk.ui.editor.highlighting.SemanticHighlightingUtils;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.editors.text.EditorsUI;

public class BlitzMaxUIPreferenceInitializer extends
    AbstractPreferenceInitializer {

  public void initializeDefaultPreferences() {
    IPreferenceStore store = BlitzMaxUIPlugin.getDefault().getPreferenceStore();

    EditorsUI.useAnnotationsPreferencePage(store);
    EditorsUI.useQuickDiffPreferencePage(store);
    BlitzMaxPreferenceConstants.initializeDefaultValues(store);
    SemanticHighlightingUtils.initializeDefaultValues(store, BlitzMaxUIPlugin
        .getDefault().getTextTools().getSemanticHighlightings());
    store.setDefault(BlitzMaxPreferenceConstants.FORMATTER_ID,
        Util.EMPTY_STRING);

    // TODO : this section mirrors TaskTagUtils.initializeDefaultValues()
    store.setDefault(ITodoTaskPreferences.ENABLED, true);
    store.setDefault(ITodoTaskPreferences.CASE_SENSITIVE, true);
    store.setDefault(ITodoTaskPreferences.TAGS, TaskTagUtils
        .encodeTaskTags(TaskTagUtils.getDefaultTags()));

  }

}
