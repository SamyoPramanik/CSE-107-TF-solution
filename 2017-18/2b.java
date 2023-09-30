interface Int1{
    void f1();
    void f2();
}

interface Int2 extends Int1 {
    void f3();
}

class Myclass implements Int2{
    public void f1(){
        System.out.println("f1");
    }
    public void f2(){
        System.out.println("f2");
    }
    public void f3(){
        System.out.println("f3");
    }
}

public class solve {
    public static void main(String[] args) {
        Myclass my = new Myclass();
        my.f1();
        my.f2();
        my.f3();
    }
}
