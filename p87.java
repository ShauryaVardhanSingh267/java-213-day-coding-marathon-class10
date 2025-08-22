import java.util.*;
class p87
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        p87 obj = new p87();
        System.out.println("Enter a number to check if it is a Pronic number");
        int a = ob.nextInt();
        int t = obj.pronic(a);
        if(t==1)
        System.out.println("Pronic Number");
        else
        System.out.println("Not a Pronic number");
    }
    int pronic(int a)
    {
        int i,flag = 0;
        for(i=1;i<a;i++)
        {
            if(i*(i+1)==a)
            {
            flag++;
            break;
            }
        }
        return flag;
    }
}