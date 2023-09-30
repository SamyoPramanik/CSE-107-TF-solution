import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class TestClass implements Serializable{
    String s;
    double d;

    public TestClass(String s, double d) {
        this.s = s;
        this.d = d;
    }

    @Override
    public boolean equals(Object o){
        if(o == null) return false;
        if(o == this) return true;
        if(!(o instanceof TestClass)) return false;
        TestClass t = (TestClass) o;
        return t.s.equals(this.s) && t.d == this.d;
    }
}


public class solve {
    public static void main(String[] args) throws Exception{
        TestClass obj1 = new TestClass("Mr. A", 18.5);
        // Your codealse)
        var oos = new ObjectOutputStream(new FileOutputStream("test"));
        oos.writeObject(obj1);
        oos.close();

        TestClass obj2;
        // Your code
        var ois = new ObjectInputStream(new FileInputStream("test"));
        obj2 = (TestClass) ois.readObject();
        ois.close();

        System.out.println(obj1.equals(obj2));  // true
    }
    
}
