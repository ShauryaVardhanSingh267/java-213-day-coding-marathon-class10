import java.util.*;
class p128
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a[]=new int[20];
        int i,max=0,min=10000,range = 0;
        for(i=0;i<20;i++)
        {
            System.out.println("Enter value "+(i+1));
            a[i]=ob.nextInt();
        }
        for(i=0;i<20;i++)
        {
            if(a[i]>max)
            max = a[i];
            else if(a[i]<min)
            min = a[i];
        }
        range = max-min;
        System.out.println("The range of the array is "+range);
    }
}