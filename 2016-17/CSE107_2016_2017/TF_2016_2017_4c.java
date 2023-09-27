

interface iStack<T>{
    void push(T val);
    T pop();
    boolean isEmpty();
}

class Stack<T> implements iStack<T>{
    int top;
    T values[];

    Stack(T values[]){
        this.values = values;
        top = -1;
    }

    public void push(T val){
        values[++top] = val;
    }

    public T pop(){
        return values[top--];
    }

    public boolean isEmpty(){
        return top == -1;
    }
}

public class TF_2016_2017_4c {
    public static void main(String[] args) {
        // test the code if you want
    }
}
