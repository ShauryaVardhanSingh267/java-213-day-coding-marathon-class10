import java.util.*;
class p29
{
    public static void main (String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int k=ob.nextInt(),r,c,count = 0;
        for(r=1;r<=k;r++)
        {
            for(c=1;c<=r;c++)
            {
            count++;    
            System.out.print(count);
            }
            System.out.println();
        }
    }
}