import java.util.*;
class CabbService
{
    Scanner ob = new Scanner(System.in);
    String car_type;
    double km,bill;
    CabbService()
    {
        car_type = "";
        km = 0.0;
        bill = 0.0;
    }
    void accept()
    {
        System.out.println("Enter the type of Car ");
        car_type = ob.nextLine();
        System.out.println("Enter the distance travelled in Km");
        km = ob.nextDouble();
    }
    void calculate()
    {
        if(car_type.equalsIgnoreCase("AC CAR"))
        {
            if(km<=5)
            bill = 150;
            else if(km>5)
            bill = ((km-5)*10)+150;
        }
        else if(car_type.equalsIgnoreCase("NON AC CAR"))
        {
            if(km<=5)
            bill = 120;
            else if(km>5)
            bill = ((km-5)*8)+120;
        }
    }
    void display()
    {
        System.out.println("CAR TYPE : "+car_type);
        System.out.println("KILOMETER TRAVELLED : "+km);
        System.out.println("TOTAL BILL : "+bill);
    }
    public static void main(String args[])
    {
        CabbService obj = new CabbService();
        obj.accept();
        obj.calculate();
        obj.display();
    }
}