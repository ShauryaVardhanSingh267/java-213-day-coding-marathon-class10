import java.util.*;
class p20
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the value of n for the series ");
        int n = ob.nextInt(),j;
        double f = 1.0,i ;
        double s = 0.0;
        for(i=1;i<=n;i++)
        {   
            for(j=1;j<=i;j++)
            {
                f=f*j;
            }
            s = s+(i/f);
            f=1.0;
        }
        System.out.println(s);
    }
}