import java.util.*;
class p121
{
    public static void main(String args[])
    {
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter a String");
    String n = ob.nextLine()+" ",a=n.trim(),w="",fin="";
    int i,l=a.length();
    int e=0,d=0;
    char ch = 0;
    for(i=0;i<l;i++)
    {
        if(Character.isWhitespace(a.charAt(i)))
        {
           d++;
        }
    }
    int white[]=new int[d];
    for(i=0;i<l;i++)
    {
        if(Character.isWhitespace(a.charAt(i)))
        {
           white[e]=i;
           e++;
        }
    }
    for(i=0;i<d-1;i++)
    {
        w=a.substring(white[i],white[i+1]);
        String x=w.trim();int len = x.length();String rev="";
        for(int j=len-1;j>=0;j--)
        {
            ch=x.charAt(j);
            rev=rev+ch;
        }
        if(rev.equals(x))
        fin = fin +x+" ";
    }
    System.out.println("The palindrome words are "+fin);
    }
}