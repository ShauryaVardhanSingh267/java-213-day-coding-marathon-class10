import java.util.*;
class ShowRoom
{
    Scanner ob = new Scanner(System.in);
    String name;
    long mobno;
    double cost,dis,amount;
    ShowRoom()
    {
        name = "";
        mobno = 0;
        cost = 0.0;
        dis = 0.0;
        amount = 0.0;
    }
    void input()
    {
        System.out.println("Enter your Name ");
        name = ob.nextLine();
        System.out.println("Enter your Mobile Number");
        mobno = ob.nextLong();
        System.out.println("Enter the total cost of the items purchased");
        cost = ob.nextDouble();
    }
    void calculate()
    {
        if(cost<=10000)
        dis = (5.0/100)*cost;
        else if(cost>10000 && cost<=20000)
        dis = (10.0/100)*cost;
        else if(cost>20000 && cost<=35000)
        dis = (15.0/100)*cost;
        else if(cost>35000)
        dis = (20.0/100)*cost;
        amount = cost - dis;
    }
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Mobile Number : "+mobno);
        System.out.println("Total amount : "+amount);
    }
    public static void main(String args[])
    {
        ShowRoom obj = new ShowRoom();
        obj.input();
        obj.calculate();
        obj.display();
    }
}