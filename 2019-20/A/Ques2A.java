class MyStats<T extends Number> 
{
    T[] array;

    MyStats(T[] array)
    {
        this.array = array;
    }
    public double average()
    {
        double sum = 0;
        for(var x : array)
        {
            sum+=x.doubleValue();
        }

        return sum/array.length;
    }
    public boolean sameAvg(MyStats<T> s)
    {
        return (this.average() == s.average());
    }
    public boolean sameAvgAny(MyStats<? extends Number> s)
    {
        return (this.average() == s.average());
    }
}

public class Ques2A {
    public static void main(String[] args) {
        Integer[] n1 = { 10, 20, 30, 40, 50 };
        MyStats<Integer> s1 = new MyStats<>(n1);
        System.out.println(s1.average());
        Integer[] n2 = { 50, 20, 40, 10, 30 };
        MyStats<Integer> s2 = new MyStats<>(n2);
        System.out.println(s2.average());
        System.out.println(s1.sameAvg(s2));
        Double[] n3 = { 50.0, 40.0, 30.0, 20.0, 10.0 };
        MyStats<Double> s3 = new MyStats<>(n3);
        System.out.println(s3.average());
        System.out.println(s2.sameAvgAny(s3));
    }
}

// 30.0
// 30.0
// true
// 30.0
// true
