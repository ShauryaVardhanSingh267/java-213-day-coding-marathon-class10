class p64
{
    void sumseries(int n,double x)
    {
        int i;
        double s = 0.0;
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            s=s-(x/i);
            else
            s=s+(x/i);
        }
        System.out.println("The sum of the series --> "+s);
    }
    void sumseries()
    {
        int i,c,p,s=0;
        for(c=1;c<=10;c++)
        {
        p=1;
        for(i=1;i<=c;i++)
        p=p*i;
        s=s+p;
        }
        System.out.println("The sum of the series --> "+s);
    }
}