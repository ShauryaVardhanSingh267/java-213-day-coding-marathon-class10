import java.util.*;
class p186
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a String");
        String na = ob.nextLine();
        String n = na.toLowerCase();
        int len=n.length(),i;
        char ch = 0;
        String a = "";
        for(i=0;i<len;i++)
        {
            ch = n.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            a=a+ch;
        }
        int l = a.length();
        char bh = 0;
        String rev = "";
        for(i=l-1;i>=0;i--)
        {
            bh = a.charAt(i);
            rev = rev+bh;
        }
        if(rev.equals(a))
        System.out.println("YES it is PALINDROME");
        else
        System.out.println("NO it is not PALINDROME");
    }
}