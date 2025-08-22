class PatternOverload
{
    void Pattern(int n)
    {
        int r,c,p=0;
        for(r=1;r<=n;r++,p++)
        {
            for(c=1;c<=n;c++)
            {  
                p++;
                if(p%2==0)
                System.out.print("0");
                else
                System.out.print("1");
            }
            System.out.println();
        }
    }
    void pattern(int n,char ch)
    {
        int r,c;
        for(r=n;r>=1;r--)
        {
            for(c=1;c<=r;c++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    void pattern()
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