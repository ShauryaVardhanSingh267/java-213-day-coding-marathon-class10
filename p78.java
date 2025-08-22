import java.util.*;
class p78
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of enteries");
        int n = ob.nextInt();
        int a[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            System.out.println("Enter number "+(i+1)+" in ASCENDING ORDER");
            a[i]=ob.nextInt();
        }
        System.out.println("Enter the value to be searched ");
        int x = ob.nextInt();
        int start = 0,last = n-1,mid=0,flag=0;
        while(start<=last)
        {
            mid = (start + last)/2;
            if(a[mid]==x)
            {
                flag ++;
                break;
            }
            if(x<a[mid])
            last=mid-1;
            else
            start=mid+1;
        }
        if(flag==1)
        System.out.println("The number is at index "+ mid );
        else
        System.out.println("Number not found");
    }
}