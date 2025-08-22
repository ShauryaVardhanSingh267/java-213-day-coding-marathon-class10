import java.util.*;
class p139
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        String name[] = new String[10];
        int a[] = new int[10];
        int i,j,t=0;
        String k = "";
        for(i=0;i<10;i++)
        {
            System.out.println("Enter the name of book"+(i+1));
            name[i]=ob.nextLine();ob.nextLine();
            System.out.println("Enter the number of times the book was issued");
            a[i]=ob.nextInt();
        }
        for(j=0;j<9;j++)
        {
            for(i=0;i<9-j;i++)
            {
                if(a[i]<a[i+1])
                {
                    t = a[i];
                    a[i] = a[i+1];
                    a[i+1] = t;
                    k = name[i];
                    name[i] = name[i+1];
                    name[i+1] = k;
                }
            }
        }
        for(i=0;i<5;i++)
        {
            System.out.println("No. "+(i+1)+name[i]);
        }
    }
}