import java.util.Scanner;
public class Calculator{
  public static double eval(String s){
    Scanner sys = new Scanner(s);
    MyDeque<Integer> tool = new MyDeque<Integer>(20);
    while(sys.hasNext()){
      if(! sys.hasNextInt()){
        char operator = sys.next().charAt(0);
        double secondArg = tool.removeLast();
        double firstArg = tool.removeLast();
        switch(operator){
          case '+':
            return firstArg  + secondArg;
          case '-':
            return firstArg - secondArg;
          case '*':
            return firstArg * secondArg;
          case '/':
            return firstArg / secondArg;
          case '%':
            return firstArg % secondArg;
        }
      }
      else
        tool.addLast(sys.nextInt());
    }
    return -1;
  }
}
