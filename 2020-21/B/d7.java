class SharedCounter {
    private int counter;
    SharedCounter()
    {
        this.counter = 0;
    }
    // Corrected Code
    private synchronized void increment()
    {
        this.counter++;
    }
    public int get()
    {
        return this.counter;
    }
    public void count()
    {
        for(int i = 1; i <= 1000; i++)
        {
            increment();
        }
    }
}

class CountingThread implements Runnable
{
    SharedCounter s;
    Thread t;
    CountingThread(SharedCounter s, String name)
    {
        this.s = s;
        t = new Thread(this, name);
        t.start();
    }
    @Override
    public void run()
    {
        s.count();
    }
}

public class d7 {
    public static void main(String[] args) {
        SharedCounter s = new SharedCounter();
        CountingThread t1 = new CountingThread(s, "T1");
        CountingThread t2 = new CountingThread(s, "T2");
        CountingThread t3 = new CountingThread(s, "T3");
        try
        {
            t1.t.join();
            t2.t.join();
            t3.t.join();
        } 
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(s.get());
    }
}
