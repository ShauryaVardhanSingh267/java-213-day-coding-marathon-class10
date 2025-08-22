import java.util.*;
class movieemagic
{ 
    Scanner ob = new Scanner(System.in);
    int year;
    String title,riv;
    float rating;
    movieemagic()
    {
        year = 0;
        title = "";
        riv = "";
        rating = 0.0f;
    }
    void input()
    {
        System.out.println("Enter the name of the movie");
        title = ob.nextLine();ob.nextLine();
        System.out.println("Enter the year of release of the movie");
        year = ob.nextInt();
        System.out.println("Enter the popularity rating of the movie");
        rating = ob.nextFloat();
    }
    void show()
    {
        System.out.println("Name of movie -> "+title);
        System.out.println("Year of release -> "+year);
        System.out.println("Rating -> "+rating);
        if(rating>=0.0&&rating<=2.0)
        riv = "Flop";
        else if(rating>2.0&&rating<=3.5)
        riv = "Semi hit";
        else if(rating>3.5&&rating<=4.5)
        riv = "Hit";
        else if(rating>4.5&&rating<=5.0)
        riv = "Super Hit";
        System.out.println("Rivew -> "+riv);
    }
    public static void main(String args[])
    {
        movieemagic obj = new movieemagic();
        obj.input();
        obj.show();
    }
}