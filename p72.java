import java.util.*;
class p72
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        p72 obj = new p72();
        System.out.println("Enter the value of n");
        int n = ob.nextInt();
        int i;
        long A[]=obj.fibonacci(n);
        for(i=0;i<n;i++)
        System.out.println(A[i]);
    }
    long[] fibonacci(int n)
    {
        int i,a=0,b=1,c;
        long A[]=new long[n];
        for(i=0;i<n;i++)
        {
            A[i]=a;
            c=a+b;
            a=b;
            b=c;
        }
        return A;
    }
}