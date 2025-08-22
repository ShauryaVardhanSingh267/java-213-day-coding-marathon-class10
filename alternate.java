import java.util.*;
class alternate
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the size of array 1");
        int n = ob.nextInt();
        System.out.println("Enter the size of array 2");
        int m = ob.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        int c[]=new int[m+n];
        int i,l=Math.max(m,n),k=Math.min(m,n),d=0;
        for(i=0;i<n;i++)
        {
            System.out.println("Enter value "+(i+1));
            a[i]=ob.nextInt();
        }
        for(i=0;i<m;i++)
        {
            System.out.println("Enter value "+(i+1));
            b[i]=ob.nextInt();
        }
        for(i=0;i<k;i++,d++)
        {
            c[d]=a[i];
            c[++d]=b[i];
        }
        for(i=0;i<l-k;i++)
        {   
            if(n>m)
            c[i+(2*k)]=a[i+k];
            else
            c[i+(2*k)]=b[i+k];
        }
        for(i=0;i<m+n;i++)
        {
            System.out.println(c[i]);
        }
    }
}