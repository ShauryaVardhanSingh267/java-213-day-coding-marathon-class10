import java.util.*;
class p82
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of elements to be enterd in the first array");
        int n = ob.nextInt();
        System.out.println("Enter the number of elements to be enterd in the second array");
        int m = ob.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        int c[]=new int[n+m];
        int i;
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the value "+(i+1)+" in the First array");
            a[i]=ob.nextInt();
        }
        for(i=0;i<m;i++)
        {
            System.out.println("Enter the value "+(i+1)+" in the Second array");
            b[i]=ob.nextInt();
        }
        for(i=0;i<n;i++)
        c[i]=a[i];
        for(i=0;i<m;i++)
        c[i+n]=b[i];
        for(i=0;i<n+m;i++)
        System.out.println(c[i]);
    }
}