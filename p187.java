import java.util.*;
class p187
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number to check wether it is a duck number or not");
        int a = ob.nextInt();
        int d,count=0;
        while(a>0)
        {
            d=a%10;
            a=a/10;
            if(d==0)
            count++;
        }
        if(count>0)
        System.out.println("The number is a DUCK number with "+count+" zeroes");
        else
        System.out.println("The number is not a DUCK number");
    }
}