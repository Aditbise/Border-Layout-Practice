import java.util.*;
class stack
{
    int sta[]=new int[10];
    int top=-1,max=10;
    void push()
    {
        Scanner sc=new Scanner(System.in);
        if(top==max-1)
            System.out.println("full stack");
        else 
        {
            top++;
            System.out.println("enter value in stack");
            sta[top]=sc.nextInt(); 
        }
        sc.close();
    }
    void pop()
    {
        if(top==-1)
            System.out.println("empty stack");
        else 
        {
            System.out.println("deleated element "+sta[top]);
            top--;
        }
    }
    void display()
    {
        for(int i=top;i>=0;i--)
        System.out.println(sta[i]);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ch=0;
        stack s=new stack();
        do
        {
            System.out.println("press \n1 for oush \n2 for pop \n3 for display \n4 for exit");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1: s.push();
                break;
                
                case 2: s.pop();
                break;
                
                case 3: s.display();
                break;
                
            }
        }while(ch<=3);
        sc.close();
    }
}


