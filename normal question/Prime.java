import java.util.*;
class Prime 
{
    int ar[][];
    int m,n;
    Prime(int m,int n)
    {
        ar=new int[m][n];
    }
    int isprime(int p)
    {
                int a=0;
                System.out.println(p);
                for(int i=1;i<=p;i++)
                {
                  if(p%i==0)
                  a++;
                }
                if(a==2)
                return 1;
                else 
                return 0;
    }
        
    void fill()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of "+(m*n)+"element ");
        int x=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(isprime(x)==1)
                    ar[i][j]=x++;
            }
        }
        sc.close();
    }
    void display()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
             System.out.print(ar[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of rows and no. of column respectively");
        int x=sc.nextInt();
        int y= sc.nextInt();
        Prime so=new Prime(x,y);
        so.fill();
        so.display();
        sc.close();
    }
}


