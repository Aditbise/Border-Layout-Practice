import java.util.*;
class kk
{
    public static void main(String args[])
    {
        int i,a=0,b=1;
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[5];
        int arr[]=new int[5];
        System.out.println("enter 5 elements");
        for(i=0;i<5;i++)
        {
            ar[i]=sc.nextInt();
        }
        a=ar.length/2;
        System.out.println(a);
        int k=0;
        arr[a]=ar[0];
        for(i=1;i<5;i++)
        {         
         if(i%2==0)
         {
            k++;
            arr[a-b]=ar[i];
            System.out.println("indexes "+(a-b)+" Value of b "+b);
         }
         else 
        {
             k++;
            arr[a+b]=ar[i];
            System.out.println("indexes "+(a+b)+" Value of b "+b);
          }
         
         if(k==2)
         {
            b+=1;
            k=0; }
        }
        for(i=0;i<5;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();

}
}


