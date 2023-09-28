// Both interface A and B have a function with same Name, which is ambiguous.

// SOLLUTION 1

// interface A {
//     default void f() {
//         System.out.println("A's f");
//     }
// }

// interface B {
//     default void f() {
//         System.out.println("B's f");
//     }
// }

// class C implements A, B {
//     @Override
//     public void f() // we can override the function f() inside the class
//     {
//         System.out.println("C's f");
//     }
// }

// SOLLUTION 2

interface A {
    default void f() {
        System.out.println("A's f");
    }
}

interface B extends A { // we can just extend interface using A and it will work fine
    default void f() {
        System.out.println("B's f");
    }
}

class C implements B {
    
}

public class Ques1C {
    public static void main(String[] args) {

    }
}
