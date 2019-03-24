public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  public MyDeque(){
    this(10);
  }
  @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity){
    size= 0;
    start =  -1;
    end   =  -1;
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
  private void resize(){
    E[] copy = data;
    data = new E [data.length+1000];
    int i = start, j = 0;
    if(end>=start){
      while(i<=end){
        data[j]=copy[i];
        i++;
        j++;
      }
    }
    else{
      while(end>=i){
        data[j]=copy[i];
        i++;
        j++;
        if(i==data.length) i = 0;
      }
    }
  }
  public void addFirst(E element){
    if(data.length == size) resize();
    if(start > 0 && start<=end){}
      data[--start]=element;
  }
  public void addLast(E element){
    size++;
    if(data.length == size) resize();
    if(start==end) start++;
    if (end==data.length-1)
      data[end=0]=element;
    else data[++end]=element;
    }
  public E removeFirst(){
    size--;
    if(start==end) end++;
    if(start==size-1){
      start=0;
      return data[size-1];
    }
    return data[start++];
  }
  public E removeLast(){
    size--;
    if(start==end) start--;
    if(end==0){
      end = size-1;
      return data[0];
    }
    return data[end--];
  }
  public E getFirst(){
    return data[start];
  }
  public E getLast(){
    return data[end];
  }
}
