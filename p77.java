import java.util.*;
class p77
{
    public static void main(String args[])
    {
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter the number of lottery tickets sold");
    int n = ob.nextInt();
    int a[]=new int[n];
    String name[]=new String[n];
    int i;
    for(i=0;i<n;i++)
    {
        System.out.println("Enter the lottery ticket number");
        a[i]=ob.nextInt();ob.nextLine();
        System.out.println("Enter the name of the person to whom the lottery ticket was sold");
        name[i]=ob.nextLine();        
    }
    System.out.println("Enter the winning lottery number");
    int x = ob.nextInt();
    int flag=0;
    for(i=0;i<n;i++)
    {
        if(a[i]==x)
        {
            flag++;
            break;
        }
    }
    if(flag==1)
    System.out.println("The lottery is won by "+name[i]);
    else
    System.out.println("The winning lottery ticket was not sold");
    }
}