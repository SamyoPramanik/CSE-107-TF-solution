class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class solve {
    public static void main(String[] args) {
        Animal myAnimal;
        
        myAnimal = new Animal();
        myAnimal.makeSound();
        
        myAnimal = new Dog();
        myAnimal.makeSound();
        
        myAnimal = new Cat();
        myAnimal.makeSound();
    }
}
