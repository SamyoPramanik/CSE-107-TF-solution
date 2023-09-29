import java.util.HashMap;
//COPIED FROM RIFAT SIR's code
class HashMapDemo {
    public static void main(String args[]) {
        HashMap<String, Double> balance = new HashMap<>();
        String str;
        double tempBalance=0;
        balance.put("John Doe", 3434.34);
        balance.put("Tom Smith", 123.22);
        balance.put("Jane Baker", 1378.00);
        balance.put("Tod Hall", 99.22);
        balance.put("Ralph Smith", 19.08);
        String key = "John Doe";
        // Deposit 1,000 into John Doe's account
        tempBalance = balance.get(key);
        balance.put(key, tempBalance + 1000);
    }
}
