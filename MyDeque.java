import java.util.*;
import java.io.*;

public class MyDeque<E>{
  public E[] data;
  private int size, start, end;

  public MyDeque(){
    this(10);
  }
  @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity){
    size= 0;
    start =  -1;
    end   =  -1;
    data = (E[])new Object[initialCapacity];
  }
  public int size(){
    return size;
  }
  public String toString(){
    String returner = "{";
    if(size !=0){
      for(int i = 0;i<data.length;i++){
        returner+=data[i] + " ";
      }
    }
    return returner+ "}";
  }
  @SuppressWarnings("unchecked")
  public void resize(){
    E[] copy = data;
    data = (E[])new Object[data.length+1000];
    int i = start, j = 0;
    if(size !=0){
      if(end>=start){
        while(i<=end){
          data[j]=copy[i];
          i++;
          j++;
        }
      }
      else{
      	while(i<copy.length){
      		data[j]=copy[i];
        	i++;
          j++;
        }
	      i=0;
        while(i<=end){
          data[j]=copy[i];
          i++;
          j++;
        }
     }
    }
    start =0;
    end = j-1;
  }
  public void addFirst(E element){
    if(element == null) throw new NullPointerException("Specified element is null");
    if(data.length == size ){
      resize();
    }
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
    if(element == null) throw new NullPointerException("Specified element is null");
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
    if(size ==0) throw new NoSuchElementException ("Deque is Empty");
    size--;
    if(start==end){
      int temp = start;
      start=-1;
      end=-1;
      return data[temp];
    }
    else if(start==data.length-1){
      start=0;
      return data[data.length-1];
    }
    return data[start++];
  }
  public E removeLast(){
    if(size ==0) throw new NoSuchElementException ("Deque is Empty");
    size--;
    if(start==end){
      int temp = start;
      start=-1;
      end=-1;
      return data[temp];
    }
    else if(end==0){
      end = data.length-1;
      return data[0];
    }
    return data[end--];
  }
  public E getFirst(){
    if(size ==0) throw new NoSuchElementException ("Deque is Empty");
    return data[start];
  }
  public E getLast(){
    if(size ==0) throw new NoSuchElementException ("Deque is Empty");
    return data[end];
  }
}
