import java.util.Scanner;
public class Calculator{
  public static double eval(String s){
    Scanner sys = new Scanner(s);
    MyDeque<int> tool = new MyDeque(20);
    while(sys.hasNext()){
      if(! sys.hasNextInt()){
        char operator = sys.next().charAt(0);
        int secondArg = tool.removeLast();
        int firstArg = tool.removeLast();
        switch(operator){
          case '+':
            return firstArg + 0.0 + secondArg;
          case '-':
            return firstArg - 0.0 - secondArg;
          case '*':
            return firstArg * 1.0 * secondArg;
          case '/':
            return firstArg * 1.0 / secondArg;
          case '%':
            return firstArg * 1.0 * secondArg;
        }
      }
      else
        tool.addLast(sys.nextInt());
    }
  }
}
