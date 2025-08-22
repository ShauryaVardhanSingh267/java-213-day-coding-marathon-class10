class p195
{
    void series(int x,int n)
    {
        double sum = 0.0;
        for(int i=1;i<=n;i++)
        {
           sum = sum + Math.pow(x,i);  
        }
        System.out.println(sum);
    }
    void series(int p)
    {
        int i;
        for(i=1;i<=p;i++)
        {
            System.out.println((Math.pow(i,3))-1);
        }
    }
    void series()
    {
        double S = 0.0;
        int i;
        for(i=2;i<=10;i++)
        {
            S = S + (1.0/i);
        }
    }
}