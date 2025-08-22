import java.util.*;
class p9
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter value in Rupees");
        int a = ob.nextInt();
        double con=0;
        System.out.println("Enter D for conversion from Rupee to Dollar \nEnter E for conversion from Rupee to Euro \nEnter Y for conversion from Rupee to Yen");
        char choice = ob.next().charAt(0);
        switch(choice)
        {
            case 'D':
                con = a/77.57;
                System.out.println(con+"$");
                break;
                case 'E':
                con = a/82.83;
                System.out.println(con+"€");
                break;
                case 'Y':
                con = a/1.67;
                System.out.println(con+"¥");
                break;
                default:
                    System.out.println("Invalid Input");
        }
    }
}