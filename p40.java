import java.util.*;
class p40
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a[]=new int[11];
        int max=0,i;
        for(i=0;i<=10;i++)
        {
            System.out.println("Enter your runs scored Player "+(i+1));
            a[i]=ob.nextInt();
            if(a[i]>max)
            max=a[i];
        }
        System.out.println("The maximum runs scored are "+max);
    }
}