import java.util.*;
class p23
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an Armstrong number");
        int a = ob.nextInt(),d,c=0,n=a,p,s=0,g=a;
        while(a>0)
        {
            d=a%10;
            a=a/10;
            c++;
        }
        while(n>0)
        {
            p=n%10;
            n=n/10;
            s=s+(int)Math.pow(p,c);
        }
        if(s==g)
        System.out.println(g+" is an Armstrong number");
        else
        System.out.println(g+" is not an Armstrong number");
    }
}