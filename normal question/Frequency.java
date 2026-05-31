import java.util.*;
class Frequency
{
    String text;
    int countand;
    int countan;
    int len ;
    Frequency()
    {
        text="";
        countand=0;
        countan=0;
        len=0;
    }
    void accept(String n)
    {
        text=n.toLowerCase();
    }
    void checkandfreq()
    {   
        len=text.length();
        for(int i=0;i<len;i++)
        {
            if(text.charAt(i)=='a' && text.charAt(i+1)=='n' && text.charAt(i+2)=='d')
            {
                countand++;
            }
        }
    }
    void checkanfreq()
    {
        len=text.length();
        for(int i=0;i<len;i++)
        {
          if(text.charAt(i)=='a' && text.charAt(i+1)=='n'&& text.charAt(i+2)==' ')
            {
                countan++;
            }
        }
    }
    void display()
    {
        System.out.println("frequency of and :"+countand);
        System.out.println("frequency of an  :"+countan );
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sentence ");
        String n=sc.nextLine();
        Frequency so=new Frequency();
        so.accept(n);
        so.checkandfreq();
        so.checkanfreq();
        so.display();
        sc.close();
    }
}


