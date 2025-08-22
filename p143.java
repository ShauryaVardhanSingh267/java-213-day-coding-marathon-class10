import java.util.*;
class p143
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = ob.nextLine();
        String a = " "+str.trim()+" ";
        int i,l=a.length(),n=0;
        int b[] = new int[l];
        char ch = 0;
        String fin = "";
        for(i=0;i<l;i++)
        {
            ch = a.charAt(i);
            if(Character.isWhitespace(ch))
            {
               b[n]=i; 
               n++;
            }
        }
        int len = b.length;
        int d = 0,e = 0,max = 0;
        for(i=0;i<len-1;i++)
        {
            d = (b[i+1]-b[i])-1;
            if(d>max)
            max=d;
        }
        for(i=0;i<len-1;i++)
        {
            e = (b[i+1]-b[i])-1;
            if(e==max)
            {
               fin = a.substring((b[i]+1),b[i+1]);
               break;
            }
        }
        System.out.println("The longest word in the string is : "+fin);
    }
}