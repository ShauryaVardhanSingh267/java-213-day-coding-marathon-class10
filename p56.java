import java.util.*;
class p56
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = ob.nextInt();
        int p = factorial(a);
        System.out.println("The factorial of the digits : "+p);
    }
    public static int factorial(int a)
    {
        int i,p=1;
        for(i=1;i<=a;i++)
        p=p*i;
        return p;
    }
}