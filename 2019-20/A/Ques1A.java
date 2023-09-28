public class Ques1A {
    interface x1 {
        void f1(); // It needs to be implemented

        static void f2() { // a static function of a interface dont need to be implemented
        }

        default void f3() { // a default function can be implemented but the question asked for minimum code so not necessary for successful compilation.
        }
    }

    interface x2 {
        void f4(); // It needs to be implemented

        private void f5() {  // private class in an interface can only be used by other private and default methods, so does not need to be implemented.
        }
    }

    abstract class A implements x1 {
        final void f6() { // final function cant be overridden
        }

        abstract void f7();  // It needs to be overridden
    }

    public class B extends A implements x2 {
        // your code
        public void f1()
        {

        }
        public void f4()
        {

        }
        void f7()
        {

        }
    }
    public static void main(String[] args) throws Exception {
    }
}
