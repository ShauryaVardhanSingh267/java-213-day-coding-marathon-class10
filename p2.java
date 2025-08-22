import java.util.*;
class p2
{ 
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = ob.nextInt();
        System.out.println("Enter value of b");
        int b = ob.nextInt();
        System.out.println("Enter value of c");
        int c = ob.nextInt();
        int d = (b*b)-4*a*c;
        if(d>=0)
        System.out.println("Real roots");
        else if(d<0)
        System.out.println("Imaginary roots");
        else if(d==0)
        System.out.println("Real and equal roots");
    }
}    