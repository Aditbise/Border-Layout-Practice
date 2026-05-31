import java.util.*;
class Happy
{
    int n;
    int sum=0;
    int r=0;
    Happy()
    {
        n=0;
    }
    void getnum(int nn)
    {
        n=nn;
    }
    int sum_sq_digits(int n)
    {
        while(n>0)
        {
             r=n%10;
             sum=sum+(r*r);
             n=n/10;
                      
             if(n==0)
             {
                 System.out.println(sum);
                 if(sum<10)
                     break;
                 else
                 {
                     n=sum;   
                     sum=0;
                 }
             }
        }
        return sum;
    }
    void ishappy()
    {
        System.out.println(sum_sq_digits(n));
        
        if(sum_sq_digits(n)==1)
        System.out.println("number is a happy number ");
        else 
        System.out.println("number is not happy number ");
    }
    public static void main(String args[])
    {
        Happy h=new Happy();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of number ");
        int n=sc.nextInt();
        h.getnum(n);
        h.ishappy();
        sc.close();
    }
}


