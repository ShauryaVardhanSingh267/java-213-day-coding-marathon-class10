import java.util.*;
class p180
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a[] = new int[20];
        int i,max=0,min=20000,sum = 0;
        for(i=0;i<20;i++)
        {
            System.out.println("Enter number "+(i+1));
            a[i]=ob.nextInt();
        }
        for(i=0;i<20;i++)
        {
            if(a[i]>max)
            max=a[i];
            if(a[i]<min)
            min=a[i];
            sum = sum + a[i];
        }
        System.out.println("The Largest Number -> "+max);
        System.out.println("The Smallest Number -> "+min);
        System.out.println("The sum of all digits -> "+sum);
    }
}