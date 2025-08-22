import java.util.*;
class p208
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number to check wether it is a Dudeney number or not ");
        int n = ob.nextInt();
        int a=n;
        double c = Math.cbrt(n);
        int d,s=0;
        while(a>0)
        {
            d=a%10;
            a=a/10;
            s=s+d;
        }
        if(s==c)
        System.out.println("Dudeney number");
        else 
        System.out.println("Not a Dudeney Number");
    }
}