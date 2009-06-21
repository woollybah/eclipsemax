/**
 * 
 */
package net.brucey.dltk.blitzmax.ui.editor;

import org.eclipse.dltk.ast.Modifiers;
import org.eclipse.dltk.internal.ui.editor.AnnotatedImageDescriptor;
import org.eclipse.dltk.ui.DLTKPluginImages;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.Point;

public class BlitzMaxAnnotatedImageDescriptor extends
    AnnotatedImageDescriptor {

	private int flags;

	public BlitzMaxAnnotatedImageDescriptor(
	    ImageDescriptor baseImageDescriptor, Point size, int flags) {
		super(baseImageDescriptor, size);

		this.flags = flags;
	}

	@Override
	protected void drawAnnotations() {
		ImageData data = null;

		// TODO : lots more flags to implement - abstract, "static", final, local, global, etc
		
		if ((flags & Modifiers.AccStatic) != 0) {
			data = getImageData(DLTKPluginImages.DESC_OVR_STATIC); // we really want a "G" icon for globals
		} else if ((flags & Modifiers.AccConstant) != 0) {
			// FIXME : need our own constant image (maybe)
			data = getImageData(DLTKPluginImages.DESC_OVR_CONSTRUCTOR);
		}

		if (data != null) {
			drawImageTopRight(data);
		}
	}
}