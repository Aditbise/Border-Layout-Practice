import java.util.*;
class Godown
{
    String item;
    int qty;
    int rate;
    int amt;
    Godown(String i,int q,int r,int a)
    {
        item=i;
        qty=q;
        rate=r;
        amt=a;
    }
    void display()
    {
        System.out.println("Item name :"+item);
        System.out.println("Quantity :"+qty);
        System.out.println("Rate :"+rate);
        System.out.println("Amount :"+amt);
    }
}
class Update extends Godown
{
    int pur_qty;
    int pur_rate;
    Update(int qt,int ra)
    {
        super("Data box",100,5,500);
        pur_qty=qt;
        pur_rate=ra;
    }
    void update()
    {
        System.out.println("Original Data");
        super.display();
        qty=qty+pur_qty;
        rate=pur_rate;
        super.amt=qty*rate;
    }
    void display()
    {
        System.out.println("Changed Data");
        super.display();
    }
    public static void main(String args[])
    {
        int pq;
        int pr;
        System.out.println("Enter the value of Purchase quantity,Purchase rate respactively");
        Scanner sc=new Scanner(System.in);
        pq=sc.nextInt();
        pr=sc.nextInt();
        Update so=new Update(pq,pr);
        so.update();
        so.display();
        sc.close();
    }
}
