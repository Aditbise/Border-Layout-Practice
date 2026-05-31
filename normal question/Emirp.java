import java.util.*;
class Emirp
{
    int n,rev,f;
    int b=1,a=2,r=0;
    Emirp(int nn)
    {
        n=nn;
        rev=0;
        f=2;
    }
    int isprime(int x)
    {
        if(a<x)
        {
            if(x%a==0)
                b=0;
            a++;
            isprime(x);
        }
        return b;
    }
    void isEmirp()
    {
        int c=n;
        while(c>0)
        {
            r=c%10;
            rev=(rev*10)+r;
            c=c/10;
        }
        if(isprime(rev)==1 && isprime(n)==1 )
         System.out.println("reversed number "+rev+" and original number "+n+"is prime");
        else
         System.out.println("reversed number "+rev+" and original number "+n+"is not prime");
        }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        Emirp E=new Emirp(n);
        E.isEmirp();
        sc.close();
    }
}


