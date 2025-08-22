import java.util.*;
class p79
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a[]=new int[5];
        String name[]=new String[5];
        int i;
        for(i=0;i<5;i++)
        {
            System.out.println("Enter the marks of students in ascending order");
            a[i]=ob.nextInt();ob.nextLine();
            System.out.println("Enter the name of the student");
            name[i]=ob.nextLine();
        }
        int start=0,last=4,mid=0,count=0;
        while(start<=last)
        {
            mid = (start + last)/2;
            if(a[mid]==100)
            {
                System.out.println("100 is scored by "+name[mid]);
                count++;
            }
            if(100<a[mid])
            last = mid-1;
            else
            start = mid+1;
        }
        if(count==0)
        System.out.println("Sadly no one scored full marks BETTER LUCK NEXT TIME");
    }
}