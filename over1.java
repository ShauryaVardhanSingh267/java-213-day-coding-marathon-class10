class over1
{
    double series(double n)
    {
        double sum = 0;
        for(int i=1;i<=n;i++)
        {
            sum = sum + (1.0/i);
        }
        return sum;
    }
    double series(double a,double n)
    {
        double sum = 0;
        for(int i=2;i<=(2*n +(n-1));i+=3)
        {
            sum = sum + (1.0/Math.pow(a,i));
        }
        return sum;
    }
}