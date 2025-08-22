import java.util.*;
class p188
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a or b");
        char choice = ob.next().charAt(0);
        switch(choice)
        {
            case 'a':
                double S = 0.0;
                int x;
                for(x=-3;x<=3;x++)
                {
                    S=(3*(Math.pow(x,4))+5)/x*x;
                    System.out.println("Sum = "+S);
                }
                break;
                case 'b':
                    System.out.println("Enter the number of rows ");
                    int n = ob.nextInt();
                    int r,c;
                    for(r=1;r<=n;r++)
                    {
                        for(c=r;c>=1;c--)
                        {
                            if(c%2==0)
                            System.out.print("1");
                            else
                            System.out.print("0");
                        }
                        System.out.println();
                    }
                    break;
                    default :
                        System.out.println("Invalid Input");
        }
    }
}