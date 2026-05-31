class Library
{ 
    String Name;
    String author;
    double p;
    Library(String N,String a,double p)
    {
        Name=N;
        author=a;
        p=this.p;
    }
    void show()
    {
        System.out.println("Name :"+Name);
        System.out.println("Author :"+author);
        System.out.println("Price :"+p);
    }
}
class Computer extends Library
{
    int d;
    double f;
    Computer(int days)
    {
        super("Bluej With Java","Aditya",230);
        d=days;
        f=0;
    }
    
    void fine()
    {
        if(d>7 && d<12)
          f=(((2/100)*p)*d)+(2*(d-7));
        else if(d>12 && d<16)
          f=(((2/100)*p)*d)+(2*(d-12));
        else if(d>16)
          f=(((2/100)*p)*d)+(2*(d-16)); 
    }
    void display()
    {
        show();
        System.out.println("Number of days :"+d);
        System.out.println("Fine :"+f);
    }
    public static void main(String args[])
    {
        Computer so=new Computer(35);
        so.fine();
        so.display();
    }
}
