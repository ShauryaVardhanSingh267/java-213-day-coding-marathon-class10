import java.util.*;
class unique
{
    Scanner ob = new Scanner(System.in);
    int n;
    unique()
    {
        n=0;
    }
    void input()
    {
        System.out.println("Enter a number to check if it is a unique number or not");
        n = ob.nextInt();
    }
    boolean check()
    {
        int a[]=new int[10];
        int b = n,d,i=0,count=0;
        boolean ch = false;
        while(b>0)
        {
            d=b%10;
            b=b/10;
            a[i]=d;
            i++;
        }
        for(i=0;i<10;i++)
        {b=n;count = 0;
            while(b>0)
        {
            d=b%10;
            b=b/10;
            if(a[i]==d)
            count++;
            if(count>1)
            {
            ch = true;
            break;
            }
        }
        }
        return ch;
    }
    void display()
    {
        if(check())
        System.out.println("Not a Unique Number");
        else
        System.out.println("Unique Number");
    }
    public static void main(String args[])
    {
        unique obj = new unique();
        obj.input();
        obj.check();
        obj.display();
    }
}