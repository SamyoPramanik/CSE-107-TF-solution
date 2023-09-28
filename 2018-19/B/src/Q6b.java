interface x1 {
    void m1();

    void m2();
}

interface x2 extends x1 {
    void m3();

    void m4();
}

interface x3 extends x2 {
    void m5();

    void m6();
}

interface x4 extends x3 {
    void m7();

    void m8();
}

class MyClass implements x4 {

    @Override
    public void m5() {
    }

    @Override
    public void m6() {
    }

    @Override
    public void m3() {
    }

    @Override
    public void m4() {
    }

    @Override
    public void m1() {
    }

    @Override
    public void m2() {
    }

    @Override
    public void m7() {
    }

    @Override
    public void m8() {
    }

}

public class Q6b {

}
