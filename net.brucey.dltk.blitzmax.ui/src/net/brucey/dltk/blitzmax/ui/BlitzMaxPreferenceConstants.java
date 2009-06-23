package net.brucey.dltk.blitzmax.ui;

import net.brucey.dltk.blitzmax.ui.text.IBlitzMaxColorConstants;

import org.eclipse.dltk.ui.CodeFormatterConstants;
import org.eclipse.dltk.ui.PreferenceConstants;
import org.eclipse.dltk.ui.preferences.NewScriptProjectPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.graphics.RGB;

public class BlitzMaxPreferenceConstants extends PreferenceConstants {

  /*
   * Single line comment
   */
  /**
   * A named preference that holds the color used to render single line
   * comments.
   * <p>
   * Value is of type <code>String</code>. A RGB color value encoded as a string
   * using class <code>PreferenceConverter</code>
   * </p>
   * 
   * @see org.eclipse.jface.resource.StringConverter
   * @see org.eclipse.jface.preference.PreferenceConverter
   */
  public final static String EDITOR_SINGLE_LINE_COMMENT_COLOR = IBlitzMaxColorConstants.BLITZMAX_SINGLE_LINE_COMMENT;

  /**
   * A named preference that controls whether single line comments are rendered
   * in bold.
   * <p>
   * Value is of type <code>Boolean</code>. If <code>true</code> single line
   * comments are rendered in bold. If <code>false</code> the are rendered using
   * no font style attribute.
   * </p>
   */
  public final static String EDITOR_SINGLE_LINE_COMMENT_BOLD = IBlitzMaxColorConstants.BLITZMAX_SINGLE_LINE_COMMENT
      + EDITOR_BOLD_SUFFIX;

  /**
   * A named preference that controls whether single line comments are rendered
   * in italic.
   * <p>
   * Value is of type <code>Boolean</code>. If <code>true</code> single line
   * comments are rendered in italic. If <code>false</code> the are rendered
   * using no italic font style attribute.
   * </p>
   */
  public final static String EDITOR_SINGLE_LINE_COMMENT_ITALIC = IBlitzMaxColorConstants.BLITZMAX_SINGLE_LINE_COMMENT
      + EDITOR_ITALIC_SUFFIX;

  /**
   * A named preference that controls whether single line comments are rendered
   * in strikethrough.
   * <p>
   * Value is of type <code>Boolean</code>. If <code>true</code> single line
   * comments are rendered in strikethrough. If <code>false</code> the are
   * rendered using no italic font style attribute.
   * </p>
   */
  public final static String EDITOR_SINGLE_LINE_COMMENT_STRIKETHROUGH = IBlitzMaxColorConstants.BLITZMAX_SINGLE_LINE_COMMENT
      + EDITOR_STRIKETHROUGH_SUFFIX;

  /**
   * A named preference that controls whether single line comments are rendered
   * in underline.
   * <p>
   * Value is of type <code>Boolean</code>. If <code>true</code> single line
   * comments are rendered in underline. If <code>false</code> the are rendered
   * using no italic font style attribute.
   * </p>
   * 
   * 
   */
  public final static String EDITOR_SINGLE_LINE_COMMENT_UNDERLINE = IBlitzMaxColorConstants.BLITZMAX_SINGLE_LINE_COMMENT
      + EDITOR_UNDERLINE_SUFFIX;

  
  public final static String EDITOR_REM_COMMENT_COLOR = IBlitzMaxColorConstants.BLITZMAX_MULTILINE_COMMENT;

  public final static String EDITOR_REM_COMMENT_BOLD = IBlitzMaxColorConstants.BLITZMAX_MULTILINE_COMMENT
      + EDITOR_BOLD_SUFFIX;

  public final static String EDITOR_REM_COMMENT_ITALIC = IBlitzMaxColorConstants.BLITZMAX_MULTILINE_COMMENT
      + EDITOR_ITALIC_SUFFIX;

  public final static String EDITOR_REM_COMMENT_STRIKETHROUGH = IBlitzMaxColorConstants.BLITZMAX_MULTILINE_COMMENT
      + EDITOR_STRIKETHROUGH_SUFFIX;

  public final static String EDITOR_REM_COMMENT_UNDERLINE = IBlitzMaxColorConstants.BLITZMAX_MULTILINE_COMMENT
      + EDITOR_UNDERLINE_SUFFIX;

  /*
   * Key worlds
   */
  /**
   * A named preference that holds the color used to render keyword.
   * <p>
   * Value is of type <code>String</code>. A RGB color value encoded as a string
   * using class <code>PreferenceConverter</code>
   * </p>
   * 
   * @see org.eclipse.jface.resource.StringConverter
   * @see org.eclipse.jface.preference.PreferenceConverter
   */
  public final static String EDITOR_KEYWORD_COLOR = IBlitzMaxColorConstants.BLITZMAX_KEYWORD;

  /**
   * A named preference that controls whether kwyword are rendered in bold.
   * <p>
   * Value is of type <code>Boolean</code>. If <code>true</code> single line
   * comments are rendered in bold. If <code>false</code> the are rendered using
   * no font style attribute.
   * </p>
   */
  public final static String EDITOR_KEYWORD_BOLD = IBlitzMaxColorConstants.BLITZMAX_KEYWORD
      + EDITOR_BOLD_SUFFIX;

  /**
   * A named preference that controls whether keyword are rendered in italic.
   * <p>
   * Value is of type <code>Boolean</code>. If <code>true</code> single line
   * comments are rendered in italic. If <code>false</code> the are rendered
   * using no italic font style attribute.
   * </p>
   */
  public final static String EDITOR_KEYWORD_ITALIC = IBlitzMaxColorConstants.BLITZMAX_KEYWORD
      + EDITOR_ITALIC_SUFFIX;

  /**
   * A named preference that controls whether single line comments are rendered
   * in strikethrough.
   * <p>
   * Value is of type <code>Boolean</code>. If <code>true</code> single line
   * comments are rendered in strikethrough. If <code>false</code> the are
   * rendered using no italic font style attribute.
   * </p>
   */
  public final static String EDITOR_KEYWORD_STRIKETHROUGH = IBlitzMaxColorConstants.BLITZMAX_KEYWORD
      + EDITOR_STRIKETHROUGH_SUFFIX;

  /**
   * A named preference that controls whether keyword are rendered in underline.
   * <p>
   * Value is of type <code>Boolean</code>. If <code>true</code> single line
   * comments are rendered in underline. If <code>false</code> the are rendered
   * using no italic font style attribute.
   * </p>
   * 
   * 
   */
  public final static String EDITOR_KEYWORD_UNDERLINE = IBlitzMaxColorConstants.BLITZMAX_KEYWORD
      + EDITOR_UNDERLINE_SUFFIX;

  public final static String EDITOR_VARIABLE_COLOR = IBlitzMaxColorConstants.BLITZMAX_VARIABLE;
  public final static String EDITOR_VARIABLE_BOLD = IBlitzMaxColorConstants.BLITZMAX_VARIABLE
      + EDITOR_BOLD_SUFFIX;
  public final static String EDITOR_VARIABLE_ITALIC = IBlitzMaxColorConstants.BLITZMAX_VARIABLE
      + EDITOR_ITALIC_SUFFIX;
  public final static String EDITOR_VARIABLE_STRIKETHROUGH = IBlitzMaxColorConstants.BLITZMAX_VARIABLE
      + EDITOR_STRIKETHROUGH_SUFFIX;
  public final static String EDITOR_VARIABLE_UNDERLINE = IBlitzMaxColorConstants.BLITZMAX_VARIABLE
      + EDITOR_UNDERLINE_SUFFIX;

  public final static String EDITOR_CLASS_VARIABLE_COLOR = IBlitzMaxColorConstants.BLITZMAX_TYPE_VARIABLE;
  public final static String EDITOR_CLASS_VARIABLE_BOLD = IBlitzMaxColorConstants.BLITZMAX_TYPE_VARIABLE
      + EDITOR_BOLD_SUFFIX;
  public final static String EDITOR_CLASS_VARIABLE_ITALIC = IBlitzMaxColorConstants.BLITZMAX_TYPE_VARIABLE
      + EDITOR_ITALIC_SUFFIX;
  public final static String EDITOR_CLASS_VARIABLE_STRIKETHROUGH = IBlitzMaxColorConstants.BLITZMAX_TYPE_VARIABLE
      + EDITOR_STRIKETHROUGH_SUFFIX;
  public final static String EDITOR_CLASS_VARIABLE_UNDERLINE = IBlitzMaxColorConstants.BLITZMAX_TYPE_VARIABLE
      + EDITOR_UNDERLINE_SUFFIX;

  public final static String EDITOR_GLOBAL_VARIABLE_COLOR = IBlitzMaxColorConstants.BLITZMAX_GLOBAL_VARIABLE;
  public final static String EDITOR_GLOBAL_VARIABLE_BOLD = IBlitzMaxColorConstants.BLITZMAX_GLOBAL_VARIABLE
      + EDITOR_BOLD_SUFFIX;
  public final static String EDITOR_GLOBAL_VARIABLE_ITALIC = IBlitzMaxColorConstants.BLITZMAX_GLOBAL_VARIABLE
      + EDITOR_ITALIC_SUFFIX;
  public final static String EDITOR_GLOBAL_VARIABLE_STRIKETHROUGH = IBlitzMaxColorConstants.BLITZMAX_GLOBAL_VARIABLE
      + EDITOR_STRIKETHROUGH_SUFFIX;
  public final static String EDITOR_GLOBAL_VARIABLE_UNDERLINE = IBlitzMaxColorConstants.BLITZMAX_GLOBAL_VARIABLE
      + EDITOR_UNDERLINE_SUFFIX;

  public final static String EDITOR_CONSTANT_VARIABLE_COLOR = IBlitzMaxColorConstants.BLITZMAX_CONSTANT_VARIABLE;
  public final static String EDITOR_CONSTANT_VARIABLE_BOLD = IBlitzMaxColorConstants.BLITZMAX_CONSTANT_VARIABLE
      + EDITOR_BOLD_SUFFIX;
  public final static String EDITOR_CONSTANT_VARIABLE_ITALIC = IBlitzMaxColorConstants.BLITZMAX_CONSTANT_VARIABLE
      + EDITOR_ITALIC_SUFFIX;
  public final static String EDITOR_CONSTANT_VARIABLE_STRIKETHROUGH = IBlitzMaxColorConstants.BLITZMAX_CONSTANT_VARIABLE
      + EDITOR_STRIKETHROUGH_SUFFIX;
  public final static String EDITOR_CONSTANT_VARIABLE_UNDERLINE = IBlitzMaxColorConstants.BLITZMAX_CONSTANT_VARIABLE
      + EDITOR_UNDERLINE_SUFFIX;

  public final static String EDITOR_INSTANCE_VARIABLE_COLOR = IBlitzMaxColorConstants.BLITZMAX_FIELD_VARIABLE;
  public final static String EDITOR_INSTANCE_VARIABLE_BOLD = IBlitzMaxColorConstants.BLITZMAX_FIELD_VARIABLE
      + EDITOR_BOLD_SUFFIX;
  public final static String EDITOR_INSTANCE_VARIABLE_ITALIC = IBlitzMaxColorConstants.BLITZMAX_FIELD_VARIABLE
      + EDITOR_ITALIC_SUFFIX;
  public final static String EDITOR_INSTANCE_VARIABLE_STRIKETHROUGH = IBlitzMaxColorConstants.BLITZMAX_FIELD_VARIABLE
      + EDITOR_STRIKETHROUGH_SUFFIX;
  public final static String EDITOR_INSTANCE_VARIABLE_UNDERLINE = IBlitzMaxColorConstants.BLITZMAX_FIELD_VARIABLE
      + EDITOR_UNDERLINE_SUFFIX;

  /*
   * Numbers
   */
  /**
   * A named preference that holds the color used to render NUMBER.
   * <p>
   * Value is of type <code>String</code>. A RGB color value encoded as a string
   * using class <code>PreferenceConverter</code>
   * </p>
   * 
   * @see org.eclipse.jface.resource.StringConverter
   * @see org.eclipse.jface.preference.PreferenceConverter
   */
  public final static String EDITOR_NUMBER_COLOR = IBlitzMaxColorConstants.BLITZMAX_NUMBER;

  /**
   * A named preference that controls whether number are rendered in bold.
   * <p>
   * Value is of type <code>Boolean</code>. If <code>true</code> single line
   * comments are rendered in bold. If <code>false</code> the are rendered using
   * no font style attribute.
   * </p>
   */
  public final static String EDITOR_NUMBER_BOLD = IBlitzMaxColorConstants.BLITZMAX_NUMBER
      + EDITOR_BOLD_SUFFIX;

  /**
   * A named preference that controls whether NUMBER are rendered in italic.
   * <p>
   * Value is of type <code>Boolean</code>. If <code>true</code> single line
   * comments are rendered in italic. If <code>false</code> the are rendered
   * using no italic font style attribute.
   * </p>
   */
  public final static String EDITOR_NUMBER_ITALIC = IBlitzMaxColorConstants.BLITZMAX_NUMBER
      + EDITOR_ITALIC_SUFFIX;

  /**
   * A named preference that controls whether single line comments are rendered
   * in strikethrough.
   * <p>
   * Value is of type <code>Boolean</code>. If <code>true</code> single line
   * comments are rendered in strikethrough. If <code>false</code> the are
   * rendered using no italic font style attribute.
   * </p>
   */
  public final static String EDITOR_NUMBER_STRIKETHROUGH = IBlitzMaxColorConstants.BLITZMAX_NUMBER
      + EDITOR_STRIKETHROUGH_SUFFIX;

  /**
   * A named preference that controls whether NUMBER are rendered in underline.
   * <p>
   * Value is of type <code>Boolean</code>. If <code>true</code> single line
   * comments are rendered in underline. If <code>false</code> the are rendered
   * using no italic font style attribute.
   * </p>
   */
  public final static String EDITOR_NUMBER_UNDERLINE = IBlitzMaxColorConstants.BLITZMAX_NUMBER
      + EDITOR_UNDERLINE_SUFFIX;

  /*
   * Strings
   */
  /**
   * A named preference that holds the color used to render STRING.
   * <p>
   * Value is of type <code>String</code>. A RGB color value encoded as a string
   * using class <code>PreferenceConverter</code>
   * </p>
   * 
   * @see org.eclipse.jface.resource.StringConverter
   * @see org.eclipse.jface.preference.PreferenceConverter
   */
  public final static String EDITOR_STRING_COLOR = IBlitzMaxColorConstants.BLITZMAX_STRING;

  /**
   * A named preference that controls whether STRING are rendered in bold.
   * <p>
   * Value is of type <code>Boolean</code>. If <code>true</code> single line
   * comments are rendered in bold. If <code>false</code> the are rendered using
   * no font style attribute.
   * </p>
   */
  public final static String EDITOR_STRING_BOLD = IBlitzMaxColorConstants.BLITZMAX_STRING
      + EDITOR_BOLD_SUFFIX;

  /**
   * A named preference that controls whether STRING are rendered in italic.
   * <p>
   * Value is of type <code>Boolean</code>. If <code>true</code> single line
   * comments are rendered in italic. If <code>false</code> the are rendered
   * using no italic font style attribute.
   * </p>
   */
  public final static String EDITOR_STRING_ITALIC = IBlitzMaxColorConstants.BLITZMAX_STRING
      + EDITOR_ITALIC_SUFFIX;

  /**
   * A named preference that controls whether single line comments are rendered
   * in strikethrough.
   * <p>
   * Value is of type <code>Boolean</code>. If <code>true</code> single line
   * comments are rendered in strikethrough. If <code>false</code> the are
   * rendered using no italic font style attribute.
   * </p>
   */
  public final static String EDITOR_STRING_STRIKETHROUGH = IBlitzMaxColorConstants.BLITZMAX_STRING
      + EDITOR_STRIKETHROUGH_SUFFIX;

  /**
   * A named preference that controls whether STRING are rendered in underline.
   * <p>
   * Value is of type <code>Boolean</code>. If <code>true</code> single line
   * comments are rendered in underline. If <code>false</code> the are rendered
   * using no italic font style attribute.
   * </p>
   */
  public final static String EDITOR_STRING_UNDERLINE = IBlitzMaxColorConstants.BLITZMAX_STRING
      + EDITOR_UNDERLINE_SUFFIX;

  /**
   * A named preference that controls whether comments are initially folded.
   */
  public static final String EDITOR_FOLDING_INIT_COMMENTS = "editor_folding_init_comments"; //$NON-NLS-1$

  /**
   * A named preference that controls whether header comments are initially
   * folded.
   */
  public static final String EDITOR_FOLDING_INIT_HEADER_COMMENTS = "editor_folding_init_header_comments"; //$NON-NLS-1$

  /**
   * A named preference that controls whether methods are initially folded.
   */
  public static final String EDITOR_FOLDING_INIT_METHODS = "editor_folding_init_methods"; //$NON-NLS-1$

  /**
   * A named preference that controls whether require statements are initially
   * folded.
   */
  public static final String EDITOR_FOLDING_INIT_REQUIRES = "editor_folding_init_requires"; //$NON-NLS-1$

  /**
   * A preference that controls the color of TO-DO tasks in comments
   */
  public static final String COMMENT_TASK_TAGS_COLOR = IBlitzMaxColorConstants.BLITZMAX_TODO_COMMENT;

  /**
   * A preference that controls the boldness of TO-DO tasks in comments
   */
  public static final String COMMENT_TASK_TAGS_BOLD = COMMENT_TASK_TAGS_COLOR
      + EDITOR_BOLD_SUFFIX;

  /**
   * A preference that controls the selected formatter.
   */
  public static final String FORMATTER_ID = "formatterId"; //$NON-NLS-1$

  public static void initializeDefaultValues(IPreferenceStore store) {
    PreferenceConstants.initializeDefaultValues(store);

    PreferenceConverter.setDefault(store,
        IBlitzMaxColorConstants.BLITZMAX_DEFAULT, new RGB(0, 0, 0));

    PreferenceConverter.setDefault(store, COMMENT_TASK_TAGS_COLOR, new RGB(127,
        159, 191));
    PreferenceConverter.setDefault(store, EDITOR_SINGLE_LINE_COMMENT_COLOR,
        new RGB(63, 127, 95));
    
    PreferenceConverter.setDefault(store, EDITOR_REM_COMMENT_COLOR,
        new RGB(63, 127, 95));
   
    PreferenceConverter.setDefault(store, EDITOR_KEYWORD_COLOR, new RGB(127, 0,
        85));
    PreferenceConverter.setDefault(store, EDITOR_STRING_COLOR, new RGB(42, 0,
        255));
    PreferenceConverter
        .setDefault(store, EDITOR_NUMBER_COLOR, new RGB(0, 0, 0));

    PreferenceConverter.setDefault(store, EDITOR_VARIABLE_COLOR, new RGB(0, 0,
        0));
    PreferenceConverter.setDefault(store, EDITOR_CLASS_VARIABLE_COLOR, new RGB(
        200, 0, 0));
    PreferenceConverter.setDefault(store, EDITOR_INSTANCE_VARIABLE_COLOR,
        new RGB(200, 0, 0));
    PreferenceConverter.setDefault(store, EDITOR_GLOBAL_VARIABLE_COLOR,
        new RGB(200, 0, 0));

    store.setDefault(EDITOR_SINGLE_LINE_COMMENT_BOLD, false);
    store.setDefault(COMMENT_TASK_TAGS_BOLD, true);
    store.setDefault(EDITOR_SINGLE_LINE_COMMENT_ITALIC, true);

    store.setDefault(EDITOR_REM_COMMENT_ITALIC, true);

    store.setDefault(EDITOR_KEYWORD_BOLD, true);
    store.setDefault(EDITOR_KEYWORD_ITALIC, false);

    store.setDefault(EDITOR_SMART_INDENT, true);
    store.setDefault(EDITOR_TAB_ALWAYS_INDENT, false);
    store.setDefault(EDITOR_CLOSE_STRINGS, true);
    store.setDefault(EDITOR_CLOSE_BRACKETS, true);
    store.setDefault(EDITOR_CLOSE_BRACES, true);
    store.setDefault(EDITOR_SMART_TAB, true);
    store.setDefault(EDITOR_SMART_PASTE, true);
    store.setDefault(EDITOR_SMART_HOME_END, true);
    store.setDefault(EDITOR_SUB_WORD_NAVIGATION, true);
    store.setDefault(EDITOR_TAB_WIDTH, 2);
    store.setDefault(EDITOR_SYNC_OUTLINE_ON_CURSOR_MOVE, true);

    // folding
    initializeFoldingDefaults(store);

    store.setDefault(CodeFormatterConstants.FORMATTER_TAB_CHAR,
        CodeFormatterConstants.SPACE);
    store.setDefault(CodeFormatterConstants.FORMATTER_TAB_SIZE, "4"); //$NON-NLS-1$
    store.setDefault(CodeFormatterConstants.FORMATTER_INDENTATION_SIZE, "4"); //$NON-NLS-1$

    NewScriptProjectPreferencePage.initDefaults(store);

    store.setDefault(APPEARANCE_COMPRESS_PACKAGE_NAMES, false);
    store.setDefault(APPEARANCE_METHOD_RETURNTYPE, false);
    store.setDefault(APPEARANCE_METHOD_TYPEPARAMETERS, true);
    store.setDefault(APPEARANCE_PKG_NAME_PATTERN_FOR_PKG_VIEW, ""); //$NON-NLS-1$

    store.setDefault(SHOW_SOURCE_MODULE_CHILDREN, true);

    store.setDefault(CODEASSIST_AUTOACTIVATION_TRIGGERS, ".:"); //$NON-NLS-1$
  }

  protected static void initializeFoldingDefaults(IPreferenceStore store) {
    store.setDefault(PreferenceConstants.EDITOR_FOLDING_ENABLED, true);
    store.setDefault(PreferenceConstants.EDITOR_FOLDING_LINES_LIMIT, 2);
    store.setDefault(PreferenceConstants.EDITOR_DOCS_FOLDING_ENABLED, true);
    store.setDefault(PreferenceConstants.EDITOR_COMMENTS_FOLDING_ENABLED, true);
    store.setDefault(PreferenceConstants.EDITOR_FOLDING_INIT_HEADER_COMMENTS,
        true);
    store.setDefault(EDITOR_FOLDING_INIT_REQUIRES, true);
  }
}
