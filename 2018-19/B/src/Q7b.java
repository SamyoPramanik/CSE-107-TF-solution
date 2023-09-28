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

class Writer implements Runnable {
    SharedClass sc;
    Thread t;

    Writer(SharedClass sc) {
        this.sc = sc;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                sc.write(ch);

            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class Reader implements Runnable {
    SharedClass sc;
    Thread t;

    Reader(SharedClass sc) {
        this.sc = sc;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                sc.read();
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

public class Q7b {
    public static void main(String[] args) {
        SharedClass sc = new SharedClass();
        new Writer(sc);
        new Reader(sc);

    }
}