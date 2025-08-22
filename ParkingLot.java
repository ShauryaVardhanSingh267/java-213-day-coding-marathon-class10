import java.util.*;
class ParkingLot
{
    Scanner ob = new Scanner(System.in);
    int vno,hours;
    double parking;
    public static void main(String args[])
    {
        ParkingLot obj = new ParkingLot();
        obj.input();
        obj.calculate();
        obj.display();
    }
    void input()
    {
        System.out.println("Enter your Vehicle Number");
        vno = ob.nextInt();
        System.out.println("Enter the number of hours your car was parked ");
        hours = ob.nextInt();
    }
    void calculate()
    {
        if(hours>=1&&hours<=3)
        parking = hours*30;
        else if(hours>3&&hours<=5)
        parking = hours*40;
        else if(hours>5)
        parking = hours*50;
    }
    void display()
    {
        System.out.println("Vehicle Number--> "+vno);
        System.out.println("Hours Parked --> "+hours);
        System.out.println("Amount to be Paid --> "+parking);
    }
}