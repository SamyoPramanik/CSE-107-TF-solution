/*
Template class is designed to work with generic types which means any class or function
can deal with any data types without rewriting same class for different datatypes.
*/

// here is 3 examples for template class

#include <iostream>
using namespace std;

template <class T>
class A
{
    T a;

public:
    void setA(T val)
    {
        this->a = val;
    }

    T getA()
    {
        return this->a;
    }

    void show()
    {
        cout << a << endl;
    }
};

template <class T1, class T2>
class B
{
    T1 a;
    T2 b;

public:
    void setAB(T1 x, T2 y)
    {
        this->a = x;
        this->b = y;
    }

    T1 getA()
    {
        return this->a;
    }

    T2 getB()
    {
        return this->b;
    }
    void show()
    {
        cout << a << " " << b << endl;
    }
};

template <class T, int size = 10>
class C
{
    T arr[size];

public:
    void setArray(T *ar)
    {
        for (int i = 0; i < size; i++)
        {
            arr[i] = ar[i];
        }
    }

    void show()
    {
        for (int i = 0; i < size; i++)
        {

            cout << arr[i] << " ";
        }
    }
};

int main(int argc, char const *argv[])
{
    A<char> objA;
    objA.setA('a');
    objA.show();

    B<double, int> objB;
    objB.setAB(4.06, 3);
    objB.show();

    C<int,7> objC;
    int arr[] = {1,2,3,4,5,6,7};
    objC.setArray(arr);
    objC.show();

    return 0;
}
