import java.util.*;
class p55
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = ob.nextInt();
        System.out.println("Enter number 2");
        int b = ob.nextInt();
        int pro = product(a,b);
        System.out.println("The Product of the two numbers : "+pro);
    }
    public static int product(int a,int b)
    {
        int pro = a*b;
        return pro;
    }
}