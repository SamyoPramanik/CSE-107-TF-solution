//

class X {
    int a = 1;

    void display() {
        Y obY = new Y();
        obY.display();
        Z obZ = new Z();
        obZ.display(this); // we need provide the object ref
    }

    void showNested() {
        // System.out.println(b); 
        // System.out.println(c); 
        // enclosing class can't directly access members of the nested class

        Y obY = new Y();
        Z obZ = new Z();
        System.out.println(obY.getB()); 
        System.out.println(obZ.getC());
    }

    class Y {
        int b = 2;

        public int getB() {
            return b;
        }
        void display() {
            System.out.println(a);
            System.out.println(b);
        }
    }

    static class Z {
        int c = 3;
        
        public int getC() {
            return c;
        }
        void display(X x) { 
            System.out.println(x.a); // Static members can not access the non static members of enclosing class.
            System.out.println(c);
        }
    }
}

public class Ques4B {
    public static void main(String[] args) {
        X obX = new X();
        obX.display();
        obX.showNested();

        // Y obY = new Y (); // cant access nested non-static class like this
        X.Y obY = obX.new Y();
        obY.display();

        // Z obZ = new Z (); // cant access nested static class like this
        X.Z obZ = new X.Z();
        obZ.display(obX);
    }
}
