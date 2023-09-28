class P
{
    int x = 1;

    // Corrected Code
    void print()
    {
        System.out.println(x);
    }
    void show()
    {
        System.out.println(x);
    }

    class Q
    {
        int y = 2;

        // Corrected Code
        void print()
        {
            System.out.println(y);
        }
    }

    static class R
    {
        int z = 3;
        void print()
        {
            System.out.println(z);
        }
    }
}

public class d6 {
    public static void main(String[] args) {
        P p = new P();
        p.print();
        p.show();
        // Q q = new Q(); // Error
        P.Q q = p.new Q(); // Corrected Code
        q.print();
        // R r = new R(); // Error
        P.R r = new P.R();
        r.print();
    }
}
