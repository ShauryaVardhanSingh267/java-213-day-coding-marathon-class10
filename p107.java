import java.util.*;
class p107
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a String");
        String a = ob.nextLine();
        int r,c,i,l=a.length(),d=l;
        for(r=1;r<=l;r++,d--)
        {
            for(c=1;c<=r;c++)
            System.out.print(" ");
            System.out.print(a.substring(0,d));
            System.out.println();
        }
    }
}