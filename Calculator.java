import java.util.Scanner;
public class Calculator{
  public static double eval(String s){
    Scanner sys = new Scanner(s);
    MyDeque tool = new MyDeque(20);
    while(sys.hasNext()){
      if(! sys.hasNextInt()){
        String operator = sys.next();
        int secondArg = Integer.parseInt(tool.removeLast());
        int firstArg = Integer.parseInt(tool.removeLast());
      }
      else
        tool.add(sys);
    }
  }
}
