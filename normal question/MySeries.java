import java.util.*;
class MySeries 
{
    int x,n,p,fac;
    MySeries()
    {
        x=0;
        n=0;
        p=0;
        fac=0;
    }
    void getnum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        n=sc.nextInt();
        System.out.println("enter the number");
        x=sc.nextInt();
        sc.close();
    }
    int getpower(int g,int h)
    {
        if(h>0)
         return g*getpower(g,h-1);
        else 
         return 1;
    }
    int findFact(int y)
    {
        if(y>0)
         return y*findFact(y-1);
        else
         return 1;
    }
    long findsum()
    {
        Long S=0l;
        int c=0;
        for(int p=0;p<=n;p+=2)
        {
            S=S+(p*(getpower(x,p)/findFact(c++)));
        }
        return S;
    }
    public static void main(String args[])
    {
        MySeries M=new MySeries();
        M.getnum();
        long ans= M.findsum();
        System.out.println("Solution "+ans);
    }
}


