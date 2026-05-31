import java.util.*;
class Combine
{
    int com[];
    int size;
    Combine(int nn)
    {
        size=nn;
        com=new int[nn*2];
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
        int a;
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(com[i]>com[j])
                {
                    a=com[i];
                    com[i]=com[j];
                    com[j]=a;
                }   
            }
        }
        
    }
    void mix(Combine x,Combine y)
    {
        int x1=size;
        for(int i=0;i<size;i++)
        {
            x.com[x1++]=y.com[i];
        }
    }
    
    void display()
    {
        for(int i=0;i<com.length;i++)
        {
            if(com[i]!=0)
            System.out.print(com[i]+" ");
        }
    }
    public static void main(String ar[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the length of array");
         int c=sc.nextInt();
         Combine so1=new Combine(c);
         Combine so2=new Combine(c);
         so1.inputarray();
         so2.inputarray();
         
         so1.sort();
         so2.sort();
         
         so1.mix(so1,so2);
         
         so1.display();
         sc.close();
         
        }
 }


