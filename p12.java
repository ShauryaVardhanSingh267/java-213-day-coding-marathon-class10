import java.util.*;
class p12
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number ");
        int a = ob.nextInt(),d,r=0;
        while(a>0)
        {
            d=a%10;
            a=a/10;
            r=r*10+d;
        }
        System.out.println("The Reverse is => "+r);
    }
}