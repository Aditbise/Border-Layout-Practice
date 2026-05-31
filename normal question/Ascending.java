import java.util.*;
class Ascending
{
 int ar[];
 int n;
 Ascending(int n)
 {
      this.n=n;
      ar=new int[n*2];
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value of arrays");
      for(int i=0;i<n;i++)
      {
          ar[i]=sc.nextInt();
      }
      sc.close();
 }
 void displayList()
 {
  for(int i=0;i<ar.length;i++)
  {
      System.out.println(ar[i]);
  }
 }
 Ascending merge(Ascending a1)
 {
  Ascending a2=a1;
  int k=n;
  for(int i=0;i<n;i++)
    {
        a2.ar[k++]=ar[i];
    }
  return a2;
 }
 public static void main(String args [])
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the size of array");
     int n=sc.nextInt();
     
     Ascending a1=new Ascending(n);
     Ascending a2=new Ascending(n);
     
     Ascending a3=a1.merge(a2);
     
     a3.displayList();
     sc.close();
     }
}


