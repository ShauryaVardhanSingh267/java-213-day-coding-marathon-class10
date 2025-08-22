import java.util.*;
class p158
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a[]=new int[5];
        int b[]=new int[5];
        int c[]=new int[5];
        String name[]=new String[5];
        int i,j,t=0,m=0,n=0;
        String s="";
        for(i=0;i<5;i++)
        {
            System.out.println("Enter the name of student "+(i+1));
            name[i]=ob.nextLine();ob.nextLine();
            System.out.println("Enter the marks out of 100 scored in subject 1 by student "+(i+1));
            a[i]=ob.nextInt();
            System.out.println("Enter the marks out of 100 scored in subject 2 by student "+(i+1));
            b[i]=ob.nextInt();
        }
        for(i=0;i<5;i++)
        {
            c[i]=a[i]+b[i];
        }
        for(j=0;j<4;j++)
        {
            for(i=0;i<4-j;i++)
            {
                if(c[i]<c[i+1])
                {
                    t = c[i];s = name[i];m = a[i];n = b[i];
                    c[i] = c[i+1];name[i] = name[i+1];a[i] = a[i+1];b[i] = b[i+1];
                    c[i+1] = t;name[i+1] = s;a[i+1] = m;b[i+1] = n;
                }
            }
        }
        for(i=0;i<5;i++)
        {
            System.out.println("Name : "+name[i]);
            System.out.println("Marks in Subject1 : "+a[i]);
            System.out.println("Marks in Subject2 : "+b[i]);
            System.out.println("Total Marks : "+c[i]);
            System.out.println("Rank  : "+(i+1));
        }
    }
}