import java.util.*;
class p119
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String n = ob.nextLine(),a=n.trim();
        char ch = 0;int i,l=a.length(),count=1;
        for(i=0;i<l;i++)
        {
            ch = a.charAt(i);
            if(Character.isWhitespace(ch))
            count++;
        }
        System.out.println("The number of words in this sentence are "+count);
    }
}