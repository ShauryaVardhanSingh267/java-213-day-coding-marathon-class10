import java.util.*;
class p126
{
    void print()
    {
        int r,c,d=0;
        for(r=1;r<=4;r++)
        {
            for(c=1;c<=r;c++)
            {
                ++d;
                System.out.print(d);
            }
            System.out.println();
        }
    }
    boolean print(int n)
    {
        int a=n,d,s=0,c=0;
        boolean out=false;
        while(a>0)
        {
            d=a%10;
            a=a/10;
            s=s+d;
        }
        c = s*s*s;
        if(c==n)
        out = true;
        else 
        out = false;
        return out;
    }
    void print(int a,char ch)
    {
        if(ch =='s'||ch=='S')
        System.out.println(a*a);
        else if(ch == 'c'||ch=='C')
        System.out.println(a*a*a);
    }
}