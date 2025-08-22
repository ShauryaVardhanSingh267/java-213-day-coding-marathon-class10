import java.util.*;
class p124
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a word to convert to pig latin form");
        String a = ob.nextLine(),vow = "AEIOUaeiou",s="";
        int i,j,l=a.length(),len = vow.length(),count=0;
        char ch;
        for(i=0;i<l;i++)
        {
            ch = a.charAt(i);
            for(j=0;j<len;j++)
            {
                if(ch==vow.charAt(j))
                {
                s=s+a.substring(i)+a.substring(0,i)+"ay";
                count++;
                break;
                }
            }
            if(count==1)
            {
            System.out.println(s);
            break;
            }
        }
    }
}