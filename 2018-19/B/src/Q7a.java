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
        for (long i = start; i <= end; i++)
            sum += i;
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

public class Q7a {
    public static void main(String[] args) {
        SumThread t1 = new SumThread(1, 1000000);
        SumThread t2 = new SumThread(1000001, 2000000);
        SumThread t3 = new SumThread(2000001, 3000000);
        SumThread t4 = new SumThread(3000001, 4000000);
        SumThread t5 = new SumThread(4000001, 5000000);
        SumThread t6 = new SumThread(5000001, 6000000);
        SumThread t7 = new SumThread(6000001, 7000000);
        SumThread t8 = new SumThread(7000001, 8000000);
        SumThread t9 = new SumThread(8000001, 9000000);
        SumThread t10 = new SumThread(9000001, 10000000);

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        t7.join();
        t8.join();
        t9.join();
        t10.join();

        System.out.println("Total sum = " + (t1.sum + t2.sum + t3.sum + t4.sum + t5.sum + t6.sum + t7.sum + t8.sum
                + t9.sum + t10.sum));
    }
}
