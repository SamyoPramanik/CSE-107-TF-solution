import java.util.HashMap;
import java.util.Objects;

class Institute {
    private int eiin;
    private int shift;
    private int version;
    private int group;

    public Institute(int eiin, int shift,
            int version, int group) {
        this.eiin = eiin;
        this.shift = shift;
        this.version = version;
        this.group = group;
    }

    public int getEiin() {
        return eiin;
    }

    public int getShift() {
        return shift;
    }

    public int getVersion() {
        return version;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public boolean equals(Object other) {
        if ((other instanceof Institute) == false) {
            return false;
        }
        Institute institute = (Institute) other;
        if (eiin == institute.getEiin() && shift == institute.getShift() && version == institute.getVersion()
                && group == institute.getGroup()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(eiin, shift, version, group);
    }
}

public class Q6c {
    public static void main(String[] args) {
        Institute i1 = new Institute(135790, 1, 1, 0);
        Institute i2 = new Institute(135790, 1, 1, 0);
        System.out.println(i1.equals(i2));
        HashMap<Institute, Integer> map = new HashMap<>();
        map.put(i1, 100);
        System.out.println(map.get(i2));

    }
}
