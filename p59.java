import java.util.*;
class p59
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number to get its table printed");
        int a = ob.nextInt(),i;
        int b[]=new int[10];
        for(i=0;i<10;i++)
        {
            b[i] =table(a,i); 
        }
        for(i=0;i<10;i++)
        {
            System.out.println(a+"*"+(i+1)+"="+b[i]);
        }
    }
    public static int table(int a,int i)
    {
        int p=1;
        p=a*(i+1);
        return p;
    }
}