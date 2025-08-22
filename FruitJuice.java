import java.util.*;
class FruitJuice
{
    Scanner ob = new Scanner(System.in);
    int product_code,product_price;String flavour,pack_type,pack_size;
    FruitJuice()
    {
        product_code =0;
        product_price=0;
        flavour = "";
        pack_type = "";
        pack_size = "";
    }
    void input()
    {
        System.out.println("Enter your Product's code");
        product_code = ob.nextInt();
        System.out.println("Enter your Product's price");
        product_price = ob.nextInt();
        System.out.println("Enter the flavour of your juice");
        flavour = ob.nextLine();ob.nextLine();
        System.out.println("Enter the Pack Type of your juice");
        pack_type = ob.nextLine();
        System.out.println("Enter the Pack Size of your juice");
        pack_size = ob.nextLine();
    }
    void discount()
    {
        if(product_price<=100)
        product_price-=10;
        else if(product_price>100&&product_price<=300)
        product_price-=20;
        else if(product_price>300)
        product_price-=30;
    }
    void display()
    {
       System.out.println("Product Code : "+product_code);
       System.out.println("Flavour : "+flavour);
       System.out.println("Pack Type : "+pack_type);
       System.out.println("Pack Size : "+pack_size);
       System.out.println("Product Price : "+product_price);
    }
    public static void main(String args[])
    {
        FruitJuice obj = new FruitJuice();
        obj.input();
        obj.discount();
        obj.display();
    }
}