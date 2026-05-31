import java.util.*;
class Notice 
{
    int DQ[]=new int[20];
    int MaxSize,front,rear;
    
    Notice(int size)
    {
        MaxSize=size;
        front=-1;
        rear=-1;
    }
    void JoinRear(int ele)
    {
        if(rear==MaxSize-1)
             System.out.println("line is over flowing");
        else 
        {  
             if(front==-1)
                 front=0;
                 
             rear++;
             System.out.println("enter the value ");
             DQ[rear]=ele;
        }
    }
    void JoinFront(int ele)
    {
        if(rear==MaxSize-1)
             System.out.println("line is over flowing");
        else
        {
            if(front==-1)
                front=0;
                
            for(int i=rear;i>=front;i--)
            {
                DQ[i+1]=DQ[i];
            }
            DQ[front]=ele;
        }
    }
    
    void FrontDelete()
    {
        if(front==-1)
        System.out.println("the line is empty");
        else
        {
         System.out.println("deleting value :"+DQ[front]);
         front++;
        }
    }
    void RearDelete()
    {
        if(rear==-1)
        System.out.println("the line is empty");
        else
        {
         System.out.println("deleting value :"+DQ[rear]);
         rear--;
        }
    }     
    void PrintLine()
    { 
        for(int i=front;i<rear;i++)
        System.out.println(DQ[i]);
    }
    public static void main(String args[])
    {
        int v,ch=0;
        Scanner sc=new Scanner(System.in);
        Notice n=new Notice(20);
        while(ch<6)
        {
            System.out.println("press \n1 for Join Rear \n2 for Join Front \n3  for FrontDelete \n4 for RearDelete \n5 for Print Line \n press 6 to exit");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:System.out.println("enter the value to be added");
                       v=sc.nextInt();
                       n.JoinRear(v);
                break;
                
                case 2:System.out.println("enter the value to be added");
                       v=sc.nextInt();
                       n.JoinFront(v);
                break;              
                
                case 3:n.FrontDelete();
                break;
                
                case 4:n.RearDelete();
                break;
                        
                case 5:n.PrintLine();
                break;
            }
        }
        sc.close();
    }
}


