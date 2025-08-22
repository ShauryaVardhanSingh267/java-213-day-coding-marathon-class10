import java.util.*;
class p21
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int s=0,p=1,a;
        do
        {
            System.out.println("Enter positive or negative numbers (0 to exit)");
            a = ob.nextInt();
            if(a>0)
            s=s+a;
            else if(a<0)
            p=p*(a);
        }
        while(a!=0);
        System.out.println("The sum of the positive numbers is "+s);
        System.out.println("The product of the negative numbers is "+p);
        }
}