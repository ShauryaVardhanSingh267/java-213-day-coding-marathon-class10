import java.util.*;
class p1
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int max = 0;
        System.out.println("Enter number 1 ");
        int a = ob.nextInt();
        System.out.println("Enter number 2 ");
        int b = ob.nextInt(); 
        System.out.println("Enter number 3 ");
        int c = ob.nextInt();
        if(a>b&&a>c)
        max = a;
        if(b>a&&b>c)
        max = b;
        if(c>a&&c>b)
        max = c;
        System.out.println("The largest number of the three is "+max);
    }
}