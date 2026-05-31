import java.util.Scanner;
class Collection
{
    int arr[];
    int len;
    Collection()
    {
         arr=new int[100];
         len=0;
    }
    Collection(int l)
    {
         len=l;
    }
    void inparr()
    {
         Scanner sc=new Scanner(System.in);
         for(int i=0;i<len;i++)
         {
            arr[i]=(int)Math.random();
         }
        sc.close();
    }
    
    Collection common(Collection ob)
    {
         Collection obj1  = new Collection();
        
         for(int i=0;i<len;i++)
         {
             for(int j=0;j<len;j++)
             {
               if(arr[i]==ob.arr[j])
               {
                  obj1.arr[i]=ob.arr[j];
                  arr[j]=0;
                }
             }
         }
         
         return obj1;
    }
    void Arrange()
    {
        int a=0; 
       for(int i=0;i<len;i++)
       {
           for(int j=i+1;j<len;j++)
           {
               if(arr[i]>arr[j])
               {
                   a=arr[i];
                   arr[i]=arr[j];
                   arr[j]=a;
                }
            }
        }
    }
    void Display()
    {    
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  the length of array");
        int l=sc.nextInt();
        
        Collection so1=new Collection();
        Collection so2=new Collection();
        
        so1  = new Collection(l);
        so2  = new Collection(l);
        
        so1.inparr();
        so2.inparr();
        
        Collection so3  = so1.common(so2);
        
        so3.Arrange();
        so3.Display();   
        sc.close();    
    }
}
