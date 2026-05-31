import java.util.*;
class Special
{
    int n;
    Special()
    {
        n=0;
    }
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        System.out.println("Factorial of "+n+" is "+factorial(n));
        sc.close();
    }
    int factorial(int x)
    {
        if(x>0)
            return x*factorial(x-1);
        else 
            return 1;
    }
    boolean isSpecial()
    {
        int n1=n,n2=0,r;
        boolean b=false;
        while(n1>0)
        {
            r=n%10;
            n2=n2+factorial(r);
            n1=n1/10;
        }
        if(n2==n) 
         b=true;
        return b;
    }
    void display()
    {
        if(isSpecial())    
            System.out.println("No is Special Number ");
        else 
            System.out.println("No is Not Special Number ");
    }
    public static void main(String [] ar)
    {
        Special sp = new Special();
        sp.read();
        sp.display();
    }
}
