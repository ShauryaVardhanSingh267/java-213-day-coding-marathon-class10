import java.util.*;
class p5
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner (System.in);
        System.out.println("Enter the weight of the parcel");
        int w = ob.nextInt(),ch=0;
        if(w<=10)
        ch=30*w;
        else if(w>10&&w<=30)
        ch=300+(20*(w-10));
        else if(w>30)
        ch=300 + 400 + (15*(w-30));
        System.out.println("The charges you have to pay are"+ch);
    }
}