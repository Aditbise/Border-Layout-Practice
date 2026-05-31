import java.util.*;
class Exchange
{
    String Sent;
    String Rev;
    int len;
    Exchange()
    {
        Sent="";
        Rev="";
        len=0;
    }
    void readSentence()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the enter the sentence");
        Sent=sc.nextLine();
        Sent=Sent.trim();
        Sent=Sent+" ";
        sc.close();
    }
    void exFirstLast()
    {
        String a="",b="";
        for(int i=0;i<Sent.length();i++)
        {
            if(Sent.charAt(i)==' ')
           {
            System.out.print(" "+a);
            b=b+" "+a;
            a="";
           }
           else
           {
            a=Sent.charAt(i)+a;
           }
        }
        System.out.println();
        display(b);
    }
    void display(String bx)
    {
        System.out.println("Original sentence:"+Sent);
        System.out.println("Changed sentence :"+bx);
    }
    public static void main(String args[])
    {
        Exchange so=new Exchange();
        so.readSentence();
        so.exFirstLast();
    }
}
