import java.util.*;
class p130
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        String name[]=new String[10];
        int i,count = 0;
        for(i=0;i<10;i++)
        {
            System.out.println("Enter your name Person "+(i+1));
            name[i]=ob.nextLine();
        }
        System.out.println("Enter the name to be searched");
        String n = ob.nextLine();
        for(i=0;i<10;i++)
        {
            if(name[i].equalsIgnoreCase(n))
            {
                count ++;
                break;
            }
        }
        if(count == 1)
        System.out.println("Name found at index "+i);
        else
        System.out.println("Name not found");
    }
}