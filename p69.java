import java.util.*;
class p69
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        p69 obj = new p69();
        System.out.println("Enter your age");
        int age = ob.nextInt();
        String s = obj.vote(age);
        System.out.println(s);
    }
    String vote(int age)
    {
        String s;
        if(age>18)
        s = "You can vote";
        else
        s = "You can not vote"; 
        return s;
    }
}