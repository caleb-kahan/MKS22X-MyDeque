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
    String returner = "{";
    for(E gener: data){
      returner += gener + " ";
    }
    return returner+ "}";
  }
  @SuppressWarnings("unchecked")
  private void resize(){
    E[] copy = data;
    data = (E[])new Object[data.length+1000];
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
    size++;
    if(start==-1){
      start=0;
      end=0;
      data[0]=element;
    }
    else if(start==0){
      data[start=data.length-1] = element;
    }
    else
      data[--start]=element;
  }
  public void addLast(E element){
    if(data.length == size) resize();
    size++;
    if(start==-1){
      start=0;
      end=0;
      data[0]=element;
    }
    else if(end==data.length-1)
      data[end=0]=element;
    else
      data[++end]=element;
  }
  public E removeFirst(){
    size--;
    if(start==end){
      start=-1;
      end=-1;
    }
    else if(start==data.length-1){
      start=0;
      return data[data.length-1];
    }
    return data[start++];
  }
  public E removeLast(){
    size--;
    if(start==end){
      start=-1;
      end=-1;
    }
    else if(end==0){
      end = data.length-1;
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
