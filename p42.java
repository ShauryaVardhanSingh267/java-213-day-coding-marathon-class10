import java.util.*;
class p42
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a[]=new int[20];
        int i;
        for(i=0;i<20;i++)
        {
            System.out.println("Enetr the number "+(i+1));
            a[i]=ob.nextInt();
        }
        System.out.println("Enter the number to be searched");
        int n = ob.nextInt(),flag=0;
        for(i=0;i<20;i++)
        {
            if(a[i]==n)
            {
               flag++;
               break;
            }
        }
        if(flag==1)
        System.out.println("The number is at index number"+i);
        else
        System.out.println("The number is not present");
    }
}    