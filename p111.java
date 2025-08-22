import java.util.*;
class p111
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a word to ckeck if it is a palindrome");
        String a = ob.nextLine();
        int i,l=a.length();
        String rev = "";
        char ch = 0;
        for(i=l-1;i>=0;i--)
        {
        ch = a.charAt(i);
        rev = rev+ch;
        }
        if(a.equalsIgnoreCase(rev))
        System.out.println("Palindrome Word");
        else 
        System.out.println("Not a Palindrome Word");
    }
}