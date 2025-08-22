import java.util.*;
class moviemagic
{
    Scanner ob = new Scanner(System.in);
    int year;
    String title;
    float rating;
    String boxoffice;
    public static void main(String args[])
    {
        moviemagic obj = new moviemagic();
        obj.input();
        obj.calculate();
        obj.display();
    }
    void input()
    {
        System.out.println("Enter the Year of release of the movie");
        year = ob.nextInt();ob.nextLine();
        System.out.println("Enter the TITLE of the movie");
        title = ob.nextLine();
        System.out.println("Enter the rating of the movie out of 10");
        rating = ob.nextFloat();
    }
    void calculate()
    {
        if(rating>=0.0&&rating<2.0)
        boxoffice = "super flop";
        else if(rating>=2.0&&rating<4.0)
        boxoffice = "flop";
        else if(rating>=4.0&&rating<6.0)
        boxoffice = "Semi Hit";
        else if(rating>=6.0&&rating<8.0)
        boxoffice = "Hit";
        else if(rating>=8.0&&rating<9.0)
        boxoffice = "super Hit";
        else if(rating>=9.0&&rating<=10.0)
        boxoffice = "super duper Hit";
    }
    void display()
    {
        System.out.println("Title of the movie ->"+title);
        System.out.println("Rting of the movie ->"+rating);
        System.out.println("State of the movie ->"+boxoffice);
    }
}