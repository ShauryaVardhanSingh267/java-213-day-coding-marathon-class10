import java.util.*;
class p48
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int arr[]=new int[10];
        int i;
        for(i=0;i<=9;i++)
        {
            System.out.println("Enter the number "+(i+1));
            arr[i]=ob.nextInt();
        }
        for(i=0;i<=9;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("These are the elements of Array 1");
        int a[]=new int[10];
        for(i=0;i<=9;i++)
        {
            a[i]=(arr[i]+10);
        }
        for(i=0;i<=9;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("These are the elements of Array 2");
    }
}