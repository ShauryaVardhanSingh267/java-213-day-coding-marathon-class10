import java.util.*;
class p43
{
    public static void main(String args[])
    {
        Scanner ob= new Scanner(System.in);
        System.out.println("Enter the number of places");
        int n = ob.nextInt();
        int p[]=new int[n];
        String na[]=new String[n];
        int i;
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the pincode and the name of place "+(i+1)+" in one line");
            p[i]=ob.nextInt();
            na[i]=ob.nextLine();
        }
        System.out.println("Enter the pincode of the place to be searched ");
        int pic = ob.nextInt(),flag=0;
        for(i=0;i<n;i++)
        {
            if(p[i]==pic)
            {
            flag++;
            break;
            }
        }
        if(flag==1)
        {
        System.out.println("This is the pincode of region"+(na[i]));
        System.exit(0);
        }
        else
        System.out.println("Area not found");
    }
}