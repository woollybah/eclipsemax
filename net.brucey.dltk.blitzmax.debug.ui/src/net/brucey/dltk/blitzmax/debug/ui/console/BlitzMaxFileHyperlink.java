package net.brucey.dltk.blitzmax.debug.ui.console;

import java.io.File;
import java.io.IOException;

import net.brucey.dltk.blitzmax.core.BlitzMaxLanguageToolkit;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.dltk.core.IDLTKLanguageToolkit;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.debug.core.DLTKDebugPlugin;
import org.eclipse.dltk.debug.ui.DLTKDebugUIPlugin;
import org.eclipse.dltk.internal.ui.editor.EditorUtility;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IRegion;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.console.IHyperlink;
import org.eclipse.ui.console.TextConsole;
import org.eclipse.ui.ide.IDE;

/**
 * A hyper link from a stack trace line of the form "*(*.bmx:*)"
 */
public class BlitzMaxFileHyperlink implements IHyperlink {

  private static final String ERROR_UNKNOWN_HYPERLINK = "Unknown hyperlink"; //$NON-NLS-1$

  private static final String ERROR_NO_COLON_IN_LINK = "No ':' in link"; //$NON-NLS-1$

  static final boolean DEBUG = false;

  private final TextConsole fConsole;

  public BlitzMaxFileHyperlink(TextConsole console) {
    fConsole = console;
  }

  public void linkEntered() {
  }

  public void linkExited() {
  }

  public void linkActivated() {
    final String fileName;
    int lineNumber;
    try {
      final String linkText = getLinkText();
      fileName = extractFileName(linkText);
      lineNumber = extractLineNumber(linkText);
    } catch (IllegalArgumentException e) {
      DLTKDebugPlugin.log(e);
      return;
    }
    try {
      final Object element = findSourceModule(fileName);
      if (element == null) {
        // did not find source
        MessageDialog
            .openInformation(
                DLTKDebugUIPlugin.getActiveWorkbenchShell(),
                ConsoleMessages.BlitzMaxFileHyperlink_Information_1,
                NLS
                    .bind(
                        ConsoleMessages.BlitzMaxFileHyperlink_Source_not_found_for__0__2,
                        new Object[] { fileName }));
        return;
      }
      openInEditor(element, lineNumber);
    } catch (CoreException e) {
      DLTKDebugUIPlugin
          .errorDialog(
              ConsoleMessages.BlitzMaxFileHyperlink_An_exception_occurred_while_following_link__3,
              e);
    }
  }

  /**
   * Opens the editor on the specified element and line number
   * 
   * @param element
   * @param lineNumber
   *          line number starting at 1
   * @throws CoreException
   */
  public static void openInEditor(final Object element, int lineNumber)
      throws CoreException {
    final IEditorInput input = EditorUtility.getEditorInput(element);
    if (input == null) {
      return;
    }
    final IEditorDescriptor descriptor = IDE.getEditorDescriptor(input
        .getName());
    final IWorkbenchPage page = DLTKDebugUIPlugin.getActivePage();
    final IEditorPart editor = page.openEditor(input, descriptor.getId());
    // documents start at 0
    if (lineNumber > 0) {
      lineNumber--;
    }
    EditorUtility.revealInEditor(editor, lineNumber);
  }

  /**
   * Finds {@link IFile} or {@link ISourceModule} matching the specified file
   * name
   * 
   * @param fileName
   * @return
   */
  public static Object findSourceModule(String fileName) {
    final IPath path = Path.fromOSString(fileName);
    final IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
    final IFile[] files = root.findFilesForLocation(path);
    if (files.length != 0) {
      return files[0];
    }
    if (DEBUG) {
      System.out.println("File for " + path + " is not found"); //$NON-NLS-1$ //$NON-NLS-2$
    }
    final IDLTKLanguageToolkit toolkit = BlitzMaxLanguageToolkit.getDefault();
    final BlitzMaxConsoleSourceModuleLookup lookup = new BlitzMaxConsoleSourceModuleLookup(
        toolkit);
    return lookup.findSourceModuleByLocalPath(path);
  }

  /**
   * Returns the fully qualified name of the type to open
   * 
   * @return fully qualified type name
   * @exception IllegalArgumentException
   *              if unable to parse the type name
   */
  static String extractFileName(String linkText)
      throws IllegalArgumentException {
    int pos = linkText.lastIndexOf(':');
    if (pos > 0 && pos < linkText.length() - 1) {
      return normalizePath(linkText.substring(0, pos));
    }
    throw new IllegalArgumentException(ERROR_NO_COLON_IN_LINK);
  }

  /**
   * Calls {@link File#getCanonicalPath()} for the specified file name
   * 
   * @param filePath
   * @return
   */
  private static String normalizePath(String filePath) {
    try {
      final File file = new File(filePath);
      return file.getCanonicalPath();
    } catch (IOException e) {
      return filePath;
    }
  }

  /**
   * Returns the line number associated with the stack trace or throws
   * {@link IllegalArgumentException}.
   * 
   * @exception IllegalArgumentException
   *              if unable to parse the number
   */
  static int extractLineNumber(String linkText) throws IllegalArgumentException {
    int pos = linkText.lastIndexOf(':');
    if (pos > 0 && pos < linkText.length() - 1) {
      return Integer.parseInt(linkText.substring(pos + 1));
    }
    throw new IllegalArgumentException(ERROR_NO_COLON_IN_LINK);
  }

  /**
   * Returns this link's text
   * 
   * @exception IllegalArgumentException
   *              if unable to retrieve the text
   */
  protected String getLinkText() throws IllegalArgumentException {
    IRegion region = fConsole.getRegion(this);
    if (region == null) {
      throw new IllegalArgumentException(ERROR_UNKNOWN_HYPERLINK);
    }
    return getText(region.getOffset(), region.getLength());
  }

  protected String getText(int offset, int length)
      throws IllegalArgumentException {
    try {
      return fConsole.getDocument().get(offset, length);
    } catch (BadLocationException e) {
      throw new IllegalArgumentException(e.getMessage());
    }
  }

}
