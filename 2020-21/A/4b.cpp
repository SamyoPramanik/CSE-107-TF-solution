#include <iostream>
using namespace std;

template <class T>
class queue
{
    T *arr;
    int front, rear, sz;

public:
    queue()
    {
        arr = new T[100];
        front = rear = -1;
        sz = 0;
    }
    void push(T x)
    {
        if (sz == 100)
        {
            cout << "Queue is full" << endl;
            return;
        }
        if (front == -1)
            front = 0;
        rear = (rear + 1) % 100;
        arr[rear] = x;
        sz++;
    }

    T pop()
    {
        if (sz == 0)
        {
            cout << "Queue is empty" << endl;
            return T();
        }
        T temp = arr[front];
        front = (front + 1) % 100;
        sz--;
        return temp;
    }

    int size()
    {
        return sz;
    }
};

int main()
{
    queue<int> q1;
    queue<double> q2;
    queue<char> q3;

    q1.push(1);
    q1.push(2);
    q1.push(3);

    q2.push(1.1);
    q2.push(2.2);
    q2.push(3.3);

    q3.push('a');
    q3.push('b');
    q3.push('c');

    cout << "q1 poped: " << q1.pop() << endl;
    cout << "q1 size: " << q1.size() << endl;
    cout << "q1 poped: " << q1.pop() << endl;
    cout << "q1 size: " << q1.size() << endl;
    cout << "q1 poped: " << q1.pop() << endl;
    cout << "q1 size: " << q1.size() << endl;
    cout << "q1 poped: " << q1.pop() << endl;

    cout << "q2 poped: " << q2.pop() << endl;
    cout << "q2 size: " << q2.size() << endl;
    cout << "q2 poped: " << q2.pop() << endl;
    cout << "q2 size: " << q2.size() << endl;
    cout << "q2 poped: " << q2.pop() << endl;
    cout << "q2 size: " << q2.size() << endl;
    cout << "q2 poped: " << q2.pop() << endl;

    cout << "q3 poped: " << q3.pop() << endl;
    cout << "q3 size: " << q3.size() << endl;
    cout << "q3 poped: " << q3.pop() << endl;
    cout << "q3 size: " << q3.size() << endl;
    cout << "q3 poped: " << q3.pop() << endl;
    cout << "q3 size: " << q3.size() << endl;
    cout << "q3 poped: " << q3.pop() << endl;
}
