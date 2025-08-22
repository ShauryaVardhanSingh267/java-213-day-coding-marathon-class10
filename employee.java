import java.util.*;
class employee
{
    Scanner ob = new Scanner(System.in);
    int eno , age ;double basic,net;
    String ename;
    employee()
    {
        eno = 0;
        age = 0;
        basic = 0.0;
        net = 0.0;
        ename = "";
    }
    void accept()
    {
        System.out.println("Enter your Name");
        ename = ob.nextLine();ob.nextLine();
        System.out.println("Enter your Employee number");
        eno = ob.nextInt();
        System.out.println("Enter your age");
        age = ob.nextInt();
        System.out.println("Enter your basic salary");
        basic = ob.nextDouble();
    }
    void calculate()
    {
        double hra = (18.5/100)*basic;
        double da = (17.45/100)*basic;
        double pf = (8.10/100)*basic;
        net = basic + hra + da -pf;
        if(age>50)
        net+=5000;
    }
    void print()
    {
        System.out.println(eno+"\t"+ename+"\t"+age+"\t"+basic+"\t"+net);
    }
    public static void main(String args[])
    {
        employee obj = new employee();
        obj.accept();
        obj.calculate();
        obj.print();
    }
}