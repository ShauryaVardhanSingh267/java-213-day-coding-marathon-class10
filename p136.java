import java.util.*;
class p136
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter 1 to print the sum of the series and enter 2 to print the Floyd's triangle");
        int choice = ob.nextInt();
        switch(choice)
        {
            case 1:
                double Z = 0.0;int x;final double y = 5.5;
                for(x=-10;x<=10;x+=2)
                {
                    Z=Z + (3*x + 0.5*x)/y;
                }
                System.out.println("The value of Z = "+Z);
                break;
                case 2:
                    System.out.println("Enter the number of rows ");
                    int N = ob.nextInt();
                    int r,c,p=0;
                    for(r=1;r<=N;r++)
                    {
                        for(c=1;c<=r;c++)
                        {
                            p++;
                            System.out.print(p);
                        }
                        System.out.println();
                    }
                    break;
                    default:
                        System.out.println("Invalid Input");
        }
    }
}