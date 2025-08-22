import java.util.*;
class p28
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the limit of the series");
        int n = ob.nextInt();
        System.out.println("Enter the value of x for the series");
        int x = ob.nextInt(),i;
        double s = 0.0;
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            {
            s=s-Math.pow(x,i);
            }
            else
            {
            s=s+Math.pow(x,i);
            }
        }
        System.out.println(s);
    }
}