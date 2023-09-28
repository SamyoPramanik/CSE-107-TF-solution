#include <iostream>
using namespace std;

class A
{
public:
    int x;

    A(int value) : x(value)
    {
    }

    A(const A &obj)
    {
        x = obj.x + 1;
    }
};

A updateObject(A obj)
{
    A obj2 = obj;
    return obj2;
}

int main()
{
    A a = A(5);
    A b = updateObject(a);

    cout << a.x << ",";
    cout << b.x << "\n";

    return 0;
}