import java.util.*;
class p58 
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number to check if it is even or odd");
        int a = ob.nextInt();
        int c = eve(a);
        if(c==1)
        System.out.println("Even number");
        else
        System.out.println("Odd number");
    }
    public static int eve(int a)
    {
        int c=0;
        if(a%2==0)
        c=1;
        return c;
    }
}