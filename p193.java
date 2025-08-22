import java.util.*;
class p193
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a to get all english alphabets with their unicode OR Enter b to print the given pattern");
        char choice = ob.next().charAt(0);
        switch(choice)
        {
            case 'a':
                int i;
                for(i=65;i<=90;i++)
                {
                    System.out.print((char)i+"  -->  ");
                    System.out.print(i);
                    System.out.println();
                }
                break;
                case 'b':
                    int r,c;
                    for(r=1;r<=5;r++)
                    {
                        for(c=1;c<=r;c++)
                        {
                            System.out.print(c);
                        }
                        System.out.println();
                    }
                    break;
                    default : 
                        System.out.println("Invalid Input");
        }
    }
}