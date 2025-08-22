import java.util.*;
class p149
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        String name[]= new String[5];
        int p[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[5];
        String namp = "",namb = "",namc = "";
        int i,maxp=0,maxb=0,maxc=0,sump=0,sumb=0,sumc=0;
        double avgp = 0.0,avgb = 0.0,avgc = 0.0;
        for(i=0;i<5;i++)
        {
            System.out.println("Enter your Name Student "+(i+1));
            name[i]=ob.nextLine();ob.nextLine();
            System.out.println("Enter your marks out of 100 in Physics Student "+(i+1));
            p[i]=ob.nextInt();
            System.out.println("Enter your marks out of 100 in Biology Student "+(i+1));
            b[i]=ob.nextInt();
            System.out.println("Enter your marks out of 100 in Chemistry Student "+(i+1));
            c[i]=ob.nextInt();
        }
        for(i=0;i<5;i++)
        {
            if(p[i]>maxp) 
            {
            maxp = p[i];
            namp = name[i];
            }
            if(b[i]>maxb) 
            {
            maxb = b[i];
            namb = name[i];
            }
            if(c[i]>maxc) 
            {
            maxc = c[i];
            namc = name[i];
            }
            sump = sump + p[i];
            sumb = sumb + b[i];
            sumc = sumc + c[i];
        }
        avgp = sump/5.0;
        avgb = sumb/5.0;
        avgc = sumc/5.0;
        System.out.println("Maximum marks in Physics is "+maxp+" Scored by "+namp+"Maximum marks in Chemistry is "+maxc+" Scored by "+namc+"Maximum marks in Biology is "+maxb+" Scored by "+namb);
        System.out.println("Average marks in Physics : "+avgp+" Average marks in Chemistry : "+avgc+" Average marks in Biology : "+avgb);
    }
}