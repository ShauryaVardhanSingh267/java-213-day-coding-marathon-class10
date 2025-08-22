import java.util.*;
class p116
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
        int i;
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
        for(i=0;i<n;i++)
        {
            c[i]=a[i];
        }
        for(i=0;i<m;i++)
        {
            c[i+n]=b[i];
        }
        for(i=0;i<n+m;i++)
        {
            System.out.println(c[i]);
        }
    }
}