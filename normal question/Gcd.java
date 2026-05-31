import java.util.*;
class Gcd
{
    int num1;
    int num2;
    int i=1;
    Gcd()
    {
        num1=0;
        num2=0;
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number");
        num1=sc.nextInt();
        System.out.println("Enter the 2nd number");
        num2=sc.nextInt();
        sc.close();
    }
    int gcd(int x,int y)
    {
        int c=0;
        if(i>=x || i>=y)
        {
            if(x%i==0 && y%i==0)
                c=i;
            gcd(x,y);
        }
        return(c);
    }
    void display()
    {
        System.out.println("GCD is :");
        gcd(num1,num2);
    }
    public static void main(String args[])
    {
        Gcd so=new Gcd();
        so.accept();
        so.display();
    }
}
