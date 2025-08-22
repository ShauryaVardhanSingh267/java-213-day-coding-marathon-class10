import java.util.*;
class p47
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = ob.nextInt();
        System.out.println("Enter 1 to check if it is a composite number \nEnter 2 to find its smallest digit ");
        int choice = ob.nextInt();
        int i,count=0,d=0,min=9;
        switch(choice)
        {
            case 1:
                for(i=1;i<a;i++)
                {
                    if(a%i==0)
                    count++;
                }
                if(count>=2)
                System.out.println("Composite number");
                else
                System.out.println("Not a Composite Number");
                break;
                case 2:
                    while(a>0)
                    {
                        d=a%10;
                        a=a/10;
                        if(d<min)
                        min=d;
                    }
                    System.out.println("The Smallest digit is "+min);
                    break;
                    default:
                        System.out.println("Invalid Input");
        }
    }
}