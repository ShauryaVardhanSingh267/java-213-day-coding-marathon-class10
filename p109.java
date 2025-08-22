import java.util.*;
class p109
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a String");
        String a = ob.nextLine();
        int i,l=a.length();char c,x=0;
        String s = "";
        for(i=0;i<l;i++)
        {
            c=a.charAt(i);
            if(Character.isUpperCase(c))
            {
            x = Character.toLowerCase(c);
            s=s+x;
            }
            else if(Character.isLowerCase(c))
            {
            x = Character.toUpperCase(c);
            s=s+x;
            }
            else
            {
                s=s+c;
            }
            c=0;
        }
        System.out.println(s);
    }
}