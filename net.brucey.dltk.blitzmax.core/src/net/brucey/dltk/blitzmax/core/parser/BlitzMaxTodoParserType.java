package net.brucey.dltk.blitzmax.core.parser;

import net.brucey.dltk.blitzmax.BlitzMaxCorePlugin;

import org.eclipse.dltk.compiler.task.ITodoTaskPreferences;
import org.eclipse.dltk.compiler.task.TodoTaskPreferencesOnPreferenceLookupDelegate;
import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.dltk.core.builder.AbstractTodoTaskBuildParticipantType;
import org.eclipse.dltk.core.builder.IBuildParticipant;

public class BlitzMaxTodoParserType extends
    AbstractTodoTaskBuildParticipantType {

  protected ITodoTaskPreferences getPreferences(IScriptProject project) {
    return new TodoTaskPreferencesOnPreferenceLookupDelegate(
        BlitzMaxCorePlugin.PLUGIN_ID, project);
  }

  private static class BlitzMaxTodoTaskParser extends TodoTaskBuildParticipant {

    public BlitzMaxTodoTaskParser(ITodoTaskPreferences preferences) {
      super(preferences);
    }

    protected void reset() {
      super.reset();
      blockMode = false;
    }

    private boolean blockMode;

    protected int findCommentStart(char[] content, int begin, int end) {
      if (blockMode) {
        if (checkChars(content, begin, end, "endrem") || checkChars(content, begin, end, "end rem")) { //$NON-NLS-1$
          blockMode = false;
          return -1;
        } else {
          for (int i = begin; i < end; ++i) {
            if (Character.isLetterOrDigit(content[i])
                && (!isCheckRanges() || isValid(i))) {
              return i;
            }
          }
          return -1;
        }
      } else {
        if (checkChars(content, begin, end, "rem")) { //$NON-NLS-1$
          blockMode = true;
          return -1;
        } else {
          return super.findCommentStart(content, begin, end);
        }
      }
    }

    /**
     * @param content
     * @param begin
     * @param end
     * @param string
     * @return
     */
    private boolean checkChars(char[] content, int begin, int end,
        String substring) {
      if (begin + substring.length() <= end) {
        for (int i = 0; i < substring.length(); ++i) {
          if (content[begin + i] != substring.charAt(i)) {
            return false;
          }
        }
      }
      return true;
    }

  }

  protected IBuildParticipant getBuildParticipant(
      ITodoTaskPreferences preferences) {
    return new BlitzMaxTodoTaskParser(preferences);
  }

}
