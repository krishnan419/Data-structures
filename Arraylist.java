import java.util.*;
public class Main {
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
    for(int i=last_par;i>=0;i--)
    {
      Heapify(num,n,i);
    }
  }
  
  public static void main(String args[]) {
   Main arr= new Main();
   ArrayList<Integer> num= new ArrayList<Integer>(20);
   num.add(2);
   num.add(34);
   num.add(5);
   num.add(-1);
   num.add(4);
   num.add(-1);
   num.add(65);
   Iterator<Integer> itr= num.iterator();
   while(itr.hasNext()){
     Integer number=itr.next();
     if(number==-1){
       itr.remove();
     }
   }
   num.add(0,num.size());
   int n= num.size();
   System.out.println("Array:" + num);
   arr.buildHeap(num,n);
   System.out.println("Array:" + num);
  }
 }