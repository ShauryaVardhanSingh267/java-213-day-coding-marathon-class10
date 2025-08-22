import java.util.*;
class p134
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        String name[] = new String[10];
        double p[] = new double[10];
        int i,j;
        double t=0;
        String k = "";
        for(i=0;i<10;i++)
        {
            System.out.println("Enter your name Student "+(i+1));
            name[i]=ob.nextLine();ob.nextLine();
            System.out.println("Enter the percentage scored by you Student "+(i+1));
            p[i]=ob.nextDouble();
        }
        for(j=0;j<9;j++)
        {
            for(i=0;i<9-j;i++)
            {
                if(p[i]<p[i+1])
                {
                    t=p[i];
                    k=name[i];
                    p[i]=p[i+1];
                    name[i]=name[i+1];
                    p[i+1]=t;
                    name[i+1]=k;
                }
            }
        }
        for(i=0;i<5;i++)
        {
            System.out.println("Position "+(i+1)+" : "+name[i]+" Percentage : "+p[i]);
        }
    }
}