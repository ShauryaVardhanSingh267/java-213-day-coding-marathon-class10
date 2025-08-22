import java.util.*;
class p52
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number to check wether it is a special number");
        int a = ob.nextInt(),n=a,d,i,p,s=0;
        while(a>0)
        {
            d=a%10;
            a=a/10;
            p=1;
            for(i=1;i<=d;i++)
            {
                p=p*i;
            }
            s=s+p;
        }
        if(s==n)
        System.out.println("Special number");
        else
        System.out.println("Not a Special number");
    }
}