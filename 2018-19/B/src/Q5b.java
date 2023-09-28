public class Q5b {
    static int a = 3, b;
    static int c; // c is made static

    {
        c = 10;
    }

    static {
        b = a * 4;
        c = b;
    }

    static int f2() { // f2 is made static
        return a * b;
    }

    static void f1(int x) {
        System.out.println("x=" + x);
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("c= " + c);
    }

    public static void main(String[] args) {
        f1(42);
        System.out.println("b= " + b);
        System.out.println("Area= " + f2());
    }
}