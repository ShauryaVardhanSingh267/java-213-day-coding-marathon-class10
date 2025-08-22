import java.util.*;
class p113
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter 1 for pattern 1 and 2 for pattern 2");
        int choice = ob.nextInt(),r,c,count = 0;
        switch(choice)
        {
            case 1:
                for(r=1;r<=5;r++)
                {
                    for(c=1;c<=r;c++)
                    {
                        count++;
                        System.out.print(count);
                    }
                    System.out.println();
                }
                break;
                case 2:
                    for(r=1;r<=4;r++)
                    {
                        String a = "ICSE";
                        System.out.println(a.substring(0,r));
                    }
                    break;
                    default :
                        System.out.println("Invalid Input");
        }
    }
}