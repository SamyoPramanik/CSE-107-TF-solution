class SharedClass {
    char c = '\0';

    synchronized void write(char c) throws InterruptedException {
        while (this.c != '\0')
            wait();
        this.c = c;
        System.out.println("Written: " + c);
        notifyAll();

    }

    synchronized void read() throws InterruptedException {
        while (this.c == '\0')
            wait();

        System.out.println("Read: " + c);
        c = '\0';
        notifyAll();
    }
}

public class Q7b_2 {
    private static SharedClass sc;

    public static void main(String[] args) {
        sc = new SharedClass();

        new Thread(() -> {
            try {
                read();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                write();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }).start();

    }

    synchronized static void read() throws InterruptedException {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sc.read();
        }
    }

    synchronized static void write() throws InterruptedException {
        for (char ch = 'a'; ch <= 'z'; ch++)
            sc.write(ch);
    }

}