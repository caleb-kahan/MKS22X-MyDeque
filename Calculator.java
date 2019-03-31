import java.util.Scanner;
public class Calculator{
  public static double eval(String s){
    Scanner sys = new Scanner(s);
    MyDeque<Double> tool = new MyDeque<Double>(50);
    while(sys.hasNext()){
      if(! sys.hasNextDouble()){
        char operator = sys.next().charAt(0);
        double secondArg = tool.removeLast();
        double firstArg = tool.removeLast();
        //ystem.out.println("run");
        switch(operator){
          case '+':
            tool.addLast(firstArg  + secondArg);
          case '-':
            tool.addLast(firstArg - secondArg);
          case '*':
            tool.addLast(firstArg * secondArg);
          case '/':
            tool.addLast(firstArg / secondArg);
          case '%':
            tool.addLast(firstArg % secondArg);
        }
      }
      else
        tool.addLast(sys.nextDouble());
    }
    System.out.println(tool);
    return tool.getFirst();
  }
}
