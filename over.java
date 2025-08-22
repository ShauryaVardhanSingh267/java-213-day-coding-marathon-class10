class over
{
    double area(double a,double b,double c)
    {
        double ar,s;
        s=(a+b+c)/2.0;
        ar = s*(s-a)*(s-b)*(s-c);
        return ar;
    }
    double area(int a,int b,int height)
    {
        double are;
        are = (1/2.0)*(height)*(a+b);
        return are;
    }
    double area(double diagonal1,double diagonal2)
    {
        double area;
        area = (1/2.0)*(diagonal1*diagonal2);
        return area;
    }
}