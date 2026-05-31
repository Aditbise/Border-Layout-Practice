import java.util.*;
class Transarray
{
 int arr[][];
 int m;
 int n;
 
 Transarray()
 {
     m=0;
     n=0;
 }
 Transarray(int mm,int nn)
 {
     m=mm;
     n=nn;
     arr=new int[m][n];
 }
 void fillarray()
 {
     Scanner sc=new Scanner(System.in);
     for(int i=0;i<m;i++)
     {
         for(int j=0;j<n;j++)
         {
                 arr[i][j]=sc.nextInt();
         }
     }
     sc.close();
     
 }
 void transpose(Transarray ob)
 {
     for(int i=0;i<n;i++)
     {
         for(int j=0;j<m;j++)
         {
             ob.arr[i][j]=arr[j][i];
         }
     }
        
 }
 void disparray()
 {
     for(int i=0;i<m;i++)
     {
         for(int j=0;j<n;j++)
         {
                 System.out.print(arr[i][j]+" ");                
         }
         System.out.println();
     }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
          Transarray so=new Transarray();
          
      System.out.println("enter the number of rows ");
      int a=sc.nextInt();
      int b=sc.nextInt();
      
      so=new Transarray(a,b);
      so.fillarray();
      so.transpose(so);
      so.disparray();
      sc.close();
    }
}


