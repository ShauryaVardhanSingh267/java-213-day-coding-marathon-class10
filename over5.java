class over5
{
    void printSeries(int x,int n)
    {
        int i;
        double S=0.0;
        for(i=1;i<=n;i++)
        {
           if(i%2==0)
           S=S-(Math.pow(x,i)/(2*i));
           else
           S=S+(Math.pow(x,i)/(2*i));
        }
        System.out.println("Sum -> "+S);
    }
    void printSeries(String s)
    {
        int r,c;
        int l = s.length();
        for(r=l-1;r>=0;r--)
        {
            for(c=l-1;c>=r;c--)
            {
                System.out.print(s.charAt(c));
            }
            System.out.println();
        }
    }
}