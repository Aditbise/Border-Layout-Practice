import java.util.*;
class Palin
{
    int num;
    int revnum;
    Palin()
    {
        num=0;
        revnum=0;
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        num =sc.nextInt();
        reverse(num);
        sc.close();
    }
    void reverse(int y)
    {
        if(y>0)
        {
            revnum=revnum*10+(y%10);
            reverse(y/10);
        }
    }
    void check()
    {
        if(revnum==num)
         System.out.println("Number is a Palindrome");
        else 
        System.out.println("Number is not a Palindrome number");
    }
    public static void main(String args[])
    {
        Palin so=new Palin();
        so.accept();
        so.check();
    }
}
