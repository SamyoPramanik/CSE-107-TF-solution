class Animal
{
    private String name;
    private int age;
    public Animal(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}

class Bird extends Animal
{
    public Bird(String name, int age)
    {
        super(name, age);
    }
}

class Mammal extends Animal
{
    public Mammal(String name, int age)
    {
        super(name, age);
    }
}

class Reptile extends Animal
{
    public Reptile(String name, int age)
    {
        super(name, age);
    }
}

class Fish extends Animal
{
    public Fish(String name, int age)
    {
        super(name, age);
    }
}

class Arachnid extends Animal
{
    public Arachnid(String name, int age)
    {
        super(name, age);
    }
}

class Albatross extends Bird
{
    public Albatross(String name, int age)
    {
        super(name, age);
    }
}

class Dog extends Mammal
{
    public Dog(String name, int age)
    {
        super(name, age);
    }
}

class FruitBat extends Mammal
{
    public FruitBat(String name, int age)
    {
        super(name, age);
    }
}

class EasternBrownSnake extends Reptile
{
    public EasternBrownSnake(String name, int age)
    {
        super(name, age);
    }
}

class GreatWhiteSnake extends Fish
{
    public GreatWhiteSnake(String name, int age)
    {
        super(name, age);
    }
}

class RedBackSpider extends Arachnid
{
    public RedBackSpider(String name, int age)
    {
        super(name, age);
    }
}

class Platypus extends Mammal
{
    public Platypus(String name, int age)
    {
        super(name, age);
    }
}

class Human extends Mammal
{
    public Human(String name, int age)
    {
        super(name, age);
    }
}

public class b6 {
    public static void main(String[] args) {
        Bird alex = new Albatross("Alex", 39);
        Mammal spot = new Dog("Spot", 7);
        Mammal fred = new FruitBat("Fred", 10);
        Reptile steph = new EasternBrownSnake("Steph", 12);
        Fish bruce = new GreatWhiteSnake("Bruce", 40);
        Arachnid charlotte = new RedBackSpider("Charlotte", 1);
        Mammal perry = new Platypus("Perry", 5);
        Mammal bob = new Human("Bob", 20);
        Animal[] animals = {alex, spot, fred, steph, bruce, charlotte, perry, bob};
    }
}
