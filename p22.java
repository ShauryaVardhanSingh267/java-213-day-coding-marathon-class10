import java.util.*;
class p22
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a Perfect number");
        int a = ob.nextInt(),i=1,s=0,n=a;
        do
        {
            if(a%i==0)
            s=s+i;
            i++;
        }
        while(i<a);
        if(s==n)
        System.out.println(n+" is a Perfect Number");
        else
        System.out.println(n+" is not a Perfect Number");
    }
}