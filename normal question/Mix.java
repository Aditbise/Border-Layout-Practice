import java.util.*;
class Mix
{
    String wrd;
    int len;
    Mix()
    {
        wrd="";
        len=0;
    }
    void feedword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the word ");
        wrd=sc.nextLine();
        wrd=wrd.toUpperCase();
        sc.close();
    }
    void mix_word(Mix P,Mix Q)
    {
        String s="";
        if(P.wrd.length()>Q.wrd.length())
        len=P.wrd.length();
        else
        len=Q.wrd.length();
        
        for(int i=0;i<len;i++)
        {
          if(i<Q.wrd.length())
          s=P.wrd.charAt(i)+""+Q.wrd.charAt(i);
          else
          s=s+P.wrd.charAt(i);
        }
        
    }
    void Display()
    {
        System.out.println(wrd);
    }
    public static void main(String argsfdgvdh[])
    {
        Mix so1=new Mix();
        Mix so2=new Mix();
        
        so1.feedword();
        so2.feedword();
        
        so1.mix_word(so1,so2);
        
        so1.Display();
        
    }
}


