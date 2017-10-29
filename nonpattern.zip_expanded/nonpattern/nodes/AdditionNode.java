package nodes;

public class AdditionNode extends BinaryOperationNode {

	public AdditionNode(TreeNode left, TreeNode right) {
		super(left, right);
	}

	@Override
	public int compute(int left, int right) {
		return left+right;
	}
	
	@Override
	public String getLabel() {
		return "+";
	}

}
