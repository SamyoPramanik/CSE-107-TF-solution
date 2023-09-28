class Counter implements Runnable {
    Thread t;

    Counter() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            {
                System.out.println("From thread: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}

public class Q7c_2 {
    public static void main(String[] args) {
        Counter c = new Counter();

        for (int i = 0; i < 10000; i++) {
            System.out.println("From main: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
