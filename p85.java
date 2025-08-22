import java.util.*;
class p85
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = ob.nextInt();
        int a[]=new int[n];
        int i,j,t=0;
        for(i=0;i<n;i++)
        {
            System.out.println("Enter value "+(i+1)+" in the array");
            a[i]=ob.nextInt();
        }
        for(j=0;j<n-1;j++)
        {
            for(i=0;i<n-1-j;i++)
            {   t=0;
                if(a[i]>a[i+1])
                {
                   t=a[i];
                   a[i]=a[i+1];
                   a[i+1]=t;
                }
            }
        }
        for(i=0;i<n;i++)
        System.out.println(a[i]);
    }
}