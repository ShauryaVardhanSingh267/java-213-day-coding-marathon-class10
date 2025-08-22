import java.util.*;
class p178
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter 1 or 2");
        int choice = ob.nextInt();
        switch(choice)
        {
            case 1:
                double a,cs=0.0;
                final double b = 3.0;
                for(a=1.0;a<=20.0;a+=2.0)
                {
                    cs = (a*a)+(2*a*b);
                    System.out.println("Value of c = "+cs);
                }
                break;
                case 2:
                    int r,c;
                    for(r=9;r>=1;r-=2)
                    {
                        for(c=9;c>=r;c-=2)
                        {
                           System.out.print(c);
                        }
                        System.out.println();
                    }
                    break;
                    default:
                        System.out.println("Invalid Input");
        }
    }
}