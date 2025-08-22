import java.util.*;
class p170
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        String state[] = new String[28];
        int i,j;
        String t = "";
        for(i=0;i<28;i++)
        {  
            System.out.println("Enter the name of State"+(i+1));
            state[i] = ob.nextLine();
        }
        for(j=0;j<27;j++)
        {
            for(i=0;i<27-j;i++)
            {
                if(state[i].compareTo(state[i+1])>0)
                t = state[i];
                state[i] = state[i+1];
                state[i+1] = t;
            }
        }
        for(i=0;i<28;i++)
        System.out.println(state[i]);
    }
}