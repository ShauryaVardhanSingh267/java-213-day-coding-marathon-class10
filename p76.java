import java.util.*;
class p76
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of workers at your office");
        int n = ob.nextInt();
        int a[]=new int[n];
        String name[]=new String[n];
        int i;
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the ID of worker "+(i+1));
            a[i]=ob.nextInt();ob.nextLine();
            System.out.println("Enter the Name of worker "+(i+1));
            name[i]=ob.nextLine();
        }
        System.out.println("Enter the ID of the worker to be searched ");
        int x = ob.nextInt();
        int flag = 0;
        for(i=0;i<n;i++)
        {
            if(a[i]==x)
            {
                flag++;
                break;
            }
        }
        if(flag==1)
        System.out.println("The worker with ID "+x+" is "+name[i]);
        else
        System.out.println("Invalid ID Not matching with the Database");
    }
}