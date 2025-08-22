import java.util.*;
class p8
{
    public static void main(String args[])
    {
       Scanner ob = new Scanner(System.in);
       System.out.println("Enter a number");
       int a = ob.nextInt();
       System.out.println("Enter 1 if you want to chek if the number is composite number \nEnter 2 if you want to find the smallest digit of the number ");
       int choice = ob.nextInt(),count=0,min=9,d;
       switch(choice)
       {
           case 1:
               for(int i=2;i<a;i++)
               {
                  if(a%i==0)
                  count++;
               }
               if(count>0)
               System.out.println("Composite Number");
               else
               System.out.println("Not a Composite Number");
               break;
               case 2:
                   while(a>0)
                   {
                       d=a%10;
                       a=a/10;
                       if(min>d)
                       min=d;
                   }
                   System.out.println("The smallest digit is "+min);
                   break;
                   default:
                       System.out.println("Invalid Input");
       }
    }
}    