import java.util.*;
class p171
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        double a[] = new double[20];
        int i,start = 0,last = 19,mid = 0,count = 0;
        for(i=0;i<20;i++)
        {
            System.out.println("Enter number "+(i+1)+" in descending order");
            a[i] = ob.nextDouble();
        }
        System.out.println("Enter the value to be searched in the array");
        double n = ob.nextDouble();
        while(start<=last)
        {
            mid = (start + last)/2;
            if(n==a[mid])
            {
                count++;
                break;
            }
            else if(n<a[mid])
            start = mid+1;
            else
            last = mid-1;
        }
        if(count==1)
        System.out.println("Value found at index "+mid);
        else
        System.out.println("Value not found");
    }
}