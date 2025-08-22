import java.util.*;
class p27
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner (System.in);
        System.out.println("Enter a number to check if it is a Neon number");
        int n = ob.nextInt();
        int a = n*n,d,s=0,z=n;
        while(a>0)
        {
            d=a%10;
            a=a/10;
            s=s+d;
        }
        if(s==z)
        System.out.println(z+" is a Neon Number");
        else
        System.out.println(z+" is not a Neon Number");
    }
}