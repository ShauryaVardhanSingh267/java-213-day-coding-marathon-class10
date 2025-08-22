class p142
{
    void check(String str, char ch)
    {
        int i,l=str.length(),count = 0;
        for(i=0;i<l;i++)
        {
            if(str.charAt(i)==ch)
            count++;
        }
        System.out.println("The letter "+ch+" appears "+count+" times in the given String");
    }
    void check(String s1)
    {
        String a=s1.toLowerCase(),vow="aeiou",fin="";
        int i,l=a.length(),j;
        char ch=0,bh=0;
        for(i=0;i<l;i++)
        {
            ch = a.charAt(i);
            for(j=0;j<5;j++)
            {
                bh=vow.charAt(j);
                if(ch==bh)
                {
                    fin = fin + ch+" ";
                }
            }
        }
        System.out.println("The vowels in the string are "+fin);
    }
}