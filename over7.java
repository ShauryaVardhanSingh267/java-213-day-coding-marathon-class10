class over7
{
    void Number(int num ,int d)
    {
        int a = num,e,count = 0;
        while(a>0)
        {
            e=a%10;
            a=a/10;
            if(e==d)
            count++;
        }
        System.out.println("The frequency of number "+d+" -> "+count);
    }
    void Number(int n1)
    {
        int a=n1,d,sum=0;
        while(a>0)
        {
            d=a%10;
            a=a/10;
            if(d%2==0)
            sum = sum + d;
        }
        System.out.println("Sum of even digits -> "+sum);
    }
}