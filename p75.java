import java.util.*;
class p75
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        p75 obj = new p75();
        System.out.println("Enter a multiple digit number ");
        int a = ob.nextInt();
        System.out.println(" Enter 1 to find the sum of its digits \n Enter 2 to find the product of its digits \n Enter 3 to find the smallest of all digits \n Enter 4 to find the largest of all digits");
        int choice = ob.nextInt();
        switch(choice)
        {
            case 1:
                int sum = obj.sum(a); 
                System.out.println("The sum of the digits = "+sum);
                break;
                case 2:
                    int pro = obj.pro(a);
                    System.out.println("The product of the digits = "+pro);
                    break;
                    case 3:
                        int small = obj.small(a);
                        System.out.println("The smallest of the given digits = "+small);
                        break;
                        case 4:
                            int max = obj.max(a);
                            System.out.println("The largest of the given digits = "+max);
                            break;
                            default:
                                System.out.println("Invalid input");
        }
    }
    int sum(int a)
    {
        int d,s=0;
        while(a>0)
        {
            d=a%10;
            a=a/10;
            s=s+d;
        }
        return s;
    }
    int pro(int a)
    {
        int d,p=1;
        while(a>0)
        {
            d=a%10;
            a=a/10;
            p=p*d;
        }
        return p;
    }
    int small(int a)
    {
        int d,small=9;
        while(a>0)
        {
            d=a%10;
            a=a/10;
            if(d<small)
            small=d;
        }
        return small;
    }
    int max(int a)
    {
        int d,max=0;
        while(a>0)
        {
            d=a%10;
            a=a/10;
            if(d>max)
            max=d;
        }
        return max;
    }
}