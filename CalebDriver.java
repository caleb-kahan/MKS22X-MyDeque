public class CalebDriver{
  public static void main(String [] args){
    MyDeque a = new MyDeque();
    a.addFirst(3);
    a.addFirst(2);
    a.addFirst(1);
    a.addFirst(0);
    System.out.println(a);
    a.resize();
    System.out.println(a);
  }
}
