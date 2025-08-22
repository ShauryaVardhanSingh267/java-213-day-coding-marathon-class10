import java.util.*;
class p70
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        p70 obj = new p70();
        System.out.println("Enter the value of x");
        int x = ob.nextInt();
        System.out.println("Enter the value of n");
        int n = ob.nextInt();
        int pow = obj.power(x,n);
        System.out.println("The answer = "+pow);
    }
    int power(int x,int n)
    {
        int pow = (int)Math.pow(x,n);
        return pow;
    }
}