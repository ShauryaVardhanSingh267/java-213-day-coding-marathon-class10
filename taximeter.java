import java.util.*;
class taximeter
{
    Scanner ob = new Scanner(System.in);
    int taxino,km;
    String name,blame;
    double bill;
    taximeter()
    {
        taxino=0;
        km=0;
        name="";
        blame="";
        bill=0.0;
    }
    void input()
    {
        System.out.println("Enter your name");
        name = ob.nextLine();ob.nextLine();
        System.out.println("Enter the taxi number");
        taxino = ob.nextInt();
        System.out.println("Enter the number of kilometers travelled");
        km = ob.nextInt();
    }
    void calculate()
    {
        if(km<=1)
        bill = 25;
        else if(km>1&&km<=6)
        bill = (25*1)+(km-1)*10;
        else if(km>6&&km<=12)
        bill = (25*1)+(10*5)+(km-6)*15;
        else if(km>12&&km<=18)
        bill = (25*1)+(10*5)+(15*6)+(km-12)*20;
        else if(km>18)
        bill = (25*1)+(10*5)+(15*6)+(20*6)+(km-18)*25;
    }
    void display()
    {
        System.out.println("Taxino \t Name \t Kilometers Travelled \t Bill amount");
        System.out.println(taxino+"\t"+name+"\t\t"+km+"\t\tRs."+bill);
    }
    public static void main(String args[])
    {
        taximeter obj = new taximeter();
        obj.input();
        obj.calculate();
        obj.display();
    }
}