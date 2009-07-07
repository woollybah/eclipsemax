package net.brucey.dltk.blitzmax.ui.wizards;

import java.util.Observable;
import java.util.Observer;

import net.brucey.dltk.blitzmax.core.BlitzMaxNature;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.dltk.internal.ui.wizards.dialogfields.DialogField;
import org.eclipse.dltk.internal.ui.wizards.dialogfields.IDialogFieldListener;
import org.eclipse.dltk.internal.ui.wizards.dialogfields.LayoutUtil;
import org.eclipse.dltk.internal.ui.wizards.dialogfields.StringDialogField;
import org.eclipse.dltk.ui.dialogs.StatusInfo;
import org.eclipse.dltk.ui.wizards.ProjectWizardFirstPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

/**
 * The first page of the <code>SimpleProjectWizard</code>.
 */
public class BlitzMaxProjectWizardFirstPage extends ProjectWizardFirstPage {
  private GenerateGroup fGenerateGroup;

  @Override
  protected IInterpreterGroup createInterpreterGroup(Composite parent) {
    return new BlitzMaxInterpreterGroup(parent);
  }

  @Override
  protected boolean interpeterRequired() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  protected IStatus validateProject() {
    final String mainScript = fGenerateGroup.getMainScript();
    // check whether the main script name field is empty
    if (mainScript.length() == 0) {
      return new StatusInfo(IStatus.OK, "Enter a main script name.");
      //          NewWizardMessages.ScriptProjectWizardFirstPage_Message_enterProjectName);
    }
    final String releaseExecutable = fGenerateGroup.getReleaseExecutable();
    // check whether the release executable name field is empty
    if (releaseExecutable.length() == 0) {
      return new StatusInfo(IStatus.OK, "Enter a release executable name.");
      //          NewWizardMessages.ScriptProjectWizardFirstPage_Message_enterProjectName);
    }
    final String debugExecutable = fGenerateGroup.getDebugExecutable();
    // check whether the debug executable name field is empty
    if (debugExecutable.length() == 0) {
      return new StatusInfo(IStatus.OK, "Enter a debug executable name.");
      //          NewWizardMessages.ScriptProjectWizardFirstPage_Message_enterProjectName);
    }
    return super.validateProject();
  }

  @Override
  protected void createCustomGroups(Composite composite) {
    fGenerateGroup = createGenerateGroup(composite);
    fNameGroup.addObserver(fGenerateGroup);
  }

  private GenerateGroup createGenerateGroup(Composite composite) {
    return new GenerateGroup(composite);
  }

  private class GenerateGroup extends Observable implements Observer,
      IDialogFieldListener {
    private StringDialogField fMainScriptField;
    private StringDialogField fReleaseExecutableField;
    private StringDialogField fDebugExecutableField;

    @SuppressWarnings("restriction")
    public GenerateGroup(Composite composite) {
      final Group generateGroup = new Group(composite, SWT.NONE);
      generateGroup.setFont(composite.getFont());
      final GridLayout groupLayout = initGridLayout(new GridLayout(2, false),
          true);
      groupLayout.marginHeight /= 2;
      generateGroup.setLayout(groupLayout);
      generateGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
      generateGroup.setText("Generation");

      // text field for main script file
      fMainScriptField = new StringDialogField();
      fMainScriptField.setLabelText("Main Script:");
      //NewWizardMessages.ScriptProjectWizardFirstPage_NameGroup_label_text);
      fMainScriptField.setDialogFieldListener(this);
      fMainScriptField.doFillIntoGrid(generateGroup, 2);
      LayoutUtil.setHorizontalGrabbing(fMainScriptField.getTextControl(null));

      // text field for release executable
      fReleaseExecutableField = new StringDialogField();
      fReleaseExecutableField.setLabelText("Release Executable:");
      fReleaseExecutableField.setDialogFieldListener(this);
      fReleaseExecutableField.doFillIntoGrid(generateGroup, 2);
      LayoutUtil.setHorizontalGrabbing(fReleaseExecutableField
          .getTextControl(null));

      // text field for debug executable
      fDebugExecutableField = new StringDialogField();
      fDebugExecutableField.setLabelText("Debug Executable:");
      fDebugExecutableField.setDialogFieldListener(this);
      fDebugExecutableField.doFillIntoGrid(generateGroup, 2);
      LayoutUtil.setHorizontalGrabbing(fDebugExecutableField
          .getTextControl(null));
    }

    public void update(Observable o, Object arg) {
      if (o == fNameGroup) {
        String name = fNameGroup.getName();
        while (name.startsWith(".")) {
          name = name.substring(1);
        }
        while (name.endsWith(".")) {
          name = name.substring(0, name.length() - 1);
        }
        if (name.equals("")) {
          fMainScriptField.setText("");
          fReleaseExecutableField.setText("");
          fDebugExecutableField.setText("");
        } else {
          fMainScriptField.setText(name + ".bmx");
          fReleaseExecutableField.setText(name + ".exe");
          fDebugExecutableField.setText(name + ".debug.exe");
        }
      }
    }

    protected void fireEvent() {
      setChanged();
      notifyObservers();
    }

    public void dialogFieldChanged(DialogField field) {
      fireEvent();
    }

    public String getMainScript() {
      return fMainScriptField.getText().trim();
    }

    public void setMainScript(String mainScript) {
      fMainScriptField.setText(mainScript);
    }

    public String getReleaseExecutable() {
      return fReleaseExecutableField.getText().trim();
    }

    public void setReleaseExecutable(String releaseExecutable) {
      fReleaseExecutableField.setText(releaseExecutable);
    }

    public String getDebugExecutable() {
      return fDebugExecutableField.getText().trim();
    }

    public void setDebugExecutable(String debugExecutable) {
      fDebugExecutableField.setText(debugExecutable);
    }
  }

  final class BlitzMaxInterpreterGroup extends AbstractInterpreterGroup {
    public BlitzMaxInterpreterGroup(Composite composite) {
      super(composite);
    }

    @Override
    protected String getCurrentLanguageNature() {
      return BlitzMaxNature.BLITZMAX_NATURE;
    }

    @Override
    protected String getIntereprtersPreferencePageId() {
      return "net.brucey.dltk.blitzmax.preferences.interpreters"; //$NON-NLS-1$
    }

    @Override
    protected boolean isTargetEnvironmentAllowed() {
      return false;
    }
  }
}
