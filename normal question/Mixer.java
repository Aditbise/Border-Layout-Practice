import java.util.*;
class Mixer
{
    int ar[];
    int n;
    Mixer(int nn)
    {
        n=nn;
        ar=new int[n];
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array in ascending order without repeating the word ");
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        sc.close();
    }
    Mixer mix(Mixer A)
    {
        int x=0;
        Mixer C= new Mixer(n+(A.n));
        for(int i=0;i<n;i++)
        {
         C.ar[x++]=ar[i];
        }  
        
        for(int i=0;i<n;i++)
        {
         C.ar[x++]=A.ar[i];
        }   
        return C;
    }
    void display()
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value length of array ");
        int l=sc.nextInt();
        Mixer M1=new Mixer(l);
        Mixer M2=new Mixer(l);
        
        M1.accept();
        M2.accept();
        
        Mixer M3= M1.mix(M2);
        
        M3.display();
        sc.close();
        
    }
}
