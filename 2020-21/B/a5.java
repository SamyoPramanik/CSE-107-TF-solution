class A {
    //var x;    // Error: variable x not initialized
    int x; // Corrected Code

    public int getX()
    {
        return x;
    }
    public void setX(int x)
    {
        // x = x;   // Error: Self assignment
        this.x = x; // Corrected Code
    }
}

public class a5 {
    public static void main(String[] args) {
        A[] a = new A[10];
        for(int i = 0; i < a.length; i++)
        {
            a[i] = new A(); // Corrected Code
            a[i].setX(i);
        }
        for(int i = 0; i < a.length; i++)
        {
            System.out.println(a[i].getX());
        }
    }
}