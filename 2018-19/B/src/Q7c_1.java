class Counter extends Thread {
    Counter() {

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

public class Q7c_1 {
    public static void main(String[] args) {
        Counter c = new Counter();
        c.start();

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
