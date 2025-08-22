import java.util.*;
class p165
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = ob.nextLine();
        String a = s.toLowerCase();
        int l = a.length(),i;
        char ch = 0,ah = 0;
        String fin = "";
        for(i=0;i<l;i++)
        {
            ch = a.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
            ch = (char)((int)ch + 1);     
            }
            fin = fin+ch;
        }
        System.out.println(fin);
    }
}