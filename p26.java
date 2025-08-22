import java.util.*;
class p26
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner (System.in);
        System.out.println("Enter a number to check if it is a Palindrome Number");
        int a = ob.nextInt(),d,r=0,n=a;
        while(a>0)
        {
            d=a%10;
            a=a/10;
            r=r*10+d;
        }
        if(r==n)
        System.out.println(n+" is a Palindrome Number");
        else
        System.out.println(n+" is not a Palindrome Number");
    }
}