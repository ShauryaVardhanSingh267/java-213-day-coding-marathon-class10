import java.util.*;
class p65
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        p65 obj = new p65();
        System.out.println("Enter number 1");
        int a = ob.nextInt();
        System.out.println("Enter number 2");
        int b = ob.nextInt();
        System.out.println("Enter number 3");
        int c = ob.nextInt();
        double avg = obj.average(a,b,c);
        System.out.println("The average of the given three numbers => "+avg);
    }
    double average(int a,int b,int c)
    {
        double avg = (a+b+c)/3.0;
        return avg;
    }
}