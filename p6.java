import java.util.*;
class p6
{
    public static void main(String args[])
    {
        Scanner ob= new Scanner (System.in);
        System.out.println("Enter the value of the Hypotenuse of the triangle");
        int h = ob.nextInt();
        System.out.println("Enter the value of the Perpendicular of the triangle");
        int p = ob.nextInt();
        System.out.println("Enter the value of the Base of the triangle");
        int b = ob.nextInt();
        int a = h*h;
        int c = (p*p) + (b*b);
        if(a==c)
        System.out.println(h+","+p+" and "+b+" are Pythagorean Triplets");
    }
}