import java.util.*;
class p71
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        p71 obj = new p71();
        System.out.println("Enter number 1");
        int a = ob.nextInt();
        System.out.println("Enter number 2");
        int b = ob.nextInt();
        int m = obj.num(a);
        int n = obj.num(b);
        int i,j,c=0;
        int A[]=obj.factor(a);
        int B[]=obj.factor(b);
        int C[]=new int[m+n];
        for(j=0;j<m;j++)
        {
            for(i=0;i<n;i++)
            {   
                if(A[j]==B[i])
                {
                C[c]=B[i];
                c++;
                }
            }
        }
        int max=0;
        for(i=0;i<c;i++)
        {
            if(max<C[i])
            max=C[i];
        }
        System.out.println("The greatest common factor of the two numbers is "+max);
    }
    int[] factor(int a)
    {
        int i,b=0;
        for(i=1;i<=a;i++)
        {
            if(a%i==0)
            b++;
        }
        int []A=new int[b];
        int c=0;
        for(i=1;i<=a;i++)
        {
            if(a%i==0)
            {
            A[c]=i;
            c++;
            }
        }
        return A;
    }
    int num(int a)
    {
        int i,d=0;
        for(i=1;i<=a;i++)
        if(a%i==0)
        d++;
        return d;
    }
}