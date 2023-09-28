class NewSumThread implements Runnable
{
    private int start;
    private int end;
    int sum;
    Thread t;
    NewSumThread(int start, int end)
    {
        this.start = start;
        this.end = end;
        sum = 0;
        t = new Thread(this);
        t.start();
    }
    @Override
    public void run()
    {
        for(int i = start; i <= end; i++)
        {
            sum += i;
        }
    }
}

public class c7 {
    public static void main(String[] args) {
        NewSumThread t1 = new NewSumThread(1, 2000);
        NewSumThread t2 = new NewSumThread(2001, 4000);
        NewSumThread t3 = new NewSumThread(4001, 6000);
        NewSumThread t4 = new NewSumThread(6001, 8000);
        NewSumThread t5 = new NewSumThread(8001, 10000);
        try
        {
            t1.t.join();
            t2.t.join();
            t3.t.join();
            t4.t.join();
            t5.t.join();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(t1.sum + t2.sum + t3.sum + t4.sum + t5.sum);
    }
}
