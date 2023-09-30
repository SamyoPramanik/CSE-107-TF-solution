import java.io.*;

class TestClass implements Serializable{
    String s;
    double d;
    TestClass(String s, double d){
        this.s = s;
        this.d = d;
    }

    @Override
    public String toString(){
        return s + " " + d;
    }
}


public class TF_2017_2018_4c {
    public static void main(String[] args) {
        TestClass ob1 = new TestClass("niceeeee", 12.32);
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./serial"));
            oos.writeObject(ob1);
            oos.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
        TestClass ob2;
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./serial"));
            ob2 = (TestClass) ois.readUnshared();
            System.out.println(ob2);
            ois.close();
        }
        catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        
    }
}
