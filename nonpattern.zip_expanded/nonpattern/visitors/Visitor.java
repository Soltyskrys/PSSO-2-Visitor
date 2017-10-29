package visitors;

import nodes.BinaryOperationNode;
import nodes.NumericNode;

public interface Visitor {
	void visitBinaryOperationNode(BinaryOperationNode node);
	void visitNumericNode(NumericNode node);
}
