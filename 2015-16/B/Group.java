import java.io.Serializable;
import java.util.ArrayList;



public class Group implements Serializable{
    String name;
    ArrayList<String>friends;

    Group(){
        friends = new ArrayList<>();
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public ArrayList<String> getFriends(){
        return friends;
    }

}
