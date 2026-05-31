import java.util.*;
class Word 
{
    String txt;
    int len;
    Word()
    {
        txt="";
        len=0;
    }
    void readTxt() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string in Upper case only");
        txt=sc.nextLine().toUpperCase();
        sc.close();
    }
    void removeVowel()
    {
        String a="";
        len=txt.length();
        for(int i=0;i<len;i++)
        if(txt.charAt(i)=='A'||txt.charAt(i)=='E'||txt.charAt(i)=='I'||txt.charAt(i)=='O'||txt.charAt(i)=='U'||txt.charAt(i)=='a'||txt.charAt(i)=='e'||txt.charAt(i)=='i'||txt.charAt(i)=='o'||txt.charAt(i)=='u')    
            continue;
        else
             a=a+txt.charAt(i);
        
        System.out.println("Changed string :"+a); 
        disp(a);
    }
    void disp(String x)
    {  
        System.out.println("Original string :"+txt);
        System.out.println("Changed string  :"+x);
    }
    public static void main(String args[])
    {
     Word so=new Word();
     so.readTxt();
     so.removeVowel();
    }
}
