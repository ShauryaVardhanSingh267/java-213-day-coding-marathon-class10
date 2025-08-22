import java.util.*;
class p169
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a String");
        String a = ob.nextLine();
        int l = a.length(),i;
        char ch=0;
        String vow = "",con = "",fin = "";
        for(i=0;i<l;i++)
        {
            ch = a.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            vow = vow + ch;
            else if(ch!=' ')
            con = con + ch;
        }
        fin = con + vow;
        System.out.println(fin);
    }
}