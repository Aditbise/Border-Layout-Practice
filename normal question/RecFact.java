import java.util.*;
class RecFact
{
    int n,r;
    RecFact()
    {
        n=0;
        r=0;
    }
    void readnum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of 2 no...");
        n=sc.nextInt();
        r=sc.nextInt();
        sc.close();
    }
    int factorial(int f)
    {
        if(f==0)
            return 1;
        else 
            return f*factorial(f-1);    
    }   
    void factseries()
    {
        
        int S=(factorial(n))/(factorial(r)*factorial(n-r));
        System.out.println(S);
    }
    public static void main(String args[])
    {
        RecFact rf=new RecFact();
        rf.readnum();
        rf.factseries();
    }
}


