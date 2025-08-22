import java.util.*;
class p157
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter 1 to get the sum of series and 2 to check if a number is an evil number");
        int choice = ob.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter the values for x and y");
                int x = ob.nextInt();
                int y = ob.nextInt();
                double sum = 0.0;
                for(int i=1;i<=10;i++)
                {
                    sum = sum + x*i/Math.pow(y,i);
                }
                System.out.println("The sum of series = "+sum);
                break;
                case 2:
                    System.out.println("Enter a number");
                    int n = ob.nextInt(),a=n,d,count = 0;
                    while(a>0)
                    {
                        d=a%10;
                        a=a/10;
                        if(d==1)
                        count++;
                    }
                    if(count%2==0)
                    System.out.println("Evil number");
                    else
                    System.out.println("Not an Evil Number");
                    break;
                    default:
                        System.out.println("Invalid input");
        }
    }
}