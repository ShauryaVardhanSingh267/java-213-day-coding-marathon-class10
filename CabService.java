import java.util.*;
class CabService
{
    Scanner ob = new Scanner(System.in);
    String Cartype;
    double km ,bill;
    CabService()
    {
        Cartype = "";
        km = 0.0;
        bill = 0.0;
    }
    void accept()
    {
        System.out.println("Enter your Cartype");
        Cartype = ob.nextLine();ob.nextLine();
        System.out.println("Enter the distance travelled by your car in Kilometers ");
        km = ob.nextDouble();
    }
    void calculate()
    {
        if(Cartype.equalsIgnoreCase("AC CAR"))
        {
            if(km<=5.0)
            bill = 30.0*km;
            else if(km>5.0)
            bill = 150.0 + (km-5)*10.0;
        }
        else if(Cartype.equalsIgnoreCase("NON AC CAR"))
        {
            if(km<=5.0)
            bill = 20.0*km;
            else if(km>5.0)
            bill = 100.0 + (km-5)*8.0;
        }
    }
    void display()
    {
        System.out.println("Car Type : "+Cartype);
        System.out.println("Kilometer Travelled : "+km+" Total Bill : "+bill);
    }
}