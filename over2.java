class over2
{
    void polygon(int n,char ch)
    {
        int r,c;
        for(r=1;r<=n;r++)
        {
            for(c=1;c<=n;c++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    void polygon(int x,int y)
    {
        int r,c;
        for(r=1;r<=y;r++)
        {
            for(c=1;c<=x;c++)
            {
                System.out.print("@");
            }
            System.out.println();
        }
    }
    void polygon()
    {
        int r,c;
        for(r=1;r<=3;r++)
        {
            for(c=1;c<=r;c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}