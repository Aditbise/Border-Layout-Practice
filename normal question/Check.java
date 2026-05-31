import java.util.*;
class Check
{
    String wrd;
    int len;
    Check()
    {
        wrd="";
        len =0;
    }
    void acceptword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        wrd=sc.nextLine();
        wrd=wrd.trim();
        wrd=wrd.toUpperCase();
        sc.close();
    }
    boolean palindrome()
    {
        boolean c=false;
        String b="";
        len=wrd.length();
        for(int i=0;i<len;i++)
        {
            b=wrd.charAt(i)+b;
        }
        if(b.equals(wrd))
         c=true;
        return c;
    }
    void display()
    {
        if(palindrome()==true)
         System.out.println("Number is a palindrome number ");
        else 
         System.out.println("Number is not a palindrome number ");
    }
    public static void main(String args[])
    {
        Check so=new Check();
        so.acceptword();
        so.display();
    }
}
