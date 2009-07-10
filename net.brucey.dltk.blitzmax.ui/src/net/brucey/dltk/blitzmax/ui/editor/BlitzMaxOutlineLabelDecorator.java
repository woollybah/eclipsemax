package net.brucey.dltk.blitzmax.ui.editor;

import org.eclipse.dltk.core.IMember;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.ui.viewsupport.ImageImageDescriptor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;

public class BlitzMaxOutlineLabelDecorator extends LabelProvider implements
    ILabelDecorator {

  public String decorateText(String text, Object element) {
    //		if (element instanceof IMethod) {
    //			IMethod method = (IMethod) element;
    //			return method.getElementName();
    //		}
    return text;
  }

  public Image decorateImage(Image image, Object obj) {

    try {
      if (obj instanceof IMember) {
        IMember member = (IMember) obj;
        if (member.exists()) {
          int flags = member.getFlags();

          ImageDescriptor baseImage = new ImageImageDescriptor(image);
          Rectangle bounds = image.getBounds();

          ImageDescriptor dsc = new BlitzMaxAnnotatedImageDescriptor(baseImage,
              new Point(bounds.width, bounds.height), flags);

          return dsc.createImage();
        }
      }

    } catch (ModelException e) {
      e.printStackTrace();
    }

    return image;
  }
}
