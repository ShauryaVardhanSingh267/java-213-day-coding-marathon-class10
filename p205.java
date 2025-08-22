import java.util.*;
class p205
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a[] = new int[10];
        int r[] = new int[10];
        String name[] = new String[10];
        int i,j,t=0,u=0;
        String v = "";
        for(i=0;i<10;i++)
        {
            System.out.println("Enter roll no. of Student "+(i+1));
            r[i]=ob.nextInt();
            System.out.println("Enter Total Marks of Student "+(i+1));
            a[i]=ob.nextInt();
            System.out.println("Enter Name of Student "+(i+1));
            name[i]=ob.nextLine();ob.nextLine();
        }
        for(j=0;j<9;j++)
        {
            for(i=0;i<9-j;i++)
            {
                if(a[i]<a[i+1])
                {
                    t=a[i];u=r[i];v=name[i];
                    a[i]=a[i+1];r[i]=r[i+1];name[i]=name[i+1];
                    a[i+1]=t;r[i+1]=u;name[i+1]=v;
                }
            }
        }
        System.out.println("Position  Name  R.no.  Total marks");
        for(i=0;i<10;i++)
        {
            System.out.println((i+1)+" -> "+name[i]+"\t"+r[i]+"\t"+a[i]);
        }
    }
}