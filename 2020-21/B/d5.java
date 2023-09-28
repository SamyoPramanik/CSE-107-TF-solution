public class d5 {
    static void f(int ... v){}
    static void f(String msg, boolean ... v){}
    static void f(String msg, int ... v){}
    static void f(int n, int ... v){}
    static void f(double ... v){}

    public static void main(String[] args) {
        f("int", 10, 20, 30);
        f("boolean", true, false, false);
        f();
        //f(1, 2, 3);
    }
}