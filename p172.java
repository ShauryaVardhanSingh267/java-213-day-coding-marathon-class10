import java.util.*;
class p172
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        char a[] = new char[15];
        int i,l=0,ul=0,ll=0;
        for(i=0;i<15;i++)
        {
            System.out.println("Enter character "+(i+1));
            a[i]=ob.next().charAt(0);
        }
        for(i=0;i<15;i++)
        {
            if(Character.isLetter(a[i]))
            {
                l++;
                if(Character.isUpperCase(a[i]))
                ul++;
                else
                ll++;
            }
        }
        System.out.println("Total number of letters -> "+l);
        System.out.println("Total number of Upper case letters -> "+ul);
        System.out.println("Total number of Lower case letters -> "+ll);
    }
}