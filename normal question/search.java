import java.util.*;
class search 
{
    int fun(int ar[])
    {
        int i;
        int n=ar.length;
        int flag=0;
        for(i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==ar[j])
                {
                    flag=1;
                    break;
                }

            }
            if(flag!=1)
            {
                break;
            }
        }  
        return i;  
    }
    public static void main(String args[])
    {
        int ar[]=new int[4];
       System.out.println("Enetr the array :");
       Scanner sc=new Scanner(System.in);
       for(int i=0;i<4;i++)
       {
           ar[i]=sc.nextInt();
       }
       search so=new search();
       so.fun(ar); 
       sc.close();
    }
}

