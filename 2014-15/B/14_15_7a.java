//import java.util.EmptyStackException;
//change file name while using
class MyStack extends Object
{
    final int CAPACITY=10;
    Object[] s;
    int top;
    MyStack()
    {
        s=new Object[CAPACITY];
        top=0;
    }
    void push (Object o) throws StackFullException
    {
        if(top==CAPACITY)
        {
            throw new StackFullException();
        }
        s[top++]=o;
    }
    Object pop() throws StackEmptyException
    {
        if(top==-1)
        {
            throw new StackEmptyException();
        }
        Object ret=s[top];
        --top;
        return ret;
    }
    Object top() throws StackEmptyException
    {
        if(top==-1)
        {
            throw new StackEmptyException();
        }
        return s[top];
    }
    boolean isEmpty()
    {
        return (top==-1) ? true : false;
    }
}
class StackFullException extends Exception
{
    StackFullException()
    {
        //Nothing
    }
    @Override
    public String toString()
    {
        return "Stack is full";
    }
}
class StackEmptyException extends Exception
{
    StackEmptyException()
    {
        //Nothing to do
    }
    @Override
    public String toString()
    {
        return "Stack is empty";
    }
}
public class tf {
    public static void main(String[] args) {
    }
}
