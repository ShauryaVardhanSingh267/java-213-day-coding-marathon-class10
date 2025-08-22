class p88
{
    double volume(double R)
    {
        double v = (4/3)*(22/7)*(R*R*R);
        return v;
    }
    double volume(double H,double R)
    {
        double v = (22/7)*(R*R)*H;
        return v;
    }
    double volume(double L,double B,double H)
    {
        double v = L*B*H;
        return v;
    }
}