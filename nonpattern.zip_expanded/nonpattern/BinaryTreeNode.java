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
	  left.inFixPrint();
	  System.out.print(label);
	  right.inFixPrint();
	  System.out.print(")");
  }

  private TreeNode left, right;

}