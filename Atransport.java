import java.util.*;
class Atransport
{
    Scanner ob = new Scanner(System.in);
    String name;
    int w;
    int charge;
    double bill;
    Atransport()
    {
        name = "";
        w = 0;
        charge = 0;
        bill = 0.0;
    }
    void accept()
    {
        System.out.println("Enter your name ");
        name = ob.nextLine();
        System.out.println("Enter the weight of your parcel");
        w = ob.nextInt();
    }
    void calculate()
    {
        if(w<=10)
        charge = 25*w;
        else if(w>10&&w<=30)
        charge = 250 + 20*(w-10);
        else if(w>30)
        charge = 250 + 400 + 10*(w-30);
        bill = charge + (5/100.0)*charge;
    }
    void print()
    {
        System.out.println("Name \t Weight \t Bill Amount");
        System.out.println(name+"\t"+w+"\t"+bill);
    }
    public static void main(String args[])
    {
        Atransport obj = new Atransport();
        obj.accept();
        obj.calculate();
        obj.print();
    }
}