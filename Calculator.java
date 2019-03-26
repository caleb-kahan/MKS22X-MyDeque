import java.util.Scanner;
public class Calculator{
  public static double eval(String s){
    Scanner sys = new Scanner(s);
    MyDeque tool = new MyDeque(20);
    while(sys.hasNext()){
      if(! sys.hasNextInt()){
        int secondArg = Integer.parseInt(tool.removeLast());
      }
      else
        tool.add(sys);
    }
  }
}
