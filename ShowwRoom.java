import java.util.*;
class ShowwRoom
{
    Scanner ob = new Scanner(System.in);
    String name;
    long mobno;
    double cost,dis,amount;
    ShowwRoom()
    {
        name = "";
        mobno = 0L;
        cost = 0.0;
        dis = 0.0;
        amount = 0.0;
    }
    void input()
    {
        System.out.println("Enter your name");
        name = ob.nextLine();
        System.out.println("Enter your Mobile Number");
        mobno = ob.nextLong();
        System.out.println("Enter the cost of your purchase");
        cost = ob.nextDouble();
    }
    void calculate()
    {
        if(cost<=10000)
        dis = (5.0/100.0)*cost;
        else if(cost>10000 && cost<=20000)
        dis = (10.0/100.0)*cost;
        else if(cost>20000 && cost<=35000)
        dis = (15.0/100.0)*cost;
        else if(cost>35000)
        dis = (20.0/100.0)*cost;
    }
    void display()
    {
        System.out.println("Name of the Customer : "+name);
        System.out.println("Mobile Number : "+mobno);
        System.out.println("Amount : "+(cost-dis));
    }
    public static void main(String args[])
    {
        ShowwRoom obj = new ShowwRoom();
        obj.input();
        obj.calculate();
        obj.display();
    }
}