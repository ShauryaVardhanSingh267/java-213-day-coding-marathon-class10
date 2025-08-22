import java.util.*;
class p150
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to input");
        int n = ob.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int i,j,l=n-1,c=0,t=0;
        for(i=0;i<n;i++)
        {
            System.out.println("Enter any number ---->");
            a[i]=ob.nextInt();
        }
        for(j=0;j<(n-1);j++)
        {
            for(i=0;i<(n-1-j);i++)
            {
                if(a[i]>a[i+1])
                {
                    t=a[i];
                    a[i]=a[i+1];
                    a[i+1]=t;
                }
            }
        }
        for(i=0;i<n;i+=2,c++,l--)
        {
            b[c]=a[i];
            if(l>(n-1)/2)
            b[l]=a[i+1];
        }
        for(i=0;i<n;i++)
        {
            System.out.println(b[i]);
        }
    }
}