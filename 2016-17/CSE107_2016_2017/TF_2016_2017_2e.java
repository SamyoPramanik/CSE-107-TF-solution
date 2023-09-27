
// you need to import all of these in the exam script as well
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;


// note that the implements comparable for the method one
class Fruits implements Comparable<Fruits>{
    private String name;
    private int quantity;

    // these getters are important without those you can't implement method 2
    public int getQuantity(){
        return quantity;
    }

    public String getName(){
        return name;
    }

    public Fruits(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Fruits fr){
        if(quantity == fr.quantity){
            return name.compareTo(fr.name);
        }
        return fr.quantity - quantity;
    }

    @Override
    public String toString(){
        return name + ", " + quantity;
    }
}

// here is another method but note that it implements comparator
class cmpFruits implements Comparator<Fruits>{
    @Override
    public int compare(Fruits fr1, Fruits fr2){
        if(fr1.getQuantity() == fr2.getQuantity()){
            return fr1.getName().compareTo(fr2.getName());
        }
        return fr2.getQuantity() - fr1.getQuantity();
    }
}



public class TF_2016_2017_2e {
    public static void main(String[] args) {
        
        ArrayList<Fruits> arrLst = new ArrayList<>();
        arrLst.add(new Fruits("Apple", 10));
        arrLst.add(new Fruits("Orange", 13));
        arrLst.add(new Fruits("Banana", 9));
        arrLst.add(new Fruits("Mango", 10));
        arrLst.add(new Fruits("Grape", 5));

        // for testing out the either method
        // you can answer any method you like

        Collections.sort(arrLst);
        // Collections.sort(arrLst,new cmpFruits());

        System.out.println(arrLst);
    }
}
