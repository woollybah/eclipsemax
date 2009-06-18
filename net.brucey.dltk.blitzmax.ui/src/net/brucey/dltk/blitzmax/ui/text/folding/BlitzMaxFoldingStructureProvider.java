package net.brucey.dltk.blitzmax.ui.text.folding;

import net.brucey.dltk.blitzmax.ui.BlitzMaxUIPlugin;
import net.brucey.dltk.blitzmax.core.BlitzMaxNature;
import net.brucey.dltk.blitzmax.ui.BlitzMaxPreferenceConstants;
import net.brucey.dltk.blitzmax.ui.editor.BlitzMaxPartitionScanner;
import net.brucey.dltk.blitzmax.ui.editor.IBlitzMaxPartitions;

import org.eclipse.core.runtime.ILog;
import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.expressions.CallExpression;
import org.eclipse.dltk.ui.text.folding.AbstractASTFoldingStructureProvider;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;

public class BlitzMaxFoldingStructureProvider extends
    AbstractASTFoldingStructureProvider {

	@Override
	protected String getCommentPartition() {
		return IBlitzMaxPartitions.BLITZMAX_MULTILINE_COMMENT;
	}

	@Override
	protected ILog getLog() {
		return BlitzMaxUIPlugin.getDefault().getLog();
	}

	@Override
	protected String getNatureId() {
		return BlitzMaxNature.BLITZMAX_NATURE;
	}

	@Override
	protected String getPartition() {
		return IBlitzMaxPartitions.BLITZMAX_PARTITIONING;
	}

	@Override
	protected IPartitionTokenScanner getPartitionScanner() {
		return new BlitzMaxPartitionScanner();
	}

	@Override
	protected String[] getPartitionTypes() {
		return IBlitzMaxPartitions.BLITZMAX_PARITION_TYPES;
	}

	protected boolean mayCollapse(ASTNode s,
	    FoldingStructureComputationContext ctx) {
		return super.mayCollapse(s, ctx) || s instanceof CallExpression;
	}

	protected boolean initiallyCollapse(ASTNode s) {
		return super.initiallyCollapse(s)
		    || (s instanceof CallExpression && initCollapseRequires);
	}

	private boolean initCollapseRequires;

	protected void initializePreferences(IPreferenceStore store) {
		super.initializePreferences(store);
		initCollapseRequires = store
		    .getBoolean(BlitzMaxPreferenceConstants.EDITOR_FOLDING_INIT_REQUIRES);
	}

}
