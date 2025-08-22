import java.util.*;
class p54
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = ob.nextInt();
        System.out.println("Enter number 2");
        int b = ob.nextInt();
        int sum = calc(a,b);
        System.out.println("The sum of the two values :"+sum);
    }
    public static int calc(int a,int b)
    {
        int sum = a+b;
        return sum;
    }
}