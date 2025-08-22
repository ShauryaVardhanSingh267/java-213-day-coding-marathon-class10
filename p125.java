import java.util.*;
class p125
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String n = ob.nextLine(), a=n.trim(),s="";
        int i , l=a.length();
        char ch=0,ph=0;
        s=s+Character.toUpperCase(a.charAt(0));
        for(i=1;i<l;i++)
        {
            ch = a.charAt(i);
            if(Character.isWhitespace(a.charAt(i-1)))
            {
            ph = Character.toUpperCase(a.charAt(i));
            s=s+ph;
            } 
            else
            s=s+ch;
        }
        System.out.println(s);
    }
}