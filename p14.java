import java.util.*;
class p14
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner (System.in);
        System.out.println("Enter the limit of the series");
        int n= ob.nextInt(),i;
        double s=0;
        for(i=1;i<=n;i++)
        {
        if(i%2==0)
        s=s+(4/i);
        else
        s=s-(4/i);
        }
    }
}