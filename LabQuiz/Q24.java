class A {
    public void f1() {

    }
}

interface B {
    void f2(); // ERROR 1: an interface function cannot have body unless it is default
}

interface C extends B { // ERROR 2: an interface can only extends another interface,and cannot extends a
                        // concrete class
    void f3();
}

interface D { // ERROR 3: an interface can't be final
    void f4();

}

class E extends A {
    @Override
    public void f1() { // ERROR 4: we cannot reduce visibility in derived class while overriding

    }
}

public class Q24 {

}
