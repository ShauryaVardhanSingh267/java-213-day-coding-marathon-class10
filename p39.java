import java.util.*;
class p39
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a[]=new int[10];
        int i,count=0;
        for(i=0;i<=9;i++)
        {
            System.out.println("Enter your height in Cm");
            a[i]=ob.nextInt();
            if(a[i]>183)
            count++;
        }
        System.out.println("The number of people having a height of 6 feet and above are "+count);
    }
}