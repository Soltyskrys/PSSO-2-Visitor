package nodes;

import visitors.Visitor;

public abstract class BinaryOperationNode implements TreeNode{
	
	private TreeNode left;
	private TreeNode right;

	
	public BinaryOperationNode() {
	}

	public BinaryOperationNode(TreeNode left, TreeNode right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitBinaryOperationNode(this);
	}
	
	public abstract int compute(int left,int right);
	
	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}
	
	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

}
