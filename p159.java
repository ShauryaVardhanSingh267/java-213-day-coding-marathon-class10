import java.util.*;
class p159
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a String");
        String a = ob.nextLine();
        int i,l = a.length(),d,e,m,n;
        char ch,bh=0,dh,ah=0,c,fin=0;
        String sum ="";
        String finale = "";
        for(i=0;i<l;i++)
        {
            ch = a.charAt(i);
            if(Character.isLetter(ch))
            {
                d = (int)ch+5;
                bh = (char)d;
                break;
            }
        }
        for(i=l-1;i>0;i--)
        {
            dh = a.charAt(i);
            if(Character.isLetter(dh))
            {
                e = (int)dh+5;
                ah = (char)e;
                break;
            }
        }
        for(i=0;i<l;i++)
        {
            c = a.charAt(i);fin =c;
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                m=(int)c + 1;
                fin = (char)m;
            }
            else if(Character.isLetter(c))
            {
                n=(int)c - 1;
                fin = (char)n;
            }
            sum = sum + fin;
        }
        finale = bh+sum+ah;
        System.out.println(a);
        System.out.println(finale);
    }
}