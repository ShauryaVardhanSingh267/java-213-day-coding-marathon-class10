import java.util.*;
class p209
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a for pattern1 and b for pattern2");
        char choice = ob.next().charAt(0);
        switch(choice)
        {
            case 'a':
                int r,c;
                for(r=7;r>=1;r-=2)
                {
                    for(c=1;c<=r;c++)
                    {
                        System.out.print(c);
                    }
                    System.out.println();
                }
                break;
                case 'b':
                    int i,j;
                    for(j=1;j<=5;j++)
                    {
                        for(i=1;i<=5;i++)
                        {
                            System.out.print(j);
                        }
                        System.out.println();
                    }
                    break;
                    default:
                        System.out.println("Invalid Input");
        }
    }
}