import java.util.*;
class p44
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the total number of values to be entered");
        int n = ob.nextInt();
        int a[]=new int[n];
        int i,b=0,c=0;
        for(i=0;i<n;i++)
        {
            System.out.println("Enter number "+(i+1));
            a[i]=ob.nextInt();
            if(a[i]>0)
            b++;
            else if(a[i]<0)
            c++;
        }
        System.out.println("The total number of positive values are "+b);
        System.out.println("The total number of negatie values are "+c);
        
    }
}