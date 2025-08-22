class Overload
{
    int compare(int a,int b,int c)
    {
        int max = Math.max(a,(Math.max(b,c)));
        if(a==b&&a==c)
        max = 0;
        return max;
    }
    int compare(char a,char b)
    {
        int dif = Math.abs((int)a-(int)b);
        return dif;
    }
    String compare(String a,String b)
    {
        String c ="";
        if(a.length()>b.length())
        c=a+b;
        else if(b.length()>a.length())
        c=b+a;
        else if(a.length()==b.length())
        c = "null";
        return c;
    }
}