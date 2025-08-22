import java.util.*;
class BoxOffice
{
    Scanner ob = new Scanner(System.in);
    String title,star;
    float revenue;
    BoxOffice()
    {
        title = "";
        star = "";
        revenue = 0.0f;
    }
    void accept()
    {
        System.out.println("Enter the title of the movie ");
        title = ob.nextLine();
        System.out.println("Enter the revenue collected by the mavie");
        revenue = ob.nextFloat();
    }
    void compute()
    {
        if(revenue<=99999)
        star = "*";
        else if(revenue>=100000&&revenue<=499000)
        star = "**";
        else if(revenue>=500000&&revenue<=1500000)
        star = "***";
        else if(revenue>1500000)
        star = "****";
    }
    void display()
    {
        System.out.println("Title of the movie \t Revenue earned \t Star Awarded");
        System.out.println(title+"\t\t\t"+revenue+"\t\t\t"+star);
    }
    public static void main(String args[])
    {
        BoxOffice obj = new BoxOffice();
        obj.accept();
        obj.compute();
        obj.display();
    }
}