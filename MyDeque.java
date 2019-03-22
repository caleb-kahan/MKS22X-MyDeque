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
  public void addFirst(E element){
    if(start > 0 && start<=end){}
      data[--start]=element;
  }
  public void addLast(E element){
    if(end>=start && end <= data.length-2)
      data[++end]=element;
  }
  public E removeFirst(){
    if(end>=start){
      return data[start++];
  }
  public E removeLast(){
    if(end>=start)
      return data[end--];
  }
  public E getFirst(){
    return data[start];
  }
  public E getLast(){
    return data[end];
  }
}
