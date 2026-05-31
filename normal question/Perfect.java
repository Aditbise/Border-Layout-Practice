import java.util.*;
class Perfect
{
    int num;
    int a=1,sum=0;
    Perfect(int nn)
    {
        num=nn;
    }
    int sum_of_factors(int i)
    {
        if(a<num && num%a==0)
        {
            sum=sum+a;
            a++;
            return sum_of_factors(i);
        }
        else 
        return sum;
    }
    void check()
    {
        if(sum_of_factors(num)==num)
         System.out.println("number is Perfect");
        else
         System.out.println("number is not Perfect");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        Perfect P=new Perfect(n);
        P.check();
        sc.close();
    }
}


