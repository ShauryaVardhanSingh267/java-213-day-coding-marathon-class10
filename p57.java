import java.util.*;
class p57
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a prime number");
        int a = ob.nextInt();
        int c = prime(a);
        if(c==2)
        System.out.println("Prime number");
        else
        System.out.println("Not a Prime Number");
    }
    public static int prime(int a)
    {
        int i,c=0;
        for(i=1;i<=a;i++)
        {
            if(a%i==0)
            c++;
        }
        return c;
    }
}