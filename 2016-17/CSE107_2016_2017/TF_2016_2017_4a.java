import java.io.Serializable;
// import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// notice that you have to import and implement Serializable***
class MyClass1 implements Serializable{
    String name;
    int i;

    MyClass1(String name, int i){
        this.name = name;
        this.i = i;
    }
}

public class TF_2016_2017_4a {
    public static void main(String[] args) {
        MyClass1 obj1 = new MyClass1("James Bond", 7);
        try{
            
            FileOutputStream fos = new FileOutputStream("./serial");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj1);
            oos.close();
            fos.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

        

        try{
            MyClass1 obj2;
            FileInputStream fis = new FileInputStream("./serial");
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj2 =(MyClass1) ois.readObject();

            ois.close();
            fis.close();
            System.out.println(obj2.name+ ", " + obj2.i);
        } catch(Exception e){
            e.printStackTrace();
        }
        // obj2 = obj1;
        
    }
}
