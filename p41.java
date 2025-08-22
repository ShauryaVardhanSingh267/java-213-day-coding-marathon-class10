import java.util.*;
class p41
{
    public static void main(String args [])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of letters ");
        int n = ob.nextInt();
        char a[]=new char[n];
        int i,b=0,c=0;
        for(i=0;i<n;i++)
        {
            System.out.println("Enter letter "+(i+1));
            a[i]=ob.next().charAt(0);
            if(a[i]>='a'&& a[i]<='z')
            b++;
            if(a[i]>='A'&& a[i]<='Z')
            c++;
        }
        System.out.println("The number of Upper case letters are "+c);
        System.out.println("The number of Lower case letters are "+b);
    }
}