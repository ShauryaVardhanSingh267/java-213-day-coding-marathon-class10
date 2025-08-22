import java.util.*;
class p50
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a disarium number");
        int a = ob.nextInt(),n=a,j=a;
        int d=0,c=0,i,e;
        double s=0;
        while(a>0)
        {
            d=a%10;
            a=a/10;
            c++;
        }
        while(n>0)
        {
            e=n%10;
            n=n/10;
            s=s+Math.pow(e,c);
            c--;
        }
        if(j==s)
        System.out.println("Disarium Number");
        else
        System.out.println("Not a Disarium Number");
    }
}