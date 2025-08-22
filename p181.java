import java.util.*;
class p181
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        String a[] = new String[10];
        int i,j;
        String t = "";
        for(i=0;i<10;i++)
        {
            System.out.println("Enter name "+(i+1));
            a[i]=ob.nextLine();
        }
        for(j=0;j<9;j++)
        {
            for(i=0;i<9-j;i++)
            {
                if(a[i].compareTo(a[i+1])>0)
                {
                t = a[i];
                a[i] = a[i+1];
                a[i+1] = t;
                }
            }
        }
        for(i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
    }
}