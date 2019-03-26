import java.util.Scanner;
public class Calculator{
  public static double eval(String s){
    Scanner sys = new Scanner(s);
    MyDeque<Double> tool = new MyDeque<Double>(20);
    double result=0;
    while(sys.hasNext()){
      if(! sys.hasNextDouble()){
        char operator = sys.next().charAt(0);
        double secondArg = tool.removeLast();
        double firstArg = tool.removeLast();
        switch(operator){
          case '+':
            tool.addLast(firstArg  + secondArg);
          case '-':
            tool.addLast(result+= firstArg - secondArg);
          case '*':
            tool.addLast(result+= firstArg * secondArg);
          case '/':
            tool.addLast(result+= firstArg / secondArg);
          case '%':
            tool.addLast(result+= firstArg % secondArg);
        }
      }
      else
        tool.addLast(sys.nextDouble());
    }
    return result;
  }
}
