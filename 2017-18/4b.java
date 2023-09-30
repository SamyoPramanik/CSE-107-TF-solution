import java.util.HashMap;

public class solve {
    public static void main(String[] args) {
        HashMap<String,Integer> hashData = new HashMap<>(); // Since a value in our cllection is null so the appropriate hash collection is HashMap
        hashData.put("Sakib Al Hasan", 300000);
        hashData.put("Mashrafe Bin Mortaza", null);
        hashData.put("Mushfiqur Rahim", 250000);

        hashData.entrySet().forEach(e -> {
            System.out.println(e.getKey() + " : " + e.getValue());
        });


        String key = "Sakib Al Hasan";
        hashData.put(key,hashData.get(key)+50000);

        System.out.println("\nAfter incrementing Sakib's salary by 50000");
        hashData.entrySet().forEach(e -> {
            System.out.println(e.getKey() + " : " + e.getValue());
        });
    }
}



/*
    Write three differences between Hashmap and HashTable.
    Answer:
        1. HashTable is synchronized, HashMap not.
        2. HashTable is thread-safe, HashMap not. 
        3. Hashtable does not allow null keys or values. HashMap allows one null key and any number of null values.
        4. HashTable is comparatively slow.
        5. Superclass of HashTable is Dictionary,
           Superclass of HashMap is AbstractMap.

        // extras given in case you forget some by chance
*/
