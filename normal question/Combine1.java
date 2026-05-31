import java.util.*;
class Combine1
{
    int com[];
    int size;
    Combine1(int nn)
    {
        size=nn;
        com=new int[nn];
    }
    void inputarray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element of array");
        for(int i=0;i<size;i++)
        {
            com[i]=sc.nextInt();
        }
        sc.close();
    }
    void sort()
    {
        int a=0;
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                a=com[i];
                com[i]=com[j];
                com[j]=a;
            }
        }
    }
    void mix(Combine1 A,Combine1 B)
    {
        int x=size;
        for(int i=0;i<size;i++)
        {
                A.com[x++]=B.com[i];
            }
    }
    void display()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(com[i]+" ");
        }
    }
    public static void main(String ar[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the length of array");
         int c=sc.nextInt();
         Combine1 so1=new Combine1(c);
         Combine1 so2=new Combine1(c);
         so1.inputarray();
         so2.inputarray();
         
         so1.sort();
         so2.sort();
         
         so1.mix(so1,so2);
         
         so1.display();
         sc.close();
    }
}


