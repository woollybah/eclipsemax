package net.brucey.dltk.blitzmax.ui.documentation;

import java.io.Reader;
import java.io.StringReader;

import org.eclipse.dltk.core.IBuffer;
import org.eclipse.dltk.core.IMember;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ISourceRange;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.ui.documentation.IScriptDocumentationProvider;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;

public class BlitzMaxCommentDocumentationProvider implements
    IScriptDocumentationProvider {

	protected String getLine(Document d, int line) throws BadLocationException {
		return d.get(d.getLineOffset(line), d.getLineLength(line));
	}

	protected String getHeaderComment(IMember member) {
		try {
			ISourceRange range = member.getSourceRange();
			if (range == null)
				return null;

			IBuffer buf = null;

			ISourceModule compilationUnit = member.getSourceModule();
			if (!compilationUnit.isConsistent()) {
				return null;
			}

			buf = compilationUnit.getBuffer();

			final int start = range.getOffset();

			String contents = buf.getContents();

			String result = "";

			Document doc = new Document(contents);
			try {
				int line = doc.getLineOfOffset(start);
				line--;
				if (line < 0)
					return null;
				boolean findEndRem = true;
				while (line >= 0) {
					String curLine = getLine(doc, line);
					String curLineTrimmed = curLine.trim().toLowerCase();

					// looking for the end of the rem block?
					if (findEndRem) {
						if (curLineTrimmed.length() != 0
						    && (curLineTrimmed.startsWith("endrem") || curLineTrimmed
						        .startsWith("end rem"))) {
							findEndRem = false;
						} else {
							break;
						}
					} else {
						// looking for the start of the rem block
						if (curLineTrimmed.equals("rem")) {
							break;
						}

						result = curLine + result;
					}

					line--;
				}
			} catch (BadLocationException e) {
				return null;
			}

			return result;

		} catch (ModelException e) {
		}
		return null;
	}

	public Reader getInfo(IMember member, boolean lookIntoParents,
	    boolean lookIntoExternal) {
		String header = getHeaderComment(member);
		return new StringReader(convertToHTML(header));
	}

	protected String convertToHTML(String header) {
		StringBuffer result = new StringBuffer();
		// result.append("<p>\n");
		Document d = new Document(header);
		boolean inPara = false;
		for (int line = 0;; line++) {
			try {
				String str = getLine(d, line).trim();
				// if (str == null)
				// break;
				if (str.startsWith("bbdoc:")) {
					result.append(str.substring(6));
					continue;
				}
				if (str.startsWith("about:")) {
					result.append("<p>").append(str.substring(6));
					inPara = true;
					continue;
				}
				if (str.startsWith("returns:")) {
					if (inPara) {
						result.append("</p>");
					}
					result.append("<p>").append(str.substring(8)).append("</p>");
					inPara = false;
					continue;
				}

				if (str.length() == 0) {
					if (inPara) {
						result.append("</p>");
					}
					result.append("<p>");
				} else {
					// if (str.trim().matches("\\w*:")) {
					// result.append("<h4>");
					// result.append(str);
					// result.append("</h4>");
					// } else
					result.append(str);
				}
			} catch (BadLocationException e) {
				break;
			}
			if (inPara) {
				result.append("</p>");
			}

		}
		return result.toString();
	}

	public Reader getInfo(String content) {
		return null;
	}

}
