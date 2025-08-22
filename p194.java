import java.util.*;
class p194
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a[] = new int[15];
        int i,j,t = 0;
        for(i=0;i<15;i++)
        {
            System.out.println("Enter value "+(i+1));
            a[i] = ob.nextInt();
        }
        for(j=0;j<14;j++)
        {
            for(i=0;i<14-j;i++)
            {
                if(a[i]>a[i+1])
                {
                    t = a[i];
                    a[i] = a[i+1];
                    a[i+1] = t;
                }
            }
        }
        for(i=0;i<15;i++)
        {
            System.out.println(a[i]);
        }
    }
}