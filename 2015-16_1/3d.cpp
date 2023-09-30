#include <iostream>
using namespace std;

class A
{
public:
    void print()
    {
        cout << "print from A" << endl;
    }

    virtual void print2() = 0;
    // {
    //     cout << "print 2 from A" << endl;
    // }
};

class B : public A
{
    void print2()
    {
        cout << "print 2 from B" << endl;
    }
};

int main()
{
    B b;
    A *a = &b;
    a->print2();
    a->print();
}