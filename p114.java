import java.util.*;
class p114
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter 1 for series 2 for pattern 1 and 3 for pattern 2");
        int choice = ob.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter the value of n");
                int n = ob.nextInt();
                System.out.println("Enter the value of x");
                int x = ob.nextInt();
                double s = 15.0;int i;
                for(i=2;i<=n;i+=2)
                {
                    if(i%4==0)
                    s=s+Math.pow(x,i);
                    else 
                    s=s-Math.pow(x,i);
                }
                System.out.println(s);
                break;
                case 2:
                    int r,c;
                    for(r=1;r<=4;r++)
                    {
                        for(c=1;c<=r;c++)
                        {
                        if(c%2==0)
                        System.out.print("0");
                        else
                        System.out.print("1");
                        }
                        System.out.println();
                    }
                    break;
                    case 3:
                        int o,p;
                        for(o=1;o<=4;o++)
                        {
                            for(p=o;p>=1;p--)
                            {
                               if(p%2==0)
                               System.out.print("0");
                               else
                               System.out.print("1"); 
                            }
                            System.out.println();
                        }
                        break;
                        default:
                            System.out.println("Invalid input");
        }
    }
}