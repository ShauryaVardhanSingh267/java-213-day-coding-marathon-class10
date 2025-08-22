import java.util.*;
class employeee
{
    Scanner ob = new Scanner(System.in);
    int pan;
    String name;
    double taxin,tax;
    employeee()
    {
       pan = 0;
       name = "";
       taxin = 0.0;
       tax = 0.0;
    }
    void input()
    {
        System.out.println("Enter your pan number");
        pan = ob.nextInt();
        System.out.println("Enter your taxable income ");
        taxin = ob.nextDouble();
        System.out.println("Enter your name");
        name = ob.nextLine();ob.nextLine();
    }
    void calc()
    {
        if(taxin>=100001 && taxin<=150000)
        tax = (10.0/100.0)*(taxin-100000);
        else if(taxin>=150001 && taxin<=250000)
        tax = 5000 + (20.0/100.0)*(taxin-150000);
        else if(taxin>250000)
        tax = 25000 + (30.0/100.0)*(taxin-250000);
    }
    void display()
    {
        System.out.println("Pan Number \t Name \t Taxable Income \t Tax");
        System.out.println(pan+"\t"+name+"\t"+taxin+"\t"+tax);
    }
    public static void main(String args[])
    {
        employeee obj = new employeee();
        obj.input();
        obj.calc();
        obj.display();
    }
}