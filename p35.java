import java.util.*;
class p35
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner (System.in);
        int a[]=new int[10];
        int i,s=0;
        double avg;
        for(i=0;i<10;i++)
        {
            System.out.println("Enter number "+(i+1));
            a[i]=ob.nextInt();
            s+=a[i];
        }
        avg=(s/10.0);
        System.out.println("Sum = "+s);
        System.out.println("Average = "+avg);
    }
}