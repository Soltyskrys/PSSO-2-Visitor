package visitors;

import java.util.Stack;

import nodes.BinaryOperationNode;
import nodes.NumericNode;

public class EvaluateVisitor implements Visitor {
	
	private Stack<Integer> numbers = new Stack<Integer>();

	@Override
	public void visitBinaryOperationNode(BinaryOperationNode node) {
		node.getLeft().accept(this);
		node.getRight().accept(this);
		
		int right = numbers.pop();
		int left = numbers.pop();

		numbers.push(node.compute(left,right));
	}

	@Override
	public void visitNumericNode(NumericNode node) {
		numbers.push(node.getValue());
	}
	
	public int getValue() {
		return numbers.peek();
	}

}
