import java.util.*;
class p46
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Please Enter your Name ");
        String name = ob.nextLine();
        System.out.println("Enter the number of Days you stayed ");
        int d = ob.nextInt();
        int bill=0;
        if(d>=1&&d<=3)
        bill = d*3500;
        else if(d>=4&&d<=6)
        bill = (3*3500)+2800*(d-3);
        else if(d>=7&&d<=9)
        bill = (3*3500)+(3*2800)+2500*(d-6);
        else if(d>9)
        bill = (3*3500)+(3*2800)+(3*2500)+2000*(d-9);
        System.out.println("Name  \t  Days Stay  \t  Bill \n"+name+"  \t  "+d+"  \t  "+bill );
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("*************THANK YOU FOR STAYING IN OUR HOTEL**************");
    }
}