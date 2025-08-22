import java.util.*;
class p212
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = ob.nextInt();
        System.out.println("Enter a to check for Prime number\nEnter b to check for Automorphic number");
        char choice = ob.next().charAt(0);
        switch(choice)
        {
            case 'a':
                int num = n;
                int i,c=0;
                for(i=2;i<num;i++)
                {
                    if(num%i==0)
                    c++;
                }
                if(c>0)
                System.out.println("Not a Prime Number");
                else
                System.out.println("Prime Number");
                break;
                case 'b':
                    int a=n*n,d,e,z=0,na = n,count=0;
                    while(n>0)
                    {
                        d=n%10;
                        n=n/10;
                        z++;
                    }
                    n=na;
                    for(int j=1;j<=z;j++)
                    {
                        d=a%10;
                        a=a/10;
                        e=n%10;
                        n=n/10;
                        if(d!=e)
                        {
                           count++;
                           break;
                        }
                    }
                    if(count==1)
                    System.out.println("Not an Automorphic Number");
                    else
                    System.out.println("Automorphic Number");
                    break;
                    default:
                        System.out.println("Invalid Input");
        }
    }
}