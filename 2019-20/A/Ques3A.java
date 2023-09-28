class TestClass {
    public void f1() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
    public static void f2() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Ques3A {
    // Sollution:
    public static void main(String[] args) {
        TestClass tc = new TestClass();
        new Thread(tc::f1,"F1Thread").start();
        new Thread(TestClass::f2,"F2Thread").start();
    }
}
