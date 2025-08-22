import java.util.*;
class p19
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number ");
        int a = ob.nextInt(),i=1;
        System.out.println("The factors of "+a+" are :");
        while(i<=a)
        {
            if(a%i==0)
            System.out.println(i);
            i++;
        }
    }
}