import java.util.*;
class stock
{
    Scanner ob = new Scanner(System.in);
    String cmpname,rem;
    int points;
    char grd;
    stock()
    {
        cmpname = "";
        rem = "";
        points = 0;
        grd = 0;
    }
    void input()
    {
        System.out.println("Enter the name of the company");
        cmpname = ob.nextLine();
        System.out.println("Enter the points earned by your company");
        points = ob.nextInt();
    }
    void calculate()
    {
        if(points>=0 && points<=20)
        {
            grd = 'D';
            rem = "Poor for Investment";
        }
        else if(points>=21 && points<=50)
        {
            grd = 'C';
            rem = "Average for Investment";
        }
        else if(points>=51 && points<=90)
        {
            grd = 'B';
            rem = "Good for Investment";
        }
        else if(points>=91 && points<=100)
        {
            grd = 'A';
            rem = "Best for Investment";
        }
    }
    void display()
    {
        System.out.println("Name of Company : "+cmpname);
        System.out.println("Points earned by the Company : "+points);
        System.out.println("Grade Awarded : "+grd);
        System.out.println("Remarks of stock exchange : "+rem);
    }
    public static void main(String args[])
    {
        stock obj = new stock();
        obj.input();
        obj.calculate();
        obj.display();
    }
}