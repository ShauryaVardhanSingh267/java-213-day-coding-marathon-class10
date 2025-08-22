import java.util.*;
class p115
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a[] = new int[10];
        String name[] = new String[10];
        double bill[] = new double[10];
        int i,count=0;
        for(i=0;i<10;i++)
        {
            System.out.println("Enter your Name ");
            name[i]=ob.nextLine();ob.nextLine();
            System.out.println("Enter the units consumed by you ");
            a[i]=ob.nextInt();
        }
        for(i=0;i<10;i++)
        {
            if(a[i]<=150)
            bill[i]=4.20*a[i];
            else if(a[i]>150 && a[i]<=400)
            bill[i]=6.50*a[i];
            else
            bill[i]=9.0*a[i]+250;
        }
        System.out.println("Enter your name to get your Electricity bill");
        String b = ob.nextLine();ob.nextLine();
        for(i=0;i<10;i++)
        {
            if(name[i].equalsIgnoreCase(b))
            {
            count=1;
            break;
            }
        }
        if(count==1)
        System.out.println("Name : "+name[i]+"\nUnits Consumed : "+a[i]+"\nBill Amount : "+bill[i]);
        else
        System.out.println("Name not in the server");
    }
}