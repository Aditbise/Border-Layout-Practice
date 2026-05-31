import java.util.*;
class hh
{
    public static void main(String args[])
    {
        int i,n,j,a=0;
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[4];
        System.out.println("enter the 4 number's and must not be 0 ");
        for(i=0;i<4;i++)
        {
            ar[i]=sc.nextInt();
        }
        for(i=0;i<4;i++)
        {
             n=ar[i];
             for(j=i;j<4;j++)
             {   
                if(ar[j]>0 && ar[j]==n)
                { 
                     a++;
                     ar[j]=0;
                }
            }
             System.out.println(n+" :"+a);
             a=0;
                
        }
        sc.close();
    }
}


