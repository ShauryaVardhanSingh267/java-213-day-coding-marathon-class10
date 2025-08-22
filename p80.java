import java.util.*;
class p80
{
   public static void main(String args[])
   {
       Scanner ob = new Scanner(System.in);
       System.out.println("Enter the number of Places to be entered in the database");
       int n = ob.nextInt();
       int a[]=new int[n];
       String name[]=new String[n];
       int i;
       for(i=0;i<n;i++)
       {
           System.out.println("Enter pincode no. "+(i+1)+" in ASCENDING ORDER");
           a[i]=ob.nextInt();ob.nextLine();
           System.out.println("Enter the name of Area "+(i+1));
           name[i]=ob.nextLine();
       }
       System.out.println("Enter the pincode of the area to be searched");
       int x = ob.nextInt();
       int start=0,last=n-1,mid=0,flag=0;
       while(start<=last)
       {
           mid = (start+last)/2;
           if(a[mid]==x)
           {
               flag++;
               break;
           }
           if(x>a[mid])
           start=mid+1;
           if(x<a[mid])
           last=mid-1;
       }
       if(flag==1)
       System.out.println("Pincode - "+a[mid]+" belongs to Place "+name[mid]);
       else 
       System.out.println("Place with this pincode not available in the Database");
   }
}