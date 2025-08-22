import java.util.*;
class p10
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number ");
        int a = ob.nextInt(),b;
        System.out.println("Enter 1 if you want to check that the number is a Buzz Mumber \nEnter 2 if you want to check that the number is an automorphic number");
        int choice = ob.nextInt();
        switch(choice)
        {
            case 1:
                if((a%10)==7||(a%7)==0)
                System.out.println(a+" is a Buzz Number");
                else
                System.out.println(a+" is not a Buzz Number");
                break;
                case 2:
                    b=a*a;
                    if(b%10==a%10)
                    System.out.println(a+" is an Automorphic Number");
                    else
                    System.out.println(a+" is not an Automorphic Number");
                    break;
                    default:
                        System.out.println("Invalid Input");
        }
    }
}