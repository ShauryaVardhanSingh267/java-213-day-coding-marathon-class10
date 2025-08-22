import java.util.*;
class p141
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a String");
        String a = ob.nextLine();
        int i,l=a.length();
        char ch=0, ah=0;
        String fin = "";
        for(i=0;i<l;i++)
        {
            ch = a.charAt(i);
            if(Character.isUpperCase(ch))
            {
            ah=Character.toLowerCase(ch);
            fin = fin + ah;
            }
            else if(Character.isLowerCase(ch))
            {
             ah=Character.toUpperCase(ch);
             fin = fin + ah;   
            }
            else 
            fin = fin + ch;
        }
        System.out.println(fin);
    }
}