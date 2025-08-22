class p201
{
    void Number(int num , int d)
    {
        int a = num,n;
        int count = 0;
        while(a>0)
        {
            n=a%10;
            a=a/10;
            if(n==d)
            count++;
        }
        System.out.println("The freqency of the digit in the number is "+count);
    }
    void Number(int n1)
    {
        int a = n1,d,sum=0;
        while(a>0)
        {
            d=a%10;
            a=a/10;
            if(d%2==0)
            sum = sum + d;
        }
        System.out.println("The sum of the even digits of the number is : "+sum);
    }
    public static void main(String args[])
    {
        p201 obj = new p201();
        obj.Number(2565685,5);
        obj.Number(29865);
    }
}