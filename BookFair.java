import java.util.*;
class BookFair
{
    Scanner ob = new Scanner(System.in);
    String Bname;double price;
    BookFair()
    {
        Bname = "";
        price = 0.0;
    }
    void Input()
    {
        System.out.println("Enter the name of the book you are purchasing");
        Bname = ob.nextLine();
        System.out.println("Enter the price of the book you are purchasing");
        price = ob.nextDouble();
    }
    void calculate()
    {
        if(price<=1000)
        price -= (2.0/100)*price;
        else if(price>1000 && price<=3000)
        price -= (10.0/100)*price;
        else if(price>3000)
        price -= (15.0100)*price;
    }
    void display()
    {
        System.out.println("Name of book purchased : "+Bname);
        System.out.println("Price of book after discount : "+price);
    }
    public static void main(String args[])
    {
        BookFair obj = new BookFair();
        obj.Input();
        obj.calculate();
        obj.display();
    }
}