import java.util.*;
class p127
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a[]=new int[10];
        int i,j,t=0;
        for(i=0;i<10;i++)
        {
            System.out.println("Enter value "+(i+1));
            a[i]=ob.nextInt();
        }
        for(i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
        for(j=0;j<9;j++)
        {
            for(i=0;i<9-j;i++)
            {
                if(a[i]<a[i+1])
                {
                    t=a[i];
                    a[i]=a[i+1];
                    a[i+1]=t;
                }
            }
        }
        for(i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
    }
}