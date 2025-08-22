import java.util.*;
class p66
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        p66 obj = new p66();
        System.out.println("Enter a number ");
        int n = ob.nextInt();
        int s = obj.sum(n);
        System.out.println("The sum = "+s);
    }
    int sum(int n)
    {
        int i,s=0;
        for(i=1;i<=n;i++)
        {
            if(i%2!=0)
            s=s+i;
        }
        return s;
    }
}