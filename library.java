import java.util.*;
class library
{
    Scanner ob = new Scanner(System.in);
    int accnum , late,fine;
    String title,author;
    library()
    {
        accnum = 0;
        late = 0;
        fine = 0;
        title = "";
        author = "";
    }
    void input()
    {
        System.out.println("Enter the accesion number of the book");
        accnum = ob.nextInt();
        System.out.println("Enter the title of the book");
        title = ob.nextLine();ob.nextLine();
        System.out.println("Enter the name of the author");
        author = ob.nextLine();ob.nextLine();
        System.out.println("Enter the number of days you are late in returning the book");
        late = ob.nextInt();
    }
    void compute()
    {
        fine = late*2;
    }
    void display()
    {
        System.out.println("Accession Number -> "+accnum);
        System.out.println("Title -> "+title);
        System.out.println("Author -> "+author);
        System.out.println("Number of days Late -> "+late+" days");
        System.out.println("Fine to be paid -> "+"Rs. "+fine);
    }
    public static void main(String args[])
    {
        library obj = new library();
        obj.input();
        obj.compute();
        obj.display();
    }
}