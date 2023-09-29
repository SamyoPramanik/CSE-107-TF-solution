//import java.util.EmptyStackException;
class sharedSum
{
    public static int count=0;
    public static int sum=0;
}
class sumByThreads implements Runnable
{
    Thread t;
    sharedSum sobj;//it is not Sobji(vegetable) btw
    sumByThreads(sharedSum s)
    {
        sobj=s;
        t=new Thread(this,"new Thread");
        t.start();
    }
    synchronized void increment()
    {
        ++sobj.count;
        sobj.sum+=sobj.count;
    }
    public void run()
    {
        for(int i=1;i<=250;i++)
        {
            increment();
        }
    }
}

public class TF {
    public static void main(String[] args) {
        sharedSum s=new sharedSum();
        sumByThreads s1=new sumByThreads(s);
        sumByThreads s2=new sumByThreads(s);
        sumByThreads s3=new sumByThreads(s);
        sumByThreads s4=new sumByThreads(s);
        try
        {
            s1.t.join();
            s2.t.join();
            s3.t.join();
            s4.t.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println(s.sum);
    }
}
