import java.util.*;
class p108
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a String");
        String a = ob.nextLine();
        int i,l=a.length(),count=0;
        for(i=0;i<l;i++)
        {
            if(a.charAt(i)=='A' || a.charAt(i)=='E' || a.charAt(i)=='I' || a.charAt(i)=='O' || a.charAt(i)=='U' || a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u')
            count++;
        }
        System.out.println("Total Number of Vowels are : "+count);
    }
}