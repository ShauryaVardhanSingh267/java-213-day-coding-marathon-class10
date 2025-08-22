import java.util.*;
class p175
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a or b");
        char choice = ob.next().charAt(0);
        switch(choice)
        {
            case 'a':
                System.out.println("Enter a number");
                int a = ob.nextInt();
                int d,max=0,min=9;
                while(a>0)
                {
                    d=a%10;
                    a=a/10;
                    if(d>max)
                    max=d;
                    if(d<min)
                    min=d;
                }
                System.out.println("Greatest digit -> "+max);
                System.out.println("Smallest digit -> "+min);
                break;
                case 'b':
                    System.out.println("Enter a String");
                    String b = ob.nextLine();String n = ob.nextLine();
                    String no = n.trim();
                    String na = " "+no.toUpperCase();
                    int l=na.length(),i;
                    char ch=0,bh=0;
                    String fin = "";
                    for(i=0;i<l-1;i++)
                    {
                        ch = na.charAt(i);
                        bh = na.charAt(i+1);
                        if(Character.isWhitespace(ch))
                        fin = fin + bh;
                    }
                    System.out.println("The final word is "+fin);
                    break;
                    default:
                        System.out.println("Invalid Input");
        }
    }
}