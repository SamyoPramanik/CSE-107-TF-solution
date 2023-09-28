import java.util.ArrayList;

class SumThread implements Runnable {
    Thread t;
    long start, end, sum;

    public SumThread(long start, long end) {
        t = new Thread(this);
        this.start = start;
        this.end = end;
        this.sum = 0;
        t.start();

    }

    @Override
    public void run() {
        for (long i = start; i <= end; i++) {
            sum += i;
        }

    }

    public void join() {
        try {
            t.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            System.out.println(e);
        }
    }
}

public class Q7a_2 {
    public static void main(String[] args) {
        ArrayList<SumThread> list = new ArrayList<>();

        for (long j = 1; j <= 10000000; j += 1000000) {
            list.add(new SumThread(j, j + 999999));
        }

        list.forEach(e -> e.join());

        long totalSum = 0;
        for (SumThread e : list)
            totalSum += e.sum;

        System.out.println("Total sum: " + totalSum);
    }
}
