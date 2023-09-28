import java.util.ArrayList;

class Product {
    private String name;
    private double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}

public class Q8c {
    public static void main(String[] args) {
        ArrayList<Product> myProducts = new ArrayList<>();

        myProducts.add(new Product("A", Math.random() * 1000));
        myProducts.add(new Product("C", Math.random() * 1000));
        myProducts.add(new Product("D", Math.random() * 1000));
        myProducts.add(new Product("B", Math.random() * 1000));
        myProducts.forEach(p -> System.out.printf("%s: %.2f\n", p.getName(), p.getPrice()));

        // sorted by name
        myProducts.sort((p1, p2) -> {
            return p1.getName().compareTo(p2.getName());
        });
        System.out.println();
        myProducts.forEach(p -> System.out.printf("%s: %.2f\n", p.getName(), p.getPrice()));

        // sorted by price
        myProducts.sort((p1, p2) -> {
            return (int) (p1.getPrice() - p2.getPrice());
        });
        System.out.println();
        myProducts.forEach(p -> System.out.printf("%s: %.2f\n", p.getName(), p.getPrice()));
    }
}
