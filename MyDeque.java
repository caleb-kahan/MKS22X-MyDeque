public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  public MyDeque(){
    this(10);
  }
  @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity){
    size= initialCapacity;
    start =  0;
    end   =  0;
    data = (E[])new Object[size];
  }
  public int size(){
    return size;
  }
  public String toString(){
    String returner = "";
    for(E gener: data){
      returner += gener + " ";
    }
    return returner;
  }
  public void addFirst(E element){ }
  public void addLast(E element){ }
  public E removeFirst(){ }
  public E removeLast(){ }
  public E getFirst(){
    return data[start];
  }
  public E getLast(){
    return data[end];
  }
}
