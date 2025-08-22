import java.util.*;
class p153
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter 1 for getting the value of X and enter 2 for getting the series ");
        int choice = ob.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter the value of u");
                double u = ob.nextDouble();
                double X = 0.0,t=0.0;
                for(t=2;t<=10;t+=0.5)
                X = u*t + (1/2)*9.8*t*t;
                System.out.println(X);
                break;
                case 2:
                    int a = 1,b=2,s=0;
                    for(int i=0;i<10;i++)
                    {
                        System.out.println(a);
                        s = 2*b + a;
                        a=b;
                        b=s;
                    }
                    break;
                    default:
                        System.out.println("Invalid input");
        }
    }
}