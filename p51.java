import java.util.*;
class p51
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner (System.in);
        int s= 0,a;
        System.out.println("Enter a number to get the sum or 0 to exit ");
        do
        {
            a = ob.nextInt();
            s=s+a;
        }
        while(a!=0);
        System.out.println("The sum is "+s);
    }
}