import java.util.*;
class p156
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        String country[] = new String[10];
        int i,j;
        for(i=0;i<10;i++)
        {
            System.out.println("Enter the name of country"+(i+1));
            country[i]=ob.nextLine();
        }
        int count = 0,wount = 0;
        String vow = "AEIOUaeiou";
        for(i=0;i<10;i++)
        {   
            int l =0;l=country[i].length();
            if(country[i].endsWith("a") || country[i].endsWith("e") || country[i].endsWith("i") || country[i].endsWith("o") || country[i].endsWith("u") || country[i].endsWith("A") || country[i].endsWith("E") || country[i].endsWith("I") || country[i].endsWith("O") || country[i].endsWith("U"));
            {count++;}
            if(l%2!=0)
            wount++;
        }
        System.out.println("Number of words ending with vowel "+count);
        System.out.println("Number of words with odd number of digits "+wount);
    }
}