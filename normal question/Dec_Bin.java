import java.util.*;
class Dec_Bin
{
    int n,i;
    String s;
    
    Dec_Bin()
    {
        n=0;
        s="";
        i=0;
    }
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        n=sc.nextInt();
        sc.close();
    }
    void recursive(int a)
    {
        if(a>0)
        { 
         s=(a%2)+s;
         recursive(a/2);
        }
        else 
        System.out.println(s);
    }
    void putdata()
    {
        recursive(n);
    }
    public static void main(String args[])
    {
        Dec_Bin d=new Dec_Bin();
        d.getdata();
        d.putdata();
    }
}

