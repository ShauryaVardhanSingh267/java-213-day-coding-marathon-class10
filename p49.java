import java.util.*;
class p49
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = ob.nextInt();
        int d=0,p=1;
        while(a>0)
        {
            d=a%10;
            a=a/10;
            if(d%2==0)
            {
                p=p*(d+1);
            }
        }
        System.out.println("The product of the Successors is "+p);
    }
}