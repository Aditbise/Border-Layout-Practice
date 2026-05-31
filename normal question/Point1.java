import java.util.*;
class Point1
{
    int x,y;
    Point1()
    {
        x=0;
        y=0;
    }
    void readpoint()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the quardinate of x and y axis");
        x=sc.nextInt();
        y=sc.nextInt();
        sc.close();
    }
    Point1 midpoint(Point1 A,Point1 B)
    {
        
        Point1 ob=new Point1();
        ob.x=(A.x+B.x)/2;
        ob.y=(A.y+B.y)/2;
        return ob;
    }
    void displaypoint()
    {
        System.out.println("mid point  = p("+x+","+y+")");
    }
    public static void main(String args[])
    {
        Point1 P1=new Point1();
        Point1 P2=new Point1();
        
        P1.readpoint();
        P2.readpoint();
        
        Point1 P3=P1.midpoint(P1,P2);
        
        P3.displaypoint();
        
    }
}


