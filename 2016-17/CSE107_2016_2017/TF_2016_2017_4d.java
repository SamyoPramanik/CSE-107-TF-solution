import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

// enum already implements a comparable thus only way to make this sortable is by comparator
// you can also simply use a loop in order to find the least number of season
// but I have chosen this approach as it seemed neat to also practice comparator concepts along with it

enum Status{
    Alive, Dead;
}

enum GOT{
    JonSnow("Jon Snow",7, Status.Alive), 
    DaenerysTargeryen("Daenerys Targeryen",7, Status.Alive), 
    NedStark("Ned Stark",1, Status.Dead), 
    JofferyBaratheon("Joffery Baratheon",4, Status.Dead), 
    TyrionLannister("Tyrion Lannister",7, Status.Alive);
    private Status status;
    private int season;
    private String name;

    GOT(){
        status = Status.Dead;
        season = 0;
    }
    GOT(String name, int season, Status status){
        this.name = name;
        this.season = season;
        this.status = status;
    }
    
    
    int getSeason(){
        return season;
    }

    Status getStatus(){
        return status;
    }

    String getName(){
        return name;
    }

    // void setSeason(int season){
    //     this.season = season;
    // }

    // void setStatus(Status status){
    //     this.status = status;
    // }
}

class Cmp implements Comparator<GOT>{
    @Override
    public int compare(GOT char1, GOT char2){
        return char1.getSeason() - char2.getSeason();
    }
}

public class TF_2016_2017_4d {
    public static void main(String [] args){

        
        
        // GOT youKnowNothing = GOT.JonSnow;
        // // jon.setSeason(7);
        // // jon.setStatus(Status.Alive);

        // GOT dragonMom = GOT.DaenerysTargeryen;
        // // dragonMom.setSeason(7);
        // // dragonMom.setStatus(Status.Dead);

        // GOT ned = GOT.NedStark;
        // GOT iLovedItWhenHeDied = GOT.JofferyBaratheon;
        // GOT goat = GOT.TyrionLannister;
        ArrayList<GOT> allChars = new ArrayList<>();
        allChars.add(GOT.JonSnow);
        allChars.add(GOT.DaenerysTargeryen);
        allChars.add(GOT.NedStark);
        allChars.add(GOT.JofferyBaratheon);
        allChars.add(GOT.TyrionLannister);

        // This is another way to do the same stuff

        // int minVal = Integer.MAX_VALUE;
        // GOT cameo = null;

        // for(var character: allChars){
        //     if(character.getSeason() < minVal){
        //         cameo = character;
        //         minVal = character.getSeason();
        //     }
        // }

        // System.out.println(cameo.getName());


        Collections.sort(allChars, new Cmp());
        // System.out.println(allChars.get(0).name());
        System.out.println(allChars.get(0).getName());

        
    }
}
