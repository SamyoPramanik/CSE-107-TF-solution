interface i1
{
    void f1();
    void f2();
}

interface i2
{
    void f3();
    void f4();
}

interface i3 extends i1, i2
{
    void f5();
    void f6();
}

abstract class A implements i3
{
    abstract void f7();
}

class MyClass extends A
{
    public void f1()
    {
        System.out.println("f1()");
    }
    public void f2()
    {
        System.out.println("f2()");
    }
    public void f3()
    {
        System.out.println("f3()");
    }
    public void f4()
    {
        System.out.println("f4()");
    }
    public void f5()
    {
        System.out.println("f5()");
    }
    public void f6()
    {
        System.out.println("f6()");
    }
    public void f7()
    {
        System.out.println("f7()");
    }
}

public class a7 {
    public static void main(String[] args) {
        MyClass m = new MyClass();
        m.f1();
        m.f2();
        m.f3();
        m.f4();
        m.f5();
        m.f6();
        m.f7();
    }
}
