package visitors;

import nodes.BinaryOperationNode;
import nodes.NumericNode;

public class PreFixPrintVisitor implements Visitor {

	@Override
	public void visitBinaryOperationNode(BinaryOperationNode node) {
		  System.out.print(node.getLabel());
		  System.out.print(" ");
		  node.getLeft().accept(this);
		  System.out.print(" ");
		  node.getRight().accept(this);
	}

	@Override
	public void visitNumericNode(NumericNode node) {
		System.out.print(node.getLabel());	
	}
}
