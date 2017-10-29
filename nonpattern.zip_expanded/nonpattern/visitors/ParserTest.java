package visitors;

import nodes.Parser;
import nodes.TreeNode;

public class ParserTest{
  public static void main(String[] args)  {
    Parser parser = new Parser();
    TreeNode rootNode = parser.parse("1 + ( 2 - 27 % 15 ) / 5");// spaces are vital!!;
    
    rootNode.accept(new InFixPrintVisitor());
    System.out.println();
    rootNode.accept(new PreFixPrintVisitor());
    System.out.println();
    rootNode.accept(new PostFixPrintVisitor());
    System.out.println();
    
    EvaluateVisitor evaluate = new EvaluateVisitor();
    rootNode.accept(evaluate);
    System.out.println("result: " + evaluate.getValue());
  }
}