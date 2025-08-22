import java.util.*;
class p63
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        p63 tp = new p63();
        System.out.println("Enter number 1");
        int a = ob.nextInt();
        System.out.println("Enter number 2");
        int b = ob.nextInt();
        if(Math.abs(a-b)==2 && tp.twinprime(a)==0 && tp.twinprime(b)==0)
        System.out.println("The two numbers are Twinprime numbers");
        else
        System.out.println("The two numbers are not Twinprime numbers");
    }
    int twinprime(int a)
    {
        int i,c=0;
        for(i=2;i<a;i++)
        {
        if(a%i==0)
        c++;
        }
        return c;
    }
}