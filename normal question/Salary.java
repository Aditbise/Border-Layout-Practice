import java.util.*;

class Salary extends Employee
{
    float da;
    float hra,spl,tsal;
    Salary()
    {
        da=0;
        hra=0;
        spl=0;
        tsal=0;
    }
    
    Salary(float d,float h,float s)
    {
        super(101,10000);
        da=d;
        hra=h;
        spl=s;
    }
    double calculate_sal()
    {
        tsal=da+hra+spl;
        return tsal;
    }
    void show_salary()
    {
        System.out.println("Dearness Allowance :"+da);
        System.out.println("House Rent Allowance :"+hra);
        System.out.println("Store Special Allowance :"+spl);
        System.out.println("Net Payable Salary :"+calculate_sal());
    }
    public static void main(String args[])
    {
        Salary s=new Salary();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the \nDearness Allowance :");
        System.out.println("House Rent Allowance :");
        System.out.println("Store Special Allowance :");
        float d=sc.nextFloat();
        float h=sc.nextFloat();
        float s1=sc.nextFloat();
        
        s=new Salary(d,h,s1);
        s.salinfo();
        s.show_salary();
        sc.close();
    }
}

class Employee
{
    protected int empn;
    protected double bsal;
    Employee()
    {
        empn=0;
        bsal=0;
    }
    Employee(int e,double b)
    {
        empn=e;
        bsal=b;
    }
    void salinfo()
    {
        System.out.println("Employee Number :"+empn+"\nBasic Salary   :"+bsal);
    }
}
