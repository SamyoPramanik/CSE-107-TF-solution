
import java.util.HashMap;
import java.util.ArrayList;


class Student{
    static HashMap<Integer, ArrayList<String> > studentMap = new HashMap<>();
    
    void putIntoMap(ArrayList<Integer> ids, ArrayList<ArrayList<String>> lists){
        if(ids.size() != 3 || lists.size() != 3){
            System.out.println("Invalid size");
            return;
        }
        for(int i = 0; i < 3; i++){
            studentMap.put(ids.get(i), lists.get(i));
        }
    }

    void printAll(){
        studentMap.forEach((key, value)->{
            System.out.println("Student Id." + key + "\nStudent Name: " + value.get(0) + " " + value.get(1));
        });
    }


    


}

public class TF_2013_2014_7c {
    
}
