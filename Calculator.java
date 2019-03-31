import java.util.Scanner;
import java.io.*;


public class Calculator{
  public static double eval(String s){
    Scanner sys = new Scanner(s);
    MyDeque<Double> tool = new MyDeque<Double>(10);
    while(sys.hasNext()){
      if(! sys.hasNextDouble()){
        char operator = sys.next().charAt(0);
        System.out.println("Operator: "+ operator);
        double secondArg = tool.removeLast();
        double firstArg = tool.removeLast();
        System.out.println(tool);
        switch(operator){
          case '+':
            tool.addLast(firstArg  + secondArg);
            break;
          case '-':
            tool.addLast(firstArg - secondArg);
            break;
          case '*':
            tool.addLast(firstArg * secondArg);
            break;
          case '/':
            tool.addLast(firstArg / secondArg);
            break;
          case '%':
            tool.addLast(firstArg % secondArg);
            break;
          default:
            throw new RuntimeException();
        }
      }
      else{
        double num = sys.nextDouble();
        tool.addLast(num);
        System.out.println("Double: "+num);
      }
    }
    //System.out.println(tool);
    return tool.getFirst();
  }
}
