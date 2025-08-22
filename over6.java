class over6
{
    void secondSeries(int x,int n)
    {
        int i,j,p=1;
        double sum = 0.0;
        for(i=1;i<=n;i++)
        {
            p=1;
            for(j=1;j<=i;j++)
            p=p*j;
            sum = sum + Math.pow(x,i)/p;
        }
        System.out.println("Sum of the series = "+sum);
    }
    void secondSeries(int n)
    {
        int a=n,d,e,count=0,i,s=0;
        while(n>0)
        {
            e=n%10;
            n=n/10;
            count++;
        }
        for(i=1;i<=count;i++)
        {
            d=a%10;
            a=a/10;
            if(i==1||i==count)
            s=s+d;
        }
        System.out.println("The sum of first and last digits = "+s);
    }
}