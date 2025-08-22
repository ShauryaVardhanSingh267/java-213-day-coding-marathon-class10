import java.util.*;
class linear
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of cars parked it the parking");
        int n = ob.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the plate number of your car");
            a[i]=ob.nextInt();
            System.out.println("Enter the number of the parking slot where your car is Parked");
            b[i]=ob.nextInt();
        }
        System.out.println("Enter the plate number of the car to be searched ");
        int m = ob.nextInt(),flag = 0;
        for(i=0;i<n;i++)
        {
            if(a[i]==m)
            {
                flag++;
                break;
            }
        }
        if(flag==1)
        System.out.println("Your car is Parked at slot no. "+b[i]);
        else
        System.out.println("Car not present");
    }
}