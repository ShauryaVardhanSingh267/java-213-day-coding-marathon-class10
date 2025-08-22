import java.util.*;
class p174
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a String");
        String n = ob.nextLine();
        String a = n.toUpperCase();
        int l = a.length(),i,ab=0,b=0,count=0;
        char ch = 0;
        String fin = "";
        for(i=0;i<(l-1);i++)
        {
            ab=0;
            b=0;
            ch = a.charAt(i);
            ab = (int)ch;
            b = ab+1;
            if((int)a.charAt(i+1)==b)
            {
                count++;
                fin = fin+ch+a.charAt(i+1)+" ";
            }
        }
        System.out.println("Number of consecutive pair of letters -> "+count);
        System.out.println("The Letters are -> "+fin);
    }
}