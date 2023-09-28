import java.util.LinkedList;

class QueueException extends Exception {
    String msg;

    QueueException(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return "QueueException: " + msg;
    }
}

interface iQueue<T extends Number> {
    void enqueue(T val);

    T dequeue() throws QueueException;

    boolean isEmpty();
}

class Queue<T extends Number> implements iQueue<T> {
    LinkedList<T> list;

    Queue() {
        list = new LinkedList<>();
    }

    public void enqueue(T val) {
        list.addLast(val);
    }

    public T dequeue() throws QueueException {
        if (list.isEmpty())
            throw new QueueException("Queue is Empty");
        return list.pollFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}

public class Q8b {
    public static void main(String[] args) throws QueueException {
        Queue<Integer> qu = new Queue<>();
        qu.enqueue(10);
        qu.enqueue(11);
        qu.enqueue(12);
        qu.enqueue(13);

        while (!qu.isEmpty())
            System.out.println(qu.dequeue());

        qu.dequeue();
    }
}
