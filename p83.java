import java.util.*;
class p83
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of values to be present in the first array;");
        int n = ob.nextInt();
        System.out.println("Enter the number of values to be present in the second array;");
        int m = ob.nextInt();
        int x=Math.min(n,m);
        int y=Math.max(n,m);
        int a[]=new int[n];
        int b[]=new int[m];
        int c[]=new int[m+n];
        int i,k=0;
        for(i=0;i<n;i++)
        {
            System.out.println("Enter value "+(i+1)+" in the first array");
            a[i]=ob.nextInt();
        }
        for(i=0;i<m;i++)
        {
            System.out.println("Enter value "+(i+1)+" in the second array");
            b[i]=ob.nextInt();
        }
        for(i=0;i<(2*x);i+=2)
        {
            c[i]=a[k];
            c[i+1]=b[k];
            k++;
        }
        if(y==m)
        {
        for(i=0;i<(m-n);i++)
        c[(2*n)+i]=b[n+i];
        }
        if(y==n)
        {
        for(i=0;i<(n-m);i++)
        c[(2*m)+i]=a[m+i];
        }
        for(i=0;i<(m+n);i++)
        System.out.println(c[i]);
}
}