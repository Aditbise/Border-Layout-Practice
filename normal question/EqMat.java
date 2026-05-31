import java.util.*;
class EqMat
{
    int m;
    int n;
    int a[][];
    
    EqMat(int mm,int nn)
    {
        m=mm;
        n=nn;
        a=new int[m][n];
    }
    void readarray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of array");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        sc.close();
    }
    int check(EqMat P,EqMat Q)
    {
        int x=1;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(P.a[i][j]!=Q.a[i][j])
                {
                  x=0;
                  break;
                }
            }
        }
        return x;
    }
    void print()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of row in matrix 1");
        int r1=sc.nextInt();
        System.out.println("enter the no. of column in matrix 1");
        int c1=sc.nextInt();
        System.out.println("enter the no. of row in matrix 2");
        int r2=sc.nextInt();
        System.out.println("enter the no. of column in matrix 2");
        int c2=sc.nextInt();
        EqMat e1=new EqMat(r1,c1);
        EqMat e2=new EqMat(r2,c2);
         
        e1.readarray();
        e2.readarray();
        
        int e3=e1.check(e1,e2);
        
        if(e3==1)
            System.out.println("Both are equal ");
        else
            System.out.println("Not Equal");
            
        e1.print();
        sc.close();
    }
}
