import java.util.*;
class p16
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the limit ");
        int n = ob.nextInt();
        int i,p=0;
        for(i=1;i<=n;i++)
        {
            p=(int)Math.pow(2,i);
            System.out.println("2 ^ "+i+" = "+p);
        }
    }
}