import java.util.*;
class p122
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String a = ob.nextLine(),s="";
        int i,l=a.length();
        char ch = 0,n=0;
        for(i=0;i<l;i++)
        {
            ch = a.charAt(i);
            if(Character.isLetter(ch))
            {
                if(Character.isUpperCase(ch))
                n=Character.toLowerCase(ch);
                else
                n=Character.toUpperCase(ch);
                s=s+n;
            }
            else
            s=s+ch;
        }
        System.out.println(s);
    }
}