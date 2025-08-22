import java.util.*;
class Lucky
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number to check wether it is a lucky number or not");
        int a = ob.nextInt();
        int d,s=0,count=0,i;
        for(i=1;i<=10;i++)
        {
            while(a>0)
            {
                d=a%10;
                a=a/10;
                s=s+d;
            }
            if(s==1)
            {
                count++;
                break;
            }
            else
            {
                a=s;
                s=0;
            }
        }
        if(count==1)
        System.out.println("The number is a Lucky Number");
        else
        System.out.println("The number is not a Lucky number");
    }
}