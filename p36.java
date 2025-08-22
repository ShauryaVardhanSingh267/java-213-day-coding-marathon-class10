import java.util.*;
class p36
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a[] = new int[10];
        int i,c=0;
        for(i=0;i<10;i++)
        {
            System.out.println("Enter your height in Centimeters");
            a[i] = ob.nextInt();
            if(a[i]>=183)
            c++;
        }
        System.out.println(c+" people have height above 6 feet(183 cm)");
    }
}