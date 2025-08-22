import java.util.*;
class arey
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        arey obj = new arey();
        int a[]=new int[20];
        int i;
        for(i=0;i<20;i++)
        {
            System.out.println("Enter value "+(i+1));
            a[i]=ob.nextInt();
        }
        int max= obj.max(a);
        int min= obj.min(a);
        int sum= obj.sum(a);
        System.out.println(max+"  "+min+"  "+sum);
    }
    int max(int a[])
    {   int i,max=0;
        for(i=0;i<20;i++)
        {
           if(a[i]>max)
           max=a[i];
        }
        return max;
    }
    int min(int a[])
    {   int i,min=1000000;
        for(i=0;i<20;i++)
        {
           if(a[i]<min)
           min=a[i];
        }
        return min;
    }
    int sum(int a[])
    {   int i,max=0,sum=0;
        for(i=0;i<20;i++)
        {
           sum = sum+a[i];
        }
        return sum;
    }
}