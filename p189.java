import java.util.*;
class p189
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x = ob.nextInt();
        System.out.println("Enter the value of n");
        int n = ob.nextInt();
        System.out.println("Enter the value of m");
        int m = ob.nextInt();
        int i,j,p=1,d=10;
        double S = 0.0;
        for(i=0;i<=n&&d<=m;i+=2,d+=5)
        {
            p=1;
            for(j=1;j<=(x+i);j++)
            p=p*j;
            S=S+(p/d);
        }
        System.out.println("Sum = "+S);
    }
}