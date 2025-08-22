class p11
{
    public static void main(String args[])
    {
        int r,c,j,i=0;
        for(r=8;r>=1;r--)
        {
            for(c=r;c>=1;c--)
            System.out.print(" ");
            i++;
            for(j=1;j<=i;j++)
            System.out.print(j);
            System.out.println();
            }
    }
}