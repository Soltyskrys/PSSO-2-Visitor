package nodes;

import visitors.Visitor;

public class NumericNode implements TreeNode{
	private int value;

	
	public NumericNode(int value) {
		this.value = value;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitNumericNode(this);
	}

	@Override
	public String getLabel() {
		return Integer.toString(value);
	}

	public int getValue() {
		return value;
	}
}
