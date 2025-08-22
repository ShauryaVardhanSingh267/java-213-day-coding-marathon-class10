import java.util.*;
class Faculty
{
    Scanner ob = new Scanner(System.in);
    int fCode,YOE;
    String Name,Category;
    double basicSal,gradePay,grossSal;
    Faculty()
    {
        fCode =0;YOE =0;
        Name=""; Category="";
        basicSal=0.0;gradePay=0.0;grossSal=0.0;
    }
    void input()
    {
        System.out.println("Enter your Faculty Code ");
        fCode = ob.nextInt();ob.nextLine();
        System.out.println("Enter your Name");
        Name = ob.nextLine();ob.nextLine();
        System.out.println("Enter your Category");
        Category = ob.nextLine();ob.nextLine();
        System.out.println("Enter your years of experience ");
        YOE = ob.nextInt();
    }
    void compute()
    {
        if(Category.equals("PRT"))
        {
            if(YOE<10)
            basicSal = 15000;
            else if(YOE>=10)
            basicSal = 17500;
        }
        else if(Category.equals("TGT"))
        {
            if(YOE<10)
            basicSal = 20000;
            else if(YOE>=10)
            basicSal = 35000;
        }
        else if(Category.equals("PGT"))
        {
            if(YOE<10)
            basicSal = 30000;
            else if(YOE>=10)
            basicSal = 45000;
        }
    }
    void display()
    {
        System.out.println("Name : "+Name);
        System.out.println("Faculty Code : "+fCode);
        System.out.println("Category : "+Category);
        System.out.println("Years of Experience : "+YOE);
        System.out.println("Basic Salary : "+basicSal);
        System.out.println("Grade Pay : "+((50/100.0)*basicSal));
        System.out.println("Gross Salary : "+(basicSal + ((50/100.0)*basicSal)) );
    }
    public static void main(String args[])
    {
        Faculty obj = new Faculty();
        obj.input();
        obj.compute();
        obj.display();
    }
}