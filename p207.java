import java.util.*;
class p207
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = ob.nextInt();
        int max=0,d;
        while(a>0)
        {
            d=a%10;
            a=a/10;
            if(d>max)
            max=d;
        }
        System.out.println("The largest digit : "+max);
    }
}