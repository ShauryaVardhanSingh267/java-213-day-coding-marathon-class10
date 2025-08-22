class over3
{
    double volume(double R)
    {
        double v=0.0;
        v=(4/3.0)*(22/7.0)*(R*R*R);
        return v;
    }
    double volume(double H,double R)
    {
        double v=0.0;
        v=(22/7.0)*(R*R)*H;
        return v;
    }
    double volume(double L,double B,double H)
    {
        double v=0.0;
        v=L*B*H;
        return v;
    }
}