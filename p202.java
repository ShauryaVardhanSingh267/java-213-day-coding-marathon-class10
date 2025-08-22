import java.util.*;
class p202
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter 1 or 2");
        int choice = ob.nextInt();
        switch(choice)
        {
            case 1:
                double a,c=0.0;
                final double b = 3.0;
                for(a=1.0;a<=20.0;a+=2.0)
                {   
                    c=0.0;
                    c = (a*a) + (2*a*b);
                    System.out.println(c);
                }
                break;
                case 2:
                    int i,j;
                    for(i=65;i<=69;i++)
                    {
                        for(j=65;j<=i;j++)
                        System.out.print((char)j);
                        System.out.println();
                    }
                    break;
                    default:
                        System.out.println("Invalid Input");
        }
    }
}