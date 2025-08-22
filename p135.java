class p135
{
    int Sum(int A,int B)
    {
        int i,sum=0;
        for(i=A;i<=B;i++)
        {
            if(i%2==0)
            {
                sum = sum + i;
            }
        }
        return sum;
    }
    double Sum(double N)
    {
        double sum = 0.0,i;
        for(i=1.0;i<=N;i+=0.2)
        {
            sum = sum*i;
        }
        return sum;
    }
    int Sum(int N)
    {
        int i,sum=0,d;
        while(N>0)
        {
            d=N%10;
            N=N/10;
            if(d%2!=0)
            sum = sum +d;
        }
        return sum;
    }
}