import java.util.*;
class p34
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the limit of the series(odd digit)");
        int n = ob.nextInt();
        System.out.println("Enter the value of x for the series ");
        int x = ob.nextInt();
        double s=0.0,f=1,i,j;
        for(i=1;i<=n;i+=2)
        {
        f=1;
        for(j=1;j<=i;j++)
        f=f*j;
        s=s+(Math.pow(x,i)/f);
        }
        System.out.println(s);
    }
}