import java.util.*;
class p137
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a String ");
        String a = ob.nextLine();
        int i,j,k,l=a.length(),count=0;
        char ch=0,ph=0,ah=0,bh=0;
        String v = "aeiouAEIOU",pai = "";
        for(i=0;i<l-1;i++)
        {
            ch = a.charAt(i);
            ah = a.charAt(i+1);
            for(j=0;j<10;j++)
            {   ph = v.charAt(j);
                if(ch==ph)
                {
                    for(k=0;k<10;k++)
                    {bh = v.charAt(k);
                if(ah==bh)
                {
                    count ++;
                    pai = pai+" "+ch+ah;
                }
                    }
                }
            }
        }
        System.out.println("Pair of vowels : "+pai+" Number of pair of vowels : "+count);
    }
}