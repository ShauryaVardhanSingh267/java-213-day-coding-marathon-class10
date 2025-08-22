import java.util.*;
class p106
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a String for printing the pattern");
        String a = ob.nextLine();
        int i,l=a.length(),c,r;
        for(r=0;r<l;r++)
        {
            for(c=0;c<=r;c++)
            System.out.print(a.charAt(c));
            System.out.println();
        }
    }
}