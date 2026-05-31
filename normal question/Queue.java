class Queue
{
    int dat[]=new int[0];
    int cap;
    int front;
    int rear;
    Queue(int max)
    {
        cap=max;
        front=rear=0;
        dat=new int[cap];
    }
    void add_data(int v)
    {
        if(rear==cap-1)
         System.out.println("Queue full");
        else
         dat[rear++]=v;   
    }
    int pop_dat()
    {
        if(front==0)
         return -999;
        else
         return dat[front++];
    }
    void display()
    {
        for(int i=0;i<cap;i++)
        {
            System.out.print(dat[i]+" ");
        }
    }
}
