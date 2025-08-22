import java.util.*;
class p144
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String a = ob.nextLine();
        int i,l=a.length(),n=0,count = 0,cou = 0;
        char ch=0,bh=0;
        String w="";
        for(i=0;i<l;i++)
        {
            bh = a.charAt(i);
            if(Character.isWhitespace(bh))
            cou++;
        }
        String b[] = new String[l-cou];
        for(i=0;i<l;i++)
        {
            ch = a.charAt(i);
            if(Character.isWhitespace(ch))
            {
                b[n]=w;
                n++;
                w="";
            }
            else
            w=w+ch;
        }
        System.out.println("Enter the word to be searched");
        String wd = ob.nextLine();
        for(i=0;i<l-cou;i++)
        {
            if(b[i].equalsIgnoreCase(wd))
            count++;
        }
        System.out.println("The word "+wd+" occurs in the string "+count+" times");
    }
}