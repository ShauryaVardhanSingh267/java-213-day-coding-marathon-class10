import java.util.*;
class p81
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of elements required in array 1");
        int n = ob.nextInt();
        System.out.println("Enter the number of elements required in array 2");
        int m = ob.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        int c[]=new int[n+m];
        int i;
        for(i=0;i<n;i++)
        {
            System.out.println("Enter value "+(i+1)+" in the First array");
            a[i]=ob.nextInt();
        }
        for(i=0;i<m;i++)
        {
            System.out.println("Enter value "+(i+1)+" in the Second array");
            b[i]=ob.nextInt();
        }
        for(i=0;i<n;i++)
        c[i]=a[i];
        for(i=0;i<m;i++)
        c[i+n]=b[i];
        for(i=0;i<m+n;i++)
        System.out.println(c[i]);
    }
}