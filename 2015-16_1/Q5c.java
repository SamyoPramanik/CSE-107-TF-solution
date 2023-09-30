interface SomeFunc<T> {
    T func(T t);
}

public class Q5c {
    public static void main(String[] args) {
        SomeFunc<Integer> factorial = (n) -> {
            Integer ans = 1;
            for (int i = 1; i <= n; i++)
                ans *= i;

            return ans;
        };

        System.out.println(factorial.func(10));
    }
}
