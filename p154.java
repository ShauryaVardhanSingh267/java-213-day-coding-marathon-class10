import java.util.*;
class p154
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your name");
        String n = ob.nextLine();
        String a = n.trim();
        String s = "",fin = "";
        int first = a.indexOf(' ');
        int last = a.lastIndexOf(' ');
        s = a.substring((first+1),(last));
        fin = s + " " + a.substring(0,first) + " " + a.substring(last+1);
        System.out.println(fin);
    }
}