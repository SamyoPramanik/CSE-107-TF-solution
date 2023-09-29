import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

class Product implements Comparable<Product>
{
    private String name;
    private double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return this.name;
    }
    public double getPrice()
    {
        return this.price;
    }
    public int compareTo(Product p1)
    {
        if(this.price>p1.price)
            return 1;
        else if(this.price< p1.price)
            return -1;
        else return 0;
    }
    @Override
    public String toString()
    {
        return this.name+" "+this.price;
    }
}

public class tf {
    public static void main(String[] args) {
        ArrayList<Product> myProducts=new ArrayList<>();
        Random r=new Random();
        for(char ch='A';ch<='E';ch++)
        {
            String s=String.valueOf(ch);
            myProducts.add(new Product(s,r.nextInt(500)));
        }
        myProducts.add(1,new Product("F", 1000));
        Collections.sort(myProducts);
       for(Product p:myProducts)
       {
        System.out.println(p);
       }
    }
}