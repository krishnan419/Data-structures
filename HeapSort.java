import java.util.*;
public class HeapSort {
  public static void Heapify(ArrayList<Integer> num,int n,int i)
  {
    int lar=i;
    int l=2*i;
    int r=2*i+1;
    if(l<n&&num.get(l)>num.get(lar))
    lar=l;
    if(r<n&&num.get(r)>num.get(lar))
    lar=r;
    if(lar!=i)
    {
      Collections.swap(num,i,lar);
      Heapify(num, n, lar);
    }


  }
  public static void buildHeap(ArrayList<Integer> num, int n)
  {
    int last_par= n-1/2;
    for(int i=last_par;i>0;i--)
    {
      Heapify(num,n,i);
    }
  }
  public static void heapSort(ArrayList<Integer> num, int n)
  {
    while(n!=1)
    {
    Collections.swap(num,1,n-1);
    n--;
    int last_par=n-1/2;
    for(int i=1;i<=last_par;i++)
    {
      Heapify(num,n,i);
    }
    }
  }
  public static void main(String args[]) 
  {
    HeapSort arr= new HeapSort();
    ArrayList<Integer> num= new ArrayList<Integer>(20);
    num.add(2);
    num.add(34);
    num.add(5);
    num.add(-1);
    num.add(4);
    num.add(-1);
    num.add(65);
    num.add(33);
    num.add(52);
    num.add(-1);
    num.add(-1);
    num.add(7);
    num.add(97);
    num.add(8);
    num.add(37);
    num.add(-1);
    num.add(54);
    num.add(66);
    num.add(19);
    num.add(-1);
    num.add(28);
    num.add(-1);
    num.add(86);
    num.add(46);
    num.add(-1);
    num.add(75);
    num.add(62);
    num.add(81);
    num.add(-1);
    Iterator<Integer> itr= num.iterator();
    while(itr.hasNext())
    {
      Integer number=itr.next();
      if(number==-1)
      {
        itr.remove();
      }
    }
      num.add(0,num.size());
      int n= num.size();
      /*The element in first index of all the arrays represent the array size*/
      /*The elements with null values have been removed for converting the array into a heap*/
      System.out.println("Initial Array:" + num);
      arr.buildHeap(num,n);
      System.out.println("Array after it is changed into heap:" + num);
      arr.heapSort(num, n);
      System.out.println("Array after Heap sort:" + num);
    }
 }