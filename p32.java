class p32
{
    public static void main(String args[])
    {
        int r,c,i=1,j;
        for(r=8;r>=1;r--)
        {
        for(c=1;c<=r;c++)
        System.out.print(" ");
        for(j=1;j<=i;j++)
        System.out.print(j);
        System.out.println();
        i++;
        }
    }
}