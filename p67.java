import java.util.*;
class p67
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        p67 obj = new p67();
        System.out.println("Enter number 1");
        int a = ob.nextInt();
        System.out.println("Enter number 2");
        int b = ob.nextInt();
        int m = obj.max(a,b);
        System.out.println("The greater digit is "+m);
    }
    int max(int a,int b)
    {
        int m=Math.max(a,b);
        return m;
    }
}