package net.brucey.dltk.blitzmax.ui.text.folding;

import java.util.List;

import net.brucey.dltk.blitzmax.ui.BlitzMaxPreferenceConstants;

import org.eclipse.dltk.ui.preferences.OverlayPreferenceStore;
import org.eclipse.dltk.ui.text.folding.SourceCodeFoldingPreferenceBlock;
import org.eclipse.dltk.ui.util.PixelConverter;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;

public class BlitzMaxFoldingPreferenceBlock extends
    SourceCodeFoldingPreferenceBlock {

	public BlitzMaxFoldingPreferenceBlock(OverlayPreferenceStore store,
	    PreferencePage page) {
		super(store, page);
	}

	protected void addOverlayKeys(List keys) {
		super.addOverlayKeys(keys);
		keys.add(new OverlayPreferenceStore.OverlayKey(
		    OverlayPreferenceStore.BOOLEAN,
		    BlitzMaxPreferenceConstants.EDITOR_FOLDING_INIT_REQUIRES));
	}

	protected void addInitiallyFoldOptions(Group group) {
		super.addInitiallyFoldOptions(group);
		createCheckBox(group,
		    BlitzMaxFoldingMessages.BlitzMaxFoldingPreferenceBlock_initRequires,
		    BlitzMaxPreferenceConstants.EDITOR_FOLDING_INIT_REQUIRES);
	}

	/*
	 * this class also exists in the tcl implementation, so if a similar
	 * implementation is used here, this should be refactored so both can share
	 */
	private class ListBlock {
		private ListViewer fList;
		String fKey;
		private Button fAddButton;
		private Button fRemoveButton;

		public ListBlock(Composite parent, String key) {
			fKey = key;
			createControl(parent);
		}

		private Control createControl(Composite parent) {
			Font font = parent.getFont();
			Composite comp = new Composite(parent, SWT.NONE);
			GridLayout topLayout = new GridLayout();
			topLayout.numColumns = 2;
			topLayout.marginHeight = 0;
			topLayout.marginWidth = 0;
			comp.setLayout(topLayout);
			GridData gd = new GridData(GridData.FILL_BOTH);
			comp.setLayoutData(gd);
			fList = new ListViewer(comp);
			gd = new GridData(GridData.FILL_BOTH);
			gd.heightHint = 6;
			fList.getControl().setLayoutData(gd);
			Composite pathButtonComp = new Composite(comp, SWT.NONE);
			GridLayout pathButtonLayout = new GridLayout();
			pathButtonLayout.marginHeight = 0;
			pathButtonLayout.marginWidth = 0;
			pathButtonComp.setLayout(pathButtonLayout);
			gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING
			    | GridData.HORIZONTAL_ALIGN_FILL);
			pathButtonComp.setLayoutData(gd);
			pathButtonComp.setFont(font);
			fAddButton = createPushButton(pathButtonComp,
			    BlitzMaxFoldingMessages.BlitzMaxFoldingPreferenceBlock_0);
			fAddButton.addSelectionListener(new SelectionListener() {
				public void widgetDefaultSelected(SelectionEvent e) {
				}

				public void widgetSelected(SelectionEvent e) {
					IInputValidator validator = new IInputValidator() {
						public String isValid(String newText) {
							if (newText.trim().length() > 0 && newText.matches("[_a-zA-Z]*")) //$NON-NLS-1$
								return null;
							return BlitzMaxFoldingMessages.BlitzMaxFoldingPreferenceBlock_1;
						}
					};
					InputDialog dlg = new InputDialog(null,
					    BlitzMaxFoldingMessages.BlitzMaxFoldingPreferenceBlock_2,
					    BlitzMaxFoldingMessages.BlitzMaxFoldingPreferenceBlock_3,
					    "", validator); //$NON-NLS-1$
					if (dlg.open() == InputDialog.OK) {
						fList.add(dlg.getValue());
						save();
					}
				}
			});
			fRemoveButton = createPushButton(pathButtonComp,
			    BlitzMaxFoldingMessages.BlitzMaxFoldingPreferenceBlock_4);
			fRemoveButton.addSelectionListener(new SelectionListener() {
				public void widgetDefaultSelected(SelectionEvent e) {
				}

				public void widgetSelected(SelectionEvent e) {
					ISelection s = fList.getSelection();
					if (s instanceof IStructuredSelection) {
						IStructuredSelection sel = (IStructuredSelection) s;
						fList.remove(sel.toArray());
						save();
					}
				}
			});
			return comp;
		}

		protected Button createPushButton(Composite parent, String label) {
			Button button = new Button(parent, SWT.PUSH);
			button.setFont(parent.getFont());
			if (label != null) {
				button.setText(label);
			}
			GridData gd = new GridData();
			button.setLayoutData(gd);
			gd.widthHint = getButtonWidthHint(button);
			gd.horizontalAlignment = GridData.FILL;
			return button;
		}

		/**
		 * Returns a width hint for a button control.
		 */
		public int getButtonWidthHint(Button button) {
			button.setFont(JFaceResources.getDialogFont());
			PixelConverter converter = new PixelConverter(button);
			int widthHint = converter
			    .convertHorizontalDLUsToPixels(IDialogConstants.BUTTON_WIDTH);
			return Math.max(widthHint, button.computeSize(SWT.DEFAULT, SWT.DEFAULT,
			    true).x);
		}

		private String[] getEntries() {
			return fList.getList().getItems();
		}

		private void setEntries(String items[]) {
			fList.remove(fList.getList().getItems());
			for (int i = 0; i < items.length; i++) {
				if (items[i].trim().length() > 0)
					fList.add(items[i]);
			}
		}

		public void save() {
			String items[] = getEntries();
			StringBuffer buf = new StringBuffer();
			for (int i = 0; i < items.length; i++) {
				buf.append(items[i]);
				if (i != items.length - 1)
					buf.append(","); //$NON-NLS-1$
			}
			getPreferenceStore().setValue(fKey, buf.toString());
		}

		public void initialize() {
			String val = getPreferenceStore().getString(fKey);
			if (val != null) {
				String items[] = val.split(","); //$NON-NLS-1$
				setEntries(items);
			}

		}

		public void performDefault() {
			String val = getPreferenceStore().getDefaultString(fKey);
			if (val != null) {
				String items[] = val.split(","); //$NON-NLS-1$
				setEntries(items);
			}
		}
	}
}
