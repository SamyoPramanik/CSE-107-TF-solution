interface i1 {
    static void f2() {

    }

    void f3();
}

interface i2 {
    void f4();

    void f5();
}

abstract class c1 implements i1 {
    abstract void f6();

    final void f7() {

    }
}

class c2 extends c1 implements i2 {
    public void f1() {

    }

    public void f3() {
    }

    public void f4() {

    }

    public void f5() {

    }

    void f6() {

    }
}

public class Q6a {

}
