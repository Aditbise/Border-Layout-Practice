import java.util.*;
class Matrix1
{
    Scanner sc=new Scanner(System.in);
    double a[][];
    double b[][];
    int m,n,r,c;
    Matrix1()
    {
        m=0;
        n=0;
        r=0;
        c=0;
        a=new double[0][0];
        b=new double[0][0];
    }
    void readLimit()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of row and column of first array");
        m=sc.nextInt();
        n=sc.nextInt();
        System.out.println("enter the value of row and column of first array");
        r=sc.nextInt();
        c=sc.nextInt();
        a=new double[m][n];
        b=new double[r][c];
        sc.close();
    }
    void input_a()
    {
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
             a[i][j]=sc.nextInt();
            }
        }
    }
    void input_b()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
             b[i][j]=sc.nextInt();
            }
        }
    }
    void showmats()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
             System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
             System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
class Matrix2 extends Matrix1
{
    double c[][]=new double[10][10];
    Matrix2()
    {
        super();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
             c[i][j]=sc.nextDouble();
            }
        }
    }
    void find_product()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
             c[i][j]=(a[i][j]*b[i][j]);
            }
        }
    }
    void showmatrix()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
             System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String argsfgahbsgdbbk[])
    {
        Matrix2 m2=new Matrix2();
        m2.readLimit();
        m2.input_a();
        m2.input_b();
        m2.showmats();
        m2.find_product();
        m2.showmatrix();
    }
}


