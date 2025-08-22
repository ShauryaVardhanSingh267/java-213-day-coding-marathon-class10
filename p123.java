import java.util.*;
class p123
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter Your full name");
        String n = ob.nextLine(),s="",a = n.trim(),p="";
        int i,l=a.length();
        char ch = 0, t = 0;
        s = s+ Character.toUpperCase(a.charAt(0));
        for(i=1;i<l;i++)
        {
            ch = a.charAt(i);
            if(Character.isWhitespace(ch))
            {
                t = Character.toUpperCase(a.charAt(i+1));
                s=s+" "+t;
            }
        }
        p=a.substring(a.lastIndexOf(' ')+2);
        s=s+p;
        System.out.println("Your abriveated name will be : "+s);
    }
}