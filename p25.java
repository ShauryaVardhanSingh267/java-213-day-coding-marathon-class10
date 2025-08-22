import java.util.*;
class p25
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a Niven(Harshad)Number");
        int a = ob.nextInt(),d,s=0,n=a;
        while(a>0)
        {
            d=a%10;
            a=a/10;
            s=s+d;
        }
        if((n%s)==0)
        System.out.println(n+" is a Niven(Harshad) number");
        else
        System.out.println(n+" is not a Niven(Harshad) number");
    }
}