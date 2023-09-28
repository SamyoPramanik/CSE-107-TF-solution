interface iStack<T extends Number>
{
    void push(T num);
    T pop();
    boolean isEmpty();
}

class Stack<T extends Number> implements iStack<T>
{
    T[] arr;
    int top;
    Stack(T[] arr)
    {
        this.arr = arr;
        top = 0;
    }
    public void push(T num)
    {
        arr[top] = num;
        ++top;
    }
    public T pop()
    {
        --top;
        return arr[top];
    }
    public boolean isEmpty()
    {
        return (top == 0);
    }
}
 
public class b8
{
    public static void main(String[] args)
    {
        Integer[] arr = new Integer[10];
        Stack<Integer> myStack = new Stack<>(arr);
        myStack.push(1);
        myStack.push(6);
        myStack.push(3);
        System.out.println(myStack.isEmpty());
        while(!myStack.isEmpty())
        {
            System.out.println(myStack.pop());
        }
    }
}