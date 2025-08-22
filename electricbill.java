import java.util.*;
class electricbill
{
    Scanner ob = new Scanner(System.in);
    String n;
    int units;
    double bill;
    electricbill()
    {
         n="";
         units=0;
         bill=0.0;
    }
    void accept()
    {
        System.out.println("Enter your name please");
        n = ob.nextLine();ob.nextLine();
        System.out.println("Enter the number of units consumed");
        units = ob.nextInt();
    }
    void calculate()
    {
        if(units<=100)
        bill = units*2.0;
        else if(units>100&&units<=300)
        bill = 200.0+(units-100)*3.0;
        else if(units>300&&units<=600)
        {
        bill = 200.0 + 600.0 +(units-300)*5.0;
        bill += (2.5/100)*bill;
        }
    }
    void print()
    {
        System.out.println("Name : "+n);
        System.out.println("Units consumed : "+units);
        System.out.println("Bill Amount : "+bill);
    }
    public static void main(String args[])
    {
        electricbill obj = new electricbill();
        obj.accept();
        obj.calculate();
        obj.print();
    }
}