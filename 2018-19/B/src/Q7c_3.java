public class Q7c_3 {
    public static void main(String[] args) {
        new Thread(() -> {
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
        }).start();

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
