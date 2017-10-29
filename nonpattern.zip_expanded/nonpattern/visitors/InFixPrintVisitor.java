package visitors;

import nodes.BinaryOperationNode;
import nodes.NumericNode;

public class InFixPrintVisitor implements Visitor {

	@Override
	public void visitBinaryOperationNode(BinaryOperationNode node) {
		  System.out.print("(");
		  System.out.print(" ");
		  node.getLeft().accept(this);
		  System.out.print(" ");
		  System.out.print(node.getLabel());
		  System.out.print(" ");
		  node.getRight().accept(this);
		  System.out.print(" ");
		  System.out.print(")");
		  System.out.print(" ");
		
	}

	@Override
	public void visitNumericNode(NumericNode node) {
		System.out.print(node.getLabel());
	}
}
