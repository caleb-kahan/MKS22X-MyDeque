import java.util.Scanner;
import java.io.*;


public class Calculator{
  public static double eval(String s){
    Scanner sys = new Scanner(s);
    MyDeque<Double> tool = new MyDeque<Double>(30);
    while(sys.hasNext()){
      if(! sys.hasNextDouble()){
        char operator = sys.next().charAt(0);
        double secondArg = tool.removeLast();
        double firstArg = tool.removeLast();
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
        tool.addLast(sys.nextDouble());
     }
    }

    return tool.getLast();
  }
}
