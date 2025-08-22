class p61
{
    public static int max(int num1,int num2)
    {
        if(num1>num2)
        return num1;
        else
        return num2;
    }
    public static int max(int num1,int num2,int num3)
    {
        if(num1>Math.max(num2,num3))
        return num1;
        else if(num2>Math.max(num1,num3))
        return num2;
        else
        return num3;
    }
}