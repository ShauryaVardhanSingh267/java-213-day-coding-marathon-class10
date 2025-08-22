import java.util.*;
class p185
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter 1 or 2");
        int choice = ob.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter the number of terms");
                int n = ob.nextInt();
                int i;
                double sum = 0.0;
                for(i=1;i<=n;i++)
                {
                    sum = sum + (1.0/4*i);
                }
                System.out.println("Sum = "+sum);
                break;
                case 2:
                    System.out.println("Enter the number of terms ");
                    int c = ob.nextInt();
                    int a,b,p=1;
                    double S = 0.0;
                    for(a=1;a<=c;a++)
                    {
                        p=1;
                        for(b=1;b<=a;b++)
                        p=p*b;
                        if(a%2==0)
                        S=S-(a/p);
                        else
                        S=S+(a/p);
                    }
                    System.out.println("Sum = "+S);
                    default:
                         System.out.println("Invalid Input");
        }
    }
}