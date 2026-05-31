import java.util.*;
class Recursion
{
    int a;
    int b;
    int c;
    int limit;
    Recursion()
    {
        a=0;
        b=1;
        c=0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Limit : ");
        limit=sc.nextInt();
        sc.close();
    }
    int fib(int n)
    {
        if(c<n)
        {
            c=a+b;
            System.out.print(c+", ");
            a=b;
            b=c;
            fib(n);
        }
        return(c);
        
    }
    void generate_fibseries()
    {
        System.out.print(a+", "+b+", ");
        System.out.print(fib(limit));
    }
    public static void main(String args[])
    {
        Recursion r=new Recursion();
        r.input();
        r.generate_fibseries();
    }
}


