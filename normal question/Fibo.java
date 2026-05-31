import java.util.*;
class Fibo
{
    int start;
    int end;
    int n=0;
        
    Fibo()
    {
        start=0;
        end=0;
    }
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the ending number");
        end=sc.nextInt();
        System.out.println("Enter the Nth tterm to be find");
        n=sc.nextInt();
        sc.close();
        fibo(n);
    }
    int a=0,b=1,c=0;
    void fibo(int n)
    {
        if(n>0)
        {
            c=a+b;
            a=b;
            b=c;
            fibo(n-1);
        }
        else
            System.out.println(c);
    }
    void display()
    {
        System.out.println("Nth term is :");
        fibo(n);
    }
    public static void main(String args[])
    {
        Fibo so=new Fibo();
        so.read();
        so.display();
        
    }
}
