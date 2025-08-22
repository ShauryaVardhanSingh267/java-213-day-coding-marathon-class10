import java.util.*;
class p131
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter any word in capital letters");
        String a = ob.nextLine();
        int r,c,l=a.length();
        for(r=0;r<l;r++)
        {
            for(c=0;c<=r;c++)
            {
                System.out.print(a.charAt(c));
            }
            System.out.println();
        }
    }
}