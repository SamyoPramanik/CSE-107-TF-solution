
// you also need to import Objects which might also contain a few marks
import java.util.Objects;

import java.util.HashMap;

class College{
    private int eiin;
    private int shift;
    private int version;
    private int group;

    public College(int eiin, int shift, int version, int group){
        this.eiin = eiin;
        this.shift = shift;
        this.version = version;
        this.group = group;
    }


    // The following are the only codes that you need to write in the exam scripts
    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(!(o instanceof College)){
            return false;
        }
        College clg = (College) o;

        return clg.eiin == eiin && clg.version == version && clg.group == group && clg.shift == shift;
    }

    @Override
    public int hashCode(){
        return Objects.hash(eiin, shift, version, group);
    }
}


public class TF_2016_2017_3a {
    public static void main(String[] args) {
        College c1 = new College(123456, 1, 1, 0);
        College c2 = new College(123456, 1, 1, 0);
        System.out.println(c1.equals(c2));

        HashMap map = new HashMap<>();
        map.put(c1, 100);
        System.out.println(map.get(c2));

    }
}
