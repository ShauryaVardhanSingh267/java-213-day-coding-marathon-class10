import java.util.*;
class p129
{
    public static void main(String args[])
    {
        Scanner ob =new Scanner(System.in);
        System.out.println("Enter a word ");
        String a =ob.nextLine(),rev="",vowel = "aeiouAEIOU";
        int i,j,l=a.length(),vow=0;
        char ch=0;
        for(i=l-1;i>=0;i--)
        {
            ch = a.charAt(i);
            rev = rev+ch;
            for(j=0;j<10;j++)
            {
                if(ch==vowel.charAt(j))
                vow++;
            }
        }
        System.out.println("The raversed word is : "+rev);
        System.out.println("The number of vowels are : "+vow);
    }
}