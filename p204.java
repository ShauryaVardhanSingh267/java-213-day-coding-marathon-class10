import java.util.*;
class p204
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter 1 OR 2");
        int choice = ob.nextInt();
        switch(choice)
        {
            case 1:
                int r,c,d=65;
                for(r=1;r<=5;r++)
                {
                    for(c=1;c<=r;c++)
                    {
                        System.out.print((char)d);
                        d++;
                    }
                    System.out.println();
                }
                break;
                case 2:
                    System.out.println("Enter the value of n ");
                    int n = ob.nextInt();
                    int i,j;
                    double sum = 0.0,q=0.0,p=1.0;
                    for(i=1;i<=n;i+=2)
                    {
                        p=1;
                        for(j=1;j<=i;j++)
                        {
                            p=p*j;
                        }
                        q = i/p;
                        sum = sum + q;
                    }
                    System.out.println("The sum of the series : "+sum);
                    break;
                    default:
                        System.out.println("Invalid Input");
        }
    }
}