import java.util.*;
class p206
{
    public static void main(String args[])
    { 
        Scanner ob = new Scanner(System.in);
        int a=0,b=0,c=0;
        int n;
        do
        {
            System.out.println("Enter a number ");
            n = ob.nextInt();
            if(n<0)
            c=c+n;
            else if(n>0)
            {
                if(n%2==0)
                a=a+n;
                else 
                b=b+n;
            }
        }
        while(n!=0);
        System.out.println("Sum of negative numbers : "+c);
        System.out.println("Sum of positive even numbers : "+a);
        System.out.println("Sum of positive odd numbers : "+b);
    }
}