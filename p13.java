import java.util.*;
class p13
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = ob.nextInt(),i=0,d,s=0;
        while(a>0)
        {
            d=a%10;
            a=a/10;
            if(d!=0)
            {
            s=s+d*(int)Math.pow(10,i);
            i++;
            }
        }
        System.out.println("The Number is "+s);
    }
}
