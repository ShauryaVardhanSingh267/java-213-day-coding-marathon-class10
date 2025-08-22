import java.util.*;
class p18
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a Special Number");
        int a = ob.nextInt(),d,i,n=a;
        long f = 1,s=0;
        while(a>0)
        {
            d=a%10;
            a=a/10;
            f=1;
            for(i=1;i<=d;i++)
            {
               f=f*i; 
            }
            s=s+f;
        }
        if(s==n)
        System.out.println(n+" is a Special number");
        else
        System.out.println(n+" is not a Special number");
    }
}