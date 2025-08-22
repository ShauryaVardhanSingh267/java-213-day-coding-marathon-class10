import java.util.*;
class p199
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a[] = {31,36,45,50,60,75,86,90};
        System.out.println("Enter the value to be searched in the array");
        int n = ob.nextInt();
        int start = 0,last = 7,mid = 0,count = 0;
        while(start<=last)
        {
            mid = (start+last)/2;
            if(a[mid]==n)
            {
                count++;
                break;
            }
            if(n<a[mid])
            last = mid-1;
            else if(n>a[mid])
            start = mid+1;
        }
        if(count == 1)
        System.out.println("Search Successful !!!!! Number found at Index "+mid);
        else
        System.out.println("Search Unsuccessful !!!!!");
    }
}