import java.util.*;
class p100
{boolean a,b;
public static void main(String args[])
{
    Scanner ob = new Scanner(System.in);
    p100 obj = new p100();
    System.out.println("Enter a character");
    char c = ob.next().charAt(0);
    obj.Character(c);
} 
void Character(char c)
{
    a=Character.isLetter(c);
    b=Character.isDigit(c);
    if(a)
    System.out.println("Letter");
    else if(b)
    System.out.println("Number");
    else if(a!=true && b!=true)
    System.out.println("Special Character");
}
}
/*isDigit
isLetterOrDigit
isLowerCase
isUpperCase
to lowercase
toUpperCase
isWhiteSpace
String a="21";
int b=Integer.parseInt(a);
String.valueOf(21)
"   value     ".trim()
Character.toUpperCase('a');
"Java".toUpperCase()
length of an array =a.length
Length of a String=s.length()
Name.endsWith("Value");
"today is Tuesday".startsWith("to");
class check
{ 
        public static void main(char ch)
        {
          if(Character.isLetter(ch))
          Sopln("CHARACTER");
          else if(Character.isDigit(ch))
          Sopln("DIGIT");
          else
          Sopln("SPECIAL CHAR");
          }
}
*/