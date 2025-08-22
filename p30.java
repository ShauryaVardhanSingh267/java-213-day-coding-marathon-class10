class p30
{
    public static void main(String args[])
    {
       int r,c,j=7;
       for(r=0;r<=6;r++)
       {
           for(c=6;c>=r;c--)
           {
           System.out.print("@");
           }
           System.out.print(j);
           System.out.println();
           j--;
           }
           
       }
    }

    