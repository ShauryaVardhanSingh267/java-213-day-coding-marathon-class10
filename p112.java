import java.util.*;
class p112
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a word to be converted to the Pig latin form");
        String a = ob.nextLine();
        int i,l=a.length();
        String b = "",c = "",d = "";
        for(i=0;i<l;i++)
        {
            if(a.charAt(i)=='A' || a.charAt(i)=='E' || a.charAt(i)=='I' || a.charAt(i)=='O' || a.charAt(i)=='U' || a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u');
            {
              b=a.substring(0,i);
              c=a.substring(i);
            }
            d = c.concat(b) + "AY";
        }
        System.out.println("The PigLatin form of the Word will be : "+d);
    }
}