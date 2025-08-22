import java.util.*;
class p197
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int i,j,d,a,e=0,f=0;
        double p = 0.0, q = 0.0;
        for(j=1000;j<=9999;j++)
        { 
            a=j;d=0;e=0;f=0;p=0.0;q=0.0;
            for(i=4;i>=1;i--)
            {
                d=a%10;
                a=a/10;
                if(i>=3)
                {
                   p=p+(Math.pow(10,e))*d;
                   e++;
                }
                if(i>=1 && i<=2)
                {
                   q=q+(Math.pow(10,f))*d;
                   f++;
                }
            }
            if(Math.pow((p+q),2)==j)
            System.out.println(j);
        }
    }
}