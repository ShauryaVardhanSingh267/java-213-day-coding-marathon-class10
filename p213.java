class p213
{
    public static void main(String args[])
    {
        int r,c,d=0;
        for(r=1;r<=5;r++)
        {
            for(c=1;c<=r;c++)
            {
                System.out.print(c+d);
            }
            System.out.println();
            d++;
        }
    }
}