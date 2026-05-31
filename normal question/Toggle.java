import java.util.*;
class Toggle
{
    String str;
    String newstr;
    int len;
    Toggle()
    {
        str="";
        newstr="";
        len=0;
    }
    void readword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        str=sc.nextLine();
        sc.close();
    }
    void toggle()
    {
        len=str.length();
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch))
             newstr=newstr+(Character.toLowerCase(ch));
            else
             newstr=newstr+(Character.toUpperCase(ch));
        }
    }
    void display()
    {
        System.out.println("Original word :"+str);
        System.out.println("New word :"+newstr);
        
    }
    public static void main(String args[])
    {
        Toggle so=new Toggle();
        so.readword();
        so.toggle();
        so.display();
    }
}
