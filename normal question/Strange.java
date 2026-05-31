import java.util.*;
class Strange
{
    int ele[]=new int[20];
    int capacity;
    int top;
    Strange(int cap)
    {
        capacity=cap;
        top=-1;
    }
    void pushItem(int value)
    {
        if(top==capacity-1)
            System.out.println("full stack");
        else 
        {
            top++;
            ele[top]=value;
        }
    }
    int popItem()
    {
        if(top==-1)
        {
            System.out.println("Strange is empty returning -9999");
            return -9999;
        }
        else 
        {
            System.out.println("deleted element :"+ele[top]);
            top--;
            return 1;
        }
    }
    void display()
    {
       
        for(int i=top;i>=0;i--)
        System.out.println(ele[i]);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Strange s=new Strange(20);
        int ch=0;
        while(ch<=3)
        {
            System.out.println("press \n1 for oush \n2 for pop \n3 for display \n4 for exit");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("enter the value to be added");
                int v=sc.nextInt();
                s.pushItem(v);
                break;
                
                case 2:s.popItem();
                break;
                
                case 3:s.display();
                break;
            }
        }
        sc.close();
    }
}

