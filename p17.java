import java.util.*;
class p17
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter 1 to print the first series \nEnter 2 print the second series");
        int choice = ob.nextInt();
        int i,j;
        double s=0.0,sa=0.0;
        switch(choice)
        {
            case 1:
                for(i=2;i<=20;i+=2)
                {
                    if(i%4==0)
                    s=s-i;
                    else
                    s=s+i;
                }
                System.out.println(s);
                break;
                case 2:
                    System.out.println("Enter the value for x in the series");
                    int x=ob.nextInt();
                    for(j=2;j<=20;j+=3)
                    {
                        sa=sa+(x/j);
                    }
                    System.out.println(sa);
                    break;
                    default:
                        System.out.println("Invalid Input");
        }
    }
}