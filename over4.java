class over4
{
    void print(char ch)
    {
        int r,c;
        for(r=1;r<=4;r++)
        {
            for(c=1;c<=r;c++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    void print(int n)
    {
        int i;
        double sum = 0;
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            sum = sum + 1.0/Math.pow(i,2);
            else
            sum = sum + Math.pow(i,2);
        }
        System.out.println(sum);
    }
}