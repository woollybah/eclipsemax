package net.brucey.dltk.blitzmax.debug.ui.preferences;

import net.brucey.dltk.blitzmax.core.BlitzMaxNature;
import net.brucey.dltk.blitzmax.debug.BlitzMaxDebugPlugin;

import org.eclipse.core.resources.IProject;
import org.eclipse.dltk.ui.PreferencesAdapter;
import org.eclipse.dltk.ui.preferences.AbstractConfigurationBlockPropertyAndPreferencePage;
import org.eclipse.dltk.ui.preferences.AbstractOptionsBlock;
import org.eclipse.dltk.ui.util.IStatusChangeListener;
import org.eclipse.ui.preferences.IWorkbenchPreferenceContainer;

public class BlitzMaxDebugPreferencePage extends
    AbstractConfigurationBlockPropertyAndPreferencePage {

  private static String PREFERENCE_PAGE_ID = "net.brucey.dltk.blitzmax.preferences.debug"; //$NON-NLS-1$
  private static String PROPERTY_PAGE_ID = "net.brucey.dltk.blitzmax.propertyPage.debug"; //$NON-NLS-1$

  @Override
  protected AbstractOptionsBlock createOptionsBlock(
      IStatusChangeListener newStatusChangedListener, IProject project,
      IWorkbenchPreferenceContainer container) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  protected String getHelpId() {
    return null;
  }

  @Override
  protected String getProjectHelpId() {
    return null;
  }

  @Override
  protected void setDescription() {
    setDescription("General settings for BlitzMax Debugging");
  }

  @Override
  protected void setPreferenceStore() {
    setPreferenceStore(new PreferencesAdapter(BlitzMaxDebugPlugin.getDefault()
        .getPluginPreferences()));
  }

  @Override
  protected String getPreferencePageId() {
    return PREFERENCE_PAGE_ID;
  }

  @Override
  protected String getPropertyPageId() {
    return PROPERTY_PAGE_ID;
  }

  @Override
  protected String getNatureId() {
    return BlitzMaxNature.BLITZMAX_NATURE;
  }

}
