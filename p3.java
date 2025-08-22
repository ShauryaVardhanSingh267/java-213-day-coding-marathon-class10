import java.util.*;
class p3
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your Name ");
        String name = ob.nextLine();
        System.out.println("Enter Marks scored in English");
        int a = ob.nextInt();
        System.out.println("Enter Marks scored in Hindi");
        int b = ob.nextInt();
        System.out.println("Enter Marks scored in Scinces");
        int c = ob.nextInt();
        System.out.println("Enter Marks scored in Social Studies");
        int d = ob.nextInt();
        System.out.println("Enter Marks scored in Mathematics");
        int e = ob.nextInt();
        System.out.println("Enter Marks scored in Computer Applications");
        int f = ob.nextInt();
        int ts = a+b+c+d+e+f;
        double per = (ts/600.0)*100.0;
        String grade = "" ;
        if(per>=95.0)
        grade = "A+";
        else if(per>=85.0&&per<95.0)
        grade = "A";
        else if(per>=75.0&&per<85.0)
        grade = "B";
        else if(per>=55.0&&per<75.0)
        grade = "C";
        else if(per>=40.0&&per<55.0)
        grade = "D";
        else if(per<40.0)
        grade = "E";
        System.out.println("Student : "+name+"\n Total Marks : "+ts+"\n Percentage : "+per+"% \n Grade : "+grade);
        }
}