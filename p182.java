import java.util.*;
class p182
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int i,j,count=0,s=0;
        for(i=2;i<=100;i++)
        {
            count = 0;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                count++;
            }
            if(count==0)
            s=s+i;
        }
        System.out.println("The sum of first 100 prime numbers = "+s);
    }
}