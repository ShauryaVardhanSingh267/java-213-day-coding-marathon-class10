import java.util.*;
class Special
{
    Scanner ob = new Scanner(System.in);
    int n;
    Special()
    {
        n = 0;
    }
    void input()
    {
        System.out.println("Enter a 2 digit number to check if it is a Special Number ");
        n = ob.nextInt();
    }
    boolean check()
    {
        int a=n,d,s=0,p=1,i=0;boolean ch = false;
        while(a>0)
        {
            d=a%10;
            a=a/10;
            s=s+d;
            p=p*d;
        }
        i=s+p;
        if(i==n)
        ch = true;
        return ch;
    }
    void display()
    {
        if(check())
        System.out.println("Unique 2 digit number");
        else
        System.out.println("Not a Unique 2 digit number");
    }
    public static void main(String args[])
    {
        Special obj = new Special();
        obj.input();
        obj.check();
        obj.display();
    }
}