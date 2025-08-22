import java.util.*;
class p62
{
    void volume(int l,int b,int h)
    {
        int v = l*b*h;
        System.out.println("The volume of the cuboid is "+v+"cm^3");
    }
    void volume(int h,int r)
    {
        double v = h*r*r*Math.PI;
        System.out.println("The volume of the cylinder is "+v+" cm^3");
    }
    void volume(int a)
    {
        int v = a*a*a;
        System.out.println("The volume of the cube is "+v+" cm^3");
    }
}