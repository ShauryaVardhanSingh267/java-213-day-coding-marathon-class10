import java.util.*;
class p89
{
    Scanner ob = new Scanner(System.in);
    int units;
    String n;
    double bill;
    public static void main(String args[])
    {
        p89 obj = new p89();
        obj.accept();
        obj.calculate();
        obj.print();
    }
    void accept()
    {
        System.out.println("Enter your Name");
        n = ob.nextLine();
        System.out.println("Enter your units");
        units = ob.nextInt();
    }
    void calculate()
    {
        if(units<=100)
        bill = units* 2.0;
        else if(units>100  && units<=300)
        bill = units* 3.0;
        else if(units > 300)
        bill = units* 5.0;
    }
    void print()
    {
        System.out.println("Name of the customer -> "+n);
        System.out.println("Number of units consumed by the customer -> "+units);
        System.out.println("Bill amount --> "+bill);
    }
}