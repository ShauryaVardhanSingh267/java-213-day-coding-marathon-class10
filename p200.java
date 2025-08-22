import java.util.*;
class p200
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a String");
        String n = ob.nextLine();
        String b = n.toUpperCase();
        String a = " "+b+" ";
        int l = a.length(),i,d=0,len,j;
        int white[] = new int[l];
        char ch =0,bh =0;
        String word = "",lword = "";
        for(i=0;i<l;i++)
        {
            bh = a.charAt(i);
            if(Character.isWhitespace(bh))
            {
            white[d]=i;
            d++;
            }
        }
        len = white.length;
        for(i=0;i<len-1;i++)
        {
            word = a.substring(white[i],white[i+1]);
            System.out.println(word);
        }
    }
}
