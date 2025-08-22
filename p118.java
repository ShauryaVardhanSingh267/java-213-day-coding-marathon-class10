import java.util.*;
class p118
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a String");
        String n = ob.nextLine(),w="",b="",a=n.trim();
        int i,j=a.lastIndexOf(" ");char ch=0,bh=0;
        if(Character.isLetter(a.charAt(0)))
        w=w+Character.toUpperCase(a.charAt(0));
        b=a.substring(j+1);
        for(i=0;i<j;i++)
        {
            ch = a.charAt(i);
            if(Character.isWhitespace(ch))
            {
                bh=Character.toUpperCase(a.charAt(i+1));
                w=w+" "+bh;
            }
            bh=0;
            ch=0;
        }
        w=w+" "+b;
        System.out.println(w);
    }
}