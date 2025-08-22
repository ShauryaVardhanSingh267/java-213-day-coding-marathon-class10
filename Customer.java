import java.util.*;
class Customer
{
    Scanner ob = new Scanner(System.in);
    String cardName;
    long cardNo;
    char cardType;
    double purchaseAmount;
    double cashback;
    Customer()
    {
        cardName = "";
        cardNo=0L;
        cardType = 0;
        purchaseAmount = 0.0;
        cashback = 0.0;
    }
    void input()
    {
        System.out.println("Enter your Name : ");
        cardName = ob.nextLine();
        System.out.println("Enter your Card Number : ");
        cardNo = ob.nextLong();
        System.out.println("Enter your Card Type : ");
        cardType = ob.next().charAt(0);
        System.out.println("Enter the Amount of purchase done on the card : ");
        purchaseAmount = ob.nextDouble();
    }
    void compute()
    {
        if(cardType=='S')
        cashback = (2.0/100.0)*purchaseAmount;
        if(cardType=='G')
        cashback = (5.0/100.0)*purchaseAmount;
        if(cardType=='P')
        cashback = (8.0/100.0)*purchaseAmount;
    }
    void display()
    {
        System.out.println("Card Holder Name : "+cardName);
        System.out.println("Card Number : "+cardNo);
        System.out.println("Card Type : "+cardType);
        System.out.println("Amount of purchase done on the card : "+purchaseAmount);
        System.out.println("Cashback : "+cashback);
    }
    public static void main(String args[])
    {
        Customer obj = new Customer();
        obj.input();
        obj.compute();
        obj.display();
    }
}