import java.util.Stack;
import java.util.StringTokenizer;

/**
 *
 * @author adam
 */
public class Parser {

  public TreeNode parse(String inFixExpression) {
    treeStack = new Stack<TreeNode>();
    operatorStack = new Stack<String>();      
    lexAnalyser = new StringTokenizer(inFixExpression);
    while(lexAnalyser.hasMoreTokens()) {
        String token = lexAnalyser.nextToken();
        if (token.equals("(")) {    
            //BinaryTreeNode tree = new BinaryTreeNode(token);
            operatorStack.push(token);
        } else if ( isInteger(token) ) {
            SimpleTreeNode tree = new SimpleTreeNode(token);
            treeStack.push(tree);
        } else if ( isOperator(token) ) {
            //BinaryTreeNode tree = new BinaryTreeNode(token);
            if (operatorStack.empty() || operatorStack.peek().equals("(") || priority(operatorStack.peek())<priority(token)) {
                operatorStack.push(token);                
            } else { // clear operator stack and push new one onto it 
                do { 
                    PopConnectPush(); 
                } while ( !operatorStack.empty() && !operatorStack.peek().equals("(") && priority(token)<priority(operatorStack.peek()) );
                operatorStack.push(token);
            }
        } else if (token.equals(")")) { 
            while ( !operatorStack.peek().equals("(") ) PopConnectPush(); 
            operatorStack.pop(); //Pop the opening bracket off the stack.
        } else {
            System.out.println("Error in expression");
        }
    }
    // no more tokens left in expression 
    while (!operatorStack.empty()) {
       PopConnectPush();    
    }
    // pointer to root of final tree is on top of the tree stack
    return treeStack.pop();
  }

  private void PopConnectPush() {
     TreeNode right = treeStack.pop();
     TreeNode left = treeStack.pop();
     BinaryTreeNode tree = new BinaryTreeNode(operatorStack.pop(), left, right);
     treeStack.push(tree);
  }
      
  private int priority(String op) {
    if (op.equals("*"))
      return 2;
    else if (op.equals("/"))
      return 2;
    else if (op.equals("+"))
      return 1;
    else if (op.equals("-"))
      return 1;
    else
      return - 1;
  }
  
  private boolean isInteger(String integer) {
    try {
      Integer.parseInt(integer);
      return true;
    }
    catch (NumberFormatException nfe) {
      return false;
    }
  }

  private boolean isOperator(String op) {
    boolean isOp = false;
    for (int i = 0; i < operators.length; i++)
      if (operators[i].equals(op)) isOp = true;
    return isOp;
  }

  private StringTokenizer lexAnalyser;
  private String[] operators = new String[]{"+", "-", "*", "/"};
  private Stack<TreeNode> treeStack;
  private Stack<String> operatorStack;    
}
