import java.util.*;
class p120
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String n=ob.nextLine(),a=n.trim(),w="";
        char c;int i,l=a.length();
        w=w+Character.toUpperCase(a.charAt(0));
        for(i=1;i<l;i++)
        {
            c=a.charAt(i);
            if(Character.isWhitespace(a.charAt(i-1)))
            w=w+Character.toUpperCase(c);
            else
            w=w+c;
        }
        System.out.println(w);
    }
}