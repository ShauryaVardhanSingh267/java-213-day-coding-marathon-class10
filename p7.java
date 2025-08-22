import java.util.*;
class p7
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter S if you want to choose Science \nEnter C if you want to choose Commerce \nEnter A if you want to choose Arts ");
        char choice = ob.next().charAt(0);
        switch(choice)
        {
            case 'S':
                System.out.println("Enter your class 10 board marks in Physics");
                int p = ob.nextInt();
                System.out.println("Enter your class 10 board marks in Chemistry");
                int c = ob.nextInt();
                System.out.println("Enter your class 10 board marks in Mathematics");
                int m = ob.nextInt();
                System.out.println("Enter your class 10 board marks in Biology");
                int b = ob.nextInt();
                if(p>=60&&c>=60&&b>=60&&m>=80)
                {
                System.out.println("You can take Sciense Stream");
                System.out.println("Which Science Stream would you like to opt\n a => PCM or b => PCB");
                char choice1 = ob.next().charAt(0);
                switch(choice1)
                {
                    case 'a':
                        System.out.println("You have chosen PCM so you get section 11A");
                        break;
                        case 'b':
                            System.out.println("You have chosen PCB so you get section 11B");
                            break;
                            default : 
                                System.out.println("Invalid Input");
                                break;
                }
                }
                else 
                System.out.println("You can not take Science Stream \n Choose any other stream");
                break;
                case 'C':
                    System.out.println("Enter marks in Mathematics");
                    int m1 = ob.nextInt();
                    if(m1>80)
                    System.out.println("You can choose Commerce stream \n you get section 11C ");
                    else
                    System.out.println("You can not choose Commerce Stream \n Choose any other stream");
                    break;
                    case 'A':
                    System.out.println("Enter marks in Geography");
                    int g = ob.nextInt();
                    System.out.println("Enter marks in History and Civics");
                    int h = ob.nextInt();
                    if(g>=60&&h>=60)
                    System.out.println("You can choose Arts stream \n you get section 11D ");
                    else
                    System.out.println("You can not choose Arts Stream \n Choose any other stream");
                    break;
                    default:
                        System.out.println("Invalid Input");
                 }
}
}
