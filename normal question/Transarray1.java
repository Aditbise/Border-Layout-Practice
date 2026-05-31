import java.util.*;
class Transarray1
{
    int arr[][];
    int m;
    int n;
    Transarray1()
    {
        n=0;
        m=0;
    }
    Transarray1(int mm,int nn)
    {
        m=mm;
        n=nn;
        arr=new int[m][n];
    }
    void fillarray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element in array");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
                
            }
            
        }
        sc.close();
    }
    void transpose(Transarray1 A)
    {
    
        if(m==n)
        {
             for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arr[j][i]=A.arr[i][j];     
                }
            }
        }
        
    }
    void disparray()
    {
         for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");    
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter th size of array");
        int m=sc.nextInt();
        int n=sc.nextInt();
        
        Transarray1 T1=new Transarray1();
        Transarray1 T2=new Transarray1();
        
        T1=new Transarray1(m,n);
        T2=new Transarray1(m,n);
        
        T1.fillarray();
        T2.fillarray();
        
        T1.transpose(T2);
        
        T1.disparray();
        sc.close();
    }
}

