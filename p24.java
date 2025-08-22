import java.util.*;
class p24
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a Number to check if it is a Spy Number");
        int a = ob.nextInt();
        int d,s=0,p=1,n=a;
        while(a>0)
        {
            d=a%10;
            a=a/10;
            s=s+d;
            p=p*d;
        }
        if(s==p)
        System.out.println(n+" is a Spy number");
        else
        System.out.println(n+" is not a Spy number");
    }
}