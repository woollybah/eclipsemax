package net.brucey.dltk.blitzmax.selection;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.brucey.dltk.blitzmax.BlitzMaxCorePlugin;
import net.brucey.dltk.blitzmax.core.parsers.ASTUtils;
import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxBaseVariableDeclaration;
import net.brucey.dltk.blitzmax.parser.ast.BlitzMaxTypeReference;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.declarations.MethodDeclaration;
import org.eclipse.dltk.ast.declarations.ModuleDeclaration;
import org.eclipse.dltk.ast.declarations.TypeDeclaration;
import org.eclipse.dltk.ast.references.TypeReference;
import org.eclipse.dltk.codeassist.ISelectionEngine;
import org.eclipse.dltk.compiler.env.ISourceModule;
import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.IModelElementVisitor;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.core.SourceParserUtil;

public class BlitzMaxSelectionEngine implements ISelectionEngine {

  private org.eclipse.dltk.core.ISourceModule sourceModule;
  private Set selectionElements = new HashSet();

  public IModelElement[] select(ISourceModule module,
      final int selectionSourceStart, int selectionSourceEnd) {

    sourceModule = (org.eclipse.dltk.core.ISourceModule) module
        .getModelElement();

    ModuleDeclaration moduleDeclaration = SourceParserUtil
        .getModuleDeclaration(sourceModule, null);

    // final List results = new ArrayList();

    ASTNode node = ASTUtils.findMinimalNode(moduleDeclaration,
        selectionSourceStart, selectionSourceEnd);

    if (node == null) {
      return new IModelElement[0];
    }

    if (node instanceof TypeDeclaration) {
      selectionOnTypeDeclaration(moduleDeclaration, (TypeDeclaration) node);
    } else if (node instanceof MethodDeclaration) {
      selectionOnMethodDeclaration(moduleDeclaration, (MethodDeclaration) node);
    } else if (node instanceof BlitzMaxBaseVariableDeclaration) {
      selectionOnVariableDeclaration(moduleDeclaration,
          (BlitzMaxBaseVariableDeclaration) node);
    } else if (node instanceof TypeReference) {
      findDeclaration(((TypeReference) node).getName());
    }

    // try {
    // moduleDeclaration.traverse(new ASTVisitor() {
    // public boolean visit(Expression s) throws Exception {
    // if (s.sourceStart() <= selectionSourceStart
    // && selectionSourceStart <= s.sourceEnd()) {
    // if (s instanceof ExtendedVariableReference) {
    // ExtendedVariableReference ref = (ExtendedVariableReference) s;
    // int count = ref.getExpressionCount();
    // for (int j = 0; j < count; j++) {
    // Expression e = ref.getExpression(j);
    // if (e.sourceStart() <= selectionSourceStart
    // && selectionSourceStart <= e.sourceEnd()) {
    // if (e instanceof VariableReference) {
    // findDeclaration(((VariableReference) e).getName(), results);
    // }
    // }
    // }
    // } else if (s instanceof VariableReference) {
    // findDeclaration(((VariableReference) s).getName(), results);
    // } else if (s instanceof BlitzMaxTypeReference) { // Find
    // // declarations of
    // // BlitzMax
    // // variables
    // // (types, methods,
    // // vars, etc)
    // findDeclaration(((BlitzMaxTypeReference) s).getName(), results);
    // }
    // }
    // return super.visit(s);
    // }
    //
    // public boolean visit(MethodDeclaration s) throws Exception {
    // if (s.getNameStart() <= selectionSourceStart
    // && selectionSourceStart <= s.getNameEnd()) {
    // findDeclaration(s.getName(), results);
    // }
    // return super.visit(s);
    // }
    //
    // public boolean visit(TypeDeclaration s) throws Exception {
    // if (s.getNameStart() <= selectionSourceStart
    // && selectionSourceStart <= s.getNameEnd()) {
    // findDeclaration(s.getName(), results);
    // }
    // return super.visit(s);
    // }
    //
    // });
    // } catch (Exception e) {
    // if (DLTKCore.DEBUG) {
    // e.printStackTrace();
    // }
    // }
    // return (IModelElement[]) results.toArray(new
    // IModelElement[results.size()]);
    return (IModelElement[]) selectionElements
        .toArray(new IModelElement[selectionElements.size()]);
  }

  private void selectionOnTypeReference(ModuleDeclaration moduleDeclaration,
      TypeReference var) {
    IModelElement elementAt = null;
    try {
      elementAt = sourceModule.getElementAt(var.sourceStart() + 1);
    } catch (ModelException e) {
      BlitzMaxCorePlugin.log(e);
    }
    if (elementAt != null) {
      selectionElements.add(elementAt);
    }

  }

  private void selectionOnVariableDeclaration(
      ModuleDeclaration moduleDeclaration, BlitzMaxBaseVariableDeclaration var) {

    IModelElement elementAt = null;
    try {
      elementAt = sourceModule.getElementAt(var.sourceStart() + 1);
    } catch (ModelException e) {
      BlitzMaxCorePlugin.log(e);
    }
    if (elementAt != null) {
      selectionElements.add(elementAt);
    }

  }

  private void findDeclaration(final String name) {
    try {
      this.sourceModule.accept(new IModelElementVisitor() {
        public boolean visit(IModelElement element) {
          if (element.getElementName().equals(name)) {
            selectionElements.add(element);
          }
          return true;
        }
      });
    } catch (ModelException e) {
      if (DLTKCore.DEBUG) {
        e.printStackTrace();
      }
    }
  }

  public void setOptions(Map options) {
  }

  private void selectionOnTypeDeclaration(ModuleDeclaration parsedUnit,
      TypeDeclaration typeDeclaration) {

    IModelElement elementAt = null;
    try {
      elementAt = sourceModule.getElementAt(typeDeclaration.sourceStart() + 1);
    } catch (ModelException e) {
      BlitzMaxCorePlugin.log(e);
    }
    if (elementAt != null) {
      selectionElements.add(elementAt);
    }
  }

  private void selectionOnMethodDeclaration(ModuleDeclaration parsedUnit,
      MethodDeclaration methodDeclaration) {
    IModelElement elementAt = null;
    try {
      elementAt = sourceModule
          .getElementAt(methodDeclaration.sourceStart() + 1);
    } catch (ModelException e) {
      BlitzMaxCorePlugin.log(e);
    }
    if (elementAt != null)
      selectionElements.add(elementAt);
  }
}
