import java.util.*;
class binary
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a[]=new int[10];
        int i,start=0,mid=0,last=9;
        for(i=0;i<10;i++)
        {
            System.out.println("Enter number "+(i+1));
            a[i]=ob.nextInt();
        }
        System.out.println("Enter the number to be searched ");
        int n = ob.nextInt(),flag=0;
        while(start<=last)
        {
            mid = (start+last);
            if(a[mid]==n)
            {
                flag=1;
                break;
            }
            if(n>a[mid])
            start=mid+1;
            if(n<a[mid])
            last=mid-1;
        }
        if(flag==1)
        System.out.println("Number found at index "+mid);
        else
        System.out.println("Number not found");
    }
}