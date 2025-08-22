import java.util.*;
class p210
{
    void series(int a,int n)
    {
        int i,j;
        double S = 0.0,p=1.0;
        for(i=1;i<=n;i++)
        {
            p=1.0;
            for(j=1;j<=i;j++)
            {
                p=p*j;
            }
            if(i%2==0)
            S=S-(a/p);
            else
            S=S+(a/p);
        }
        System.out.println("Series1 Sum = "+S);
    }
    void series(int n)
    {
        int i;
        double S = 0.0;
        
        for(i=1;i<=n;i++)
        {
            double q=(double)i/(i+1.0);
            if(i%2.0==0)
            S = S - q;
            else 
            S = S + q;
            q=0.0;
        }
        System.out.println("Series2 Sum = "+S);
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        p210 obj = new p210();
        System.out.println("Enter the value of a");
        int a = ob.nextInt();
        System.out.println("Enter value of n ");
        int n = ob.nextInt();
        obj.series(a,n);
        obj.series(n);
    }
}