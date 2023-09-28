class MySingleton
{
    private static MySingleton instance = null;
    private MySingleton(){}
    public static MySingleton getInstance()
    {
        if(instance == null)
        {
            instance = new MySingleton();
        }
        return instance;
    }
}

public class c5 
{
    public static void main(String[] args) {
        MySingleton a = MySingleton.getInstance();
        MySingleton b = MySingleton.getInstance();
        System.out.println(a == b);
    }
}