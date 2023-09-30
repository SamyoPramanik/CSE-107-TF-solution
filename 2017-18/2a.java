class X{
    void show(){
        System.out.println("Printed from method");
    }
}

// final class X{   
    // final class can't be extended

//     final void show(){
    // final method can't be override

// This can be fixed in two ways - 
// 1. Remove final from class X and final from the class X method show()
// 2. or simply class Y not extedning class X

class Y extends X{
    void show(){
        System.out.println("In subclass method");
    }
}

public class solve {
    public static void main(String[] args) {
        X obj = new X();
        obj.show();
        obj = new Y();
        obj.show();
    }
}


/*
    What is abstract class? Write restrictions imposed on on abstract class.
    Answer : 
        Abstract class is a class that is declared abstract—it may or may not include abstract methods.
        Abstract classes are used to define a common interface for a group of related classes.
        Restrictions:
            Cannot Be Instantiated: Abstract classes cannot be directly instantiated using the new keyword.
            Inheritance Required: Subclasses that extend an abstract class must provide implementations for its abstract methods.     
 */