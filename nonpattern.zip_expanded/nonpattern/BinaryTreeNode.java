//Tree node that contains two children

public class BinaryTreeNode extends TreeNode  {

  public BinaryTreeNode(String label) {
    super(label);
    left = right = null;
  }

  public BinaryTreeNode(String label, TreeNode left, TreeNode right) {
    super(label);
    this.left = left;
    this.right = right;
  }


  public void inFixPrint()  {
	  System.out.print("(");
	  System.out.print(" ");
	  left.inFixPrint();
	  System.out.print(" ");
	  System.out.print(label);
	  System.out.print(" ");
	  right.inFixPrint();
	  System.out.print(" ");
	  System.out.print(")");
	  System.out.print(" ");
  }

  private TreeNode left, right;

@Override
public void postFixPrint() {
	  left.postFixPrint();
	  System.out.print(" ");
	  right.postFixPrint();
	  System.out.print(" ");
	  System.out.print(label);
}



@Override
public void preFixPrint() {
	  System.out.print(label);
	  System.out.print(" ");
	  left.preFixPrint();
	  System.out.print(" ");
	  right.preFixPrint();
	  

}

@Override
public double evaluate() {
	double leftVal = left.evaluate();
	double rightVal = right.evaluate();
	
	switch(label) {
		case("+"):
			return leftVal+rightVal;
		case("-"):
			return leftVal-rightVal;
		case("*"):
			return leftVal*rightVal;
		case("/"):
			return leftVal/rightVal;
		case("%"):
			return leftVal%rightVal;
	}
	
	throw new UnsupportedOperationException(label);
}

}