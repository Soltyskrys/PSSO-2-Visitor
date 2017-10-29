package nodes;

public class DivisionNode extends BinaryOperationNode {

	public DivisionNode(TreeNode left, TreeNode right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compute(int left, int right) {
		return left/right;
	}
	
	@Override
	public String getLabel() {
		return "/";
	}
}
