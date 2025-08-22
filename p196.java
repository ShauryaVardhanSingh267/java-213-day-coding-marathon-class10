import java.util.*;
class p196
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a String");
        String n = ob.nextLine();
        String b = " "+n.trim();
        String a = b.toUpperCase();
        int l = a.length(),i,count = 0;
        System.out.println("Enter an Upper Case letter");
        char bh = ob.next().charAt(0);
        char ch = 0;
        for(i=0;i<l;i++)
        {
            ch = a.charAt(i);
            if(Character.isWhitespace(ch))
            {
                if(a.charAt(i+1)==bh)
                count++;
            }
        }
        System.out.println("Total number of words starting with letter "+bh+" = "+count);
    }
}