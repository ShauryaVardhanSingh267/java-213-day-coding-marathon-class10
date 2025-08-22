import java.util.*;
class p74
{
   public static void main(String args[]) 
   {
       Scanner ob = new Scanner(System.in);
       int a[]=new int[10];
       int i;
       for(i=0;i<10;i++)
       {
           System.out.println("Enter number "+(i+1));
           a[i]=ob.nextInt();
       }
       System.out.println("Enter the value to be searched");
       int b=ob.nextInt(),count=0;
       for(i=0;i<10;i++)
       {
           if(a[i]==b)
           {
           count++;
           break;
           }
       }
       if(count==1)
       System.out.println("Value found at index no."+i);
       else
       System.out.println("Value not found ");
   }
}