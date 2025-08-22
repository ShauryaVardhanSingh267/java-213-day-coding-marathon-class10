import java.util.*;
class p110
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a String");
        String a = ob.nextLine();
        int i,l=a.length(),b=0,c=0,d=0,e=0;
        char ch;
        for(i=0;i<l;i++)
        {
            ch = a.charAt(i);
            if(Character.isLowerCase(ch))
            b++;
            else if(Character.isUpperCase(ch))
            c++;
            else if(Character.isDigit(ch))
            d++;
            else 
            e++;
            ch=0;
        }
        System.out.println("Number of Lower Case Characters : "+b);
        System.out.println("Number of Upper Case Characters : "+c);
        System.out.println("Number of Digits : "+d);
        System.out.println("Number of Special Characters : "+e);
    }
}