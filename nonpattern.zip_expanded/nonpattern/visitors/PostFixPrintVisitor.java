package visitors;

import nodes.BinaryOperationNode;
import nodes.NumericNode;

public class PostFixPrintVisitor implements Visitor {

	@Override
	public void visitBinaryOperationNode(BinaryOperationNode node) {
		  node.getLeft().accept(this);
		  System.out.print(" ");
		  node.getRight().accept(this);
		  System.out.print(" ");
		  System.out.print(node.getLabel());
	}

	@Override
	public void visitNumericNode(NumericNode node) {
		System.out.print(node.getLabel());
	}

}
