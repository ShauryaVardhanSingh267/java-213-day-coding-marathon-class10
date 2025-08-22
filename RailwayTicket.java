import java.util.*;
class RailwayTicket
{
    Scanner ob = new Scanner(System.in);
    String name , coach;
    long mobno;
    int amt,totalamt;
    RailwayTicket()
    {
        name ="";
        coach="";
        mobno=0;
        amt=0;
        totalamt=0;
    }
    void accept()
    {
        System.out.println("Enter your coach as following : First_AC\nSecond_AC\nThird_AC\nSleeper");
        coach = ob.nextLine();
        System.out.println("Enter your name");
        name = ob.nextLine();ob.nextLine();
        System.out.println("Enter your Contact Number");
        mobno = ob.nextLong();
        System.out.println("Enter the basic amount of your ticket");
        amt = ob.nextInt();
    }
    void update()
    {
        if(coach.equalsIgnoreCase("First_AC"))
        totalamt = amt +700;
        else if(coach.equalsIgnoreCase("Second_AC"))
        totalamt = amt +500;
        else if(coach.equalsIgnoreCase("Third_AC"))
        totalamt = amt +250;
        else if(coach.equalsIgnoreCase("Sleeper"))
        totalamt = amt +0;
    }
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Contact Number : "+mobno);
        System.out.println("Coach : "+coach);
        System.out.println("Total payable amount : "+totalamt);
    }
    public static void main(String args[])
    {
        RailwayTicket obj = new RailwayTicket();
        obj.accept();
        obj.update();
        obj.display();
    }
}