//abstract superclass of tree element types

public abstract class TreeNode  {

  protected TreeNode(String label)  {
    this.label = label;
  }

  public abstract void inFixPrint();
  public abstract void postFixPrint();
  public abstract void preFixPrint();
  public abstract double evaluate();

  protected String label;
}