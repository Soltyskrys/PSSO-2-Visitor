package nodes;

import visitors.Visitor;

public interface TreeNode {
	void accept(Visitor visitor);
	String getLabel();
}
