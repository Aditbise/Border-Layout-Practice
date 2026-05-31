import java.util.*;
class Series
{
    int x,n,f,p;
    double sum;
    Series()
    {
        x=0;
        n=0;
        f=0;
        p=0;
        sum=0.0d;
    }
    Series(int nx,int nn)
    {
        x=nx;
        n=nn;
    }
    int Fact(int d)
    {
        if(d>0)
         return d*Fact(d-1);
        else 
         return 1;
    }
    int power(int a,int b)
    {
        if(b>0)
         return a*power(a,b-1);
        else 
         return 1;
    }
    void sumseries()
    {
        sum++;
        for(int p=2;p<n;p++)
        {
            if(p%2==0)
            sum=sum+(power(x,p)/Fact(p+1));
            else
            sum=sum-(power(x,p)/Fact(p+1));
            
            System.out.println(power(x,p)+" / "+Fact(p+1));
        }
        System.out.println("Sum:"+sum);
    }
    public static void main(String args[])
    {
        Series s=new Series();
        System.out.println("enter the number and its limit");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        s=new Series(x,n);
        s.sumseries();
        sc.close();
    }
}


