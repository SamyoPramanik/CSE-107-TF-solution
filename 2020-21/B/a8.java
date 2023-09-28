import java.util.ArrayList;
import java.util.Collections;

class Fruit implements Comparable<Fruit>{
    private String name;
    private int quantity;
    public Fruit(String name, int quantity)
    {
        this.name = name;
        this.quantity = quantity;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    public int getQuantity()
    {
        return quantity;
    }

    @Override
    public String toString()
    {
        return name + " " + quantity;
    }

    @Override
    public int compareTo(Fruit f)
    {
        if(this.quantity == f.quantity)
        {
            return this.name.compareTo(f.name);
        }
        else
        {
            return f.quantity - this.quantity;
        }
    }
}

public class a8 {
    public static void main(String[] args) {
        ArrayList<Fruit> listFruits = new ArrayList<Fruit>();
        listFruits.add(new Fruit("Mango", 4));
        listFruits.add(new Fruit("Orange", 2));
        listFruits.add(new Fruit("Apple", 5));
        listFruits.add(new Fruit("Banana", 1));
        listFruits.add(new Fruit("Apple", 2));
        Collections.sort(listFruits);
        System.out.println(listFruits);
    }
}