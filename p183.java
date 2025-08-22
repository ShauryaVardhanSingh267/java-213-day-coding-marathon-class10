import java.util.*;
class p183
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a[] = new int[10];
        int i,max=0,min=100000;
        for(i=0;i<10;i++)
        {
            System.out.println("Enter number "+(i+1));
            a[i]=ob.nextInt();
        }
        for(i=0;i<10;i++)
        {
            if(a[i]>max)
            max=a[i];
            if(a[i]<min)
            min=a[i];
        }
        System.out.println("Largest Number -> "+max);
        System.out.println("Smallest Number -> "+min);
    }
}