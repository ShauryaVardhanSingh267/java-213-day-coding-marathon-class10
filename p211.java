import java.util.*;
class p211
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        char a[] = new char[10];
        int i,count = 0;
        for(i=0;i<10;i++)
        {
            System.out.println("Enter aplhabet "+(i+1));
            a[i]=ob.next().charAt(0);
        }
        System.out.println("Enter the alphabet to be searched");
        char ch = ob.next().charAt(0);
        for(i=0;i<10;i++)
        {
            if(a[i]==ch)
            {
                count++;
                break;
            }
        }
        if(count==1)
        System.out.println("Search Successful \nAlphabet found at index "+(i));
        else
        System.out.println("Search Unsuccessful ");
    }
}