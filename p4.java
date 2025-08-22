import java.util.*;
class p4
{
    public static void main (String args[])
    {
       Scanner ob = new Scanner(System.in);
       System.out.println("Enter your Name ");
       String name = ob.nextLine();
       System.out.println(" Enter the number of days stayed ");
       int a = ob.nextInt();
       int bill = 0;
       if(a>0&&a<=3)
       bill = 3500*a;
       else if(a>3&&a<=6)
       bill = (3500*3) + 2800*(a-3);
       else if(a>6&&a<=9)
       bill = (3500*3)+(2800*3)+2500*(a-6);
       else if(a>9)
       bill = (3500*3)+(2800*3)+(2500*3)+2000*(a-9);
       System.out.println("Name\t"+"Days Stayed\t"+"Bill");
       System.out.println(name+"\t"+"\t"+a+"\t"+bill);
    }
}    