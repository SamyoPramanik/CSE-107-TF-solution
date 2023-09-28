import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q5c {
    public static int minmax(String op, int... ara) {
        int ans = ara[0];
        if (op.equals("min")) {
            for (int a : ara) {
                if (a < ans)
                    ans = a;
            }

        }

        else if (op.equals("max")) {
            for (int a : ara) {
                if (a > ans)
                    ans = a;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int a = minmax("min", 2, 1, 6, 4, 5); // a = 1
        System.out.println(a);

        int b = minmax("min", 3, 0, 6); // b = 0
        System.out.println(b);

        int c = minmax("max", 1, 2, 6, 5); // c = 6
        System.out.println(c);

        int d = minmax("max", 1, 3, 7); // d = 7
        System.out.println(d);
    }
}
