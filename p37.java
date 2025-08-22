import java.util.*;
class p37
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a[] = new int[11];
        String name[] = new String[11],na="";
        int i,max=0;
        for(i=0;i<11;i++)
        {
            System.out.println("Enter the runs you scored in the match Player "+(i+1)+" and Enter your name by giving a space");
            a[i] = ob.nextInt();name[i] = ob.nextLine();
            if(a[i]>max)
            {
            max=a[i];
            na=name[i];
            }
        }
        System.out.println("Maximum runs : "+max+"\nScored by : "+na);
    }
}