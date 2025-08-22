import java.util.*;
class p184
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a String");
        String p = ob.nextLine();
        String n = p.trim();
        String a = " "+n.toUpperCase();
        int l = a.length(),i;
        char ch=0;
        String fin = "";
        for(i=0;i<l-1;i++)
        {
            ch = a.charAt(i);
            if(Character.isWhitespace(ch))
            {
                fin = fin + a.charAt(i+1)+".";
            }
        }
        System.out.println("Output : "+fin);
    }
}