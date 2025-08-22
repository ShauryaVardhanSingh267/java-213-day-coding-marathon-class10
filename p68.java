import java.util.*;
class p68
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        p68 obj = new p68();
        System.out.println("Enter the desired radius of the circle");
        double r = ob.nextDouble();
        double circum= obj.circumference(r);
        System.out.println("The circumference of the circle = "+circum);
    }
    double circumference(double r)
    {
        double circum = 2.0*Math.PI*r;
        return circum;
    }
}