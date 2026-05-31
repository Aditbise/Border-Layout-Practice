import java.util.*;

class Collection1
{
    int arr[];
    int len;
    Collection1()
    {
        len=0;
    }
    Collection1(int l)
    {
        len=l;
        arr=new int[len];
    }
    void inprr()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element in arrray");
        for(int i=0;i<len;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
    }
    Collection1 common(Collection1 x)
    {
        Collection1 ob=new Collection1(len);
        
        for(int i=0;i<len;i++)
        {
            if(arr[i]!=x.arr[i])
            {
                ob.arr[i]=0;
            }
            else 
            ob.arr[i]=x.arr[i];
        }
        return ob;
    }
    void arrange()
    {
        int a=0;
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                if(arr[i]<arr[j])
                {
                    a=arr[i];
                    arr[i]=arr[j];
                    arr[j]=a;
                }
            }
        }
    }
    void display()
    {
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String arrgs[])
    {
        System.out.println("enter the size of arrray");
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        
        Collection1 C1=new Collection1();
        Collection1 C2=new Collection1();
        
        C1=new Collection1(l);
        C2=new Collection1(l);
        C1.inprr();
        C2.inprr();
        
        Collection1 C3=C1.common(C2);
        
        C3.arrange();
         
        C3.display();
        sc.close();
    }
}


