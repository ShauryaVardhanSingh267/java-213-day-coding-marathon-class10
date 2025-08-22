import java.util.*;
class p145
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String n = ob.nextLine();
        String a = n.toUpperCase()+" ";
        int i,l = a.length();
        char ch;
        String fin = "";
        for(i=0;i<l;i++)
        {
            ch = a.charAt(i);
            if(ch!=' ')
            {
                fin=fin+ch;
            }
            else
            {
            System.out.println(fin);
            fin="";
            }
        }
    }
}