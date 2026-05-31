import java.util.*;
class Point 
{
    int x,y;
    Point()
    {
        x=0;
        y=0;
    }
    void readpoint()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of coordinates of xand y respectly");
        x=sc.nextInt();
        y=sc.nextInt();
        sc.close();
    }
    Point midpoint(Point A,Point B)
    {
        Point C=new Point();
        C.x=(A.x+B.x)/2;
        C.y=(A.y+B.y)/2;
        return C;
    }
    void displaypoint()
    {
        System.out.println("p3("+x+","+y+")");
    }
    public static void  main(String args[])
    {
        Point p1=new Point();
        Point p2=new Point();
        
        p1.readpoint();
        p2.readpoint();
        
        // Point p3 = p1.midpoint(p1,p2);
        
        p1.displaypoint();
        
    }
}


