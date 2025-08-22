import java.util.*;
class p146
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String n = ob.nextLine();
        String a = " "+n.toUpperCase();
        int i,l=a.length(),count=0;
        char ch=0;
        for(i=0;i<l;i++)
        {
            ch = a.charAt(i);
            if(Character.isWhitespace(ch))
            {
                if(a.charAt(i+1)=='A')
                count++;
            }
        }
        System.out.println("The number of words starting with letter A are : "+count);
    }
}