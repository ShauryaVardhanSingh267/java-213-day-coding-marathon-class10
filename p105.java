import java.util.*;
class p105
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a String");
        String a = ob.nextLine();
        int l = a.length(),i;
        for(i=0;i<l;i++)
        {
            System.out.println(a.charAt(i));
        }
    }
}