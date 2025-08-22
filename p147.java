import java.util.*;
class p147
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a[] = new int[10];
        String city[] = new String[10];
        int i,count=0;
        for(i=0;i<10;i++)
        {
            System.out.println("Enter the name of city "+(i+1));
            city[i]=ob.nextLine();ob.nextLine();
            System.out.println("Enter the Subscriber Trunk Dialing code of the city");
            a[i]=ob.nextInt();
        }
        System.out.println("Enter the name of City to be searched");
        String name = ob.nextLine();ob.nextLine();
        for(i=0;i<10;i++)
        {
            if(city[i].equalsIgnoreCase(name))
            {
                count++;
                break;
            }
        }
        if(count==1)
        {
            System.out.println("Search successful ");
            System.out.println("City : "+city[i]+" Subscriber Trunk Dialing code : "+a[i]);
        }
        else
        System.out.println("Search Unsuccessful,no such city in the list");
    }
}