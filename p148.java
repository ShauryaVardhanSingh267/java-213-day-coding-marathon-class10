import java.util.*;
class p148
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a[] = new int[5];
        int i,min = 10,max = 0,sum = 0;
        for(i=0;i<5;i++)
        {
            System.out.println("Enter a single digit number ");
            a[i]=ob.nextInt();
        }
        for(i=0;i<5;i++)
        {
            if(a[i]>max)
            max = a[i];
            if(a[i]<min)
            min = a[i];
            sum = sum + a[i];
        }
        System.out.println("Maximum value : "+max+" Minimum value : "+min+" Sum of values : "+sum);
    }
}