package nodes;

public class SubtractionNode extends BinaryOperationNode {

	public SubtractionNode(TreeNode left, TreeNode right) {
		super(left, right);
	}

	@Override
	public int compute(int left, int right) {

		return left-right;
	}
	
	@Override
	public String getLabel() {
		return "-";
	}

}
