import java.util.*;
class string 
{
    void check(String s1,String s2)
    {
        int flag=0;
        int l1=s1.length();
        int l2=s2.length();
        if(l1==l2)
        {
            for(int i=0;i<l1;i++)
            {
                if(s1.charAt(i)!=s2.charAt(i))
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            System.out.println("The given string are not equal");
            else
            System.out.println("The given string are equal");
        }
        else
        {
            System.out.println("The given string are not equal");
        }
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        string so=new string();
        System.out.println("Enter 2 strings respectively");
        s1=sc.nextLine();
        s2=sc.nextLine();
        // char c1[]=new char[s1.length()];
        so.check(s1,s2);
        sc.close();
    }
}

