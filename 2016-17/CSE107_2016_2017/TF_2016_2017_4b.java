import java.util.HashMap;

public class TF_2016_2017_4b {
    public static void main(String[] args) {
        // we use hashmap because only it provides us facilities for stroing null as value
        HashMap<String, Double> mp = new HashMap<>();

        mp.put("Lionel Messi", 350000.0);
        mp.put("Cristiano Ronaldo", 365000.0);
        mp.put("Neymar", null);
        mp.put("Lionel Messi", mp.get("Lionel Messi") + 100000);
    }
}
