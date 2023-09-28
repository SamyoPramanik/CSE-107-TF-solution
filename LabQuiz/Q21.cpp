#include <iostream>
using namespace std;

class Base1
{
public:
    Base1() { cout << "Constructing Base1\n"; }
    ~Base1() { cout << "Destructing Base1\n"; }
};

class Base2
{
public:
    Base2() { cout << "Constructing Base2\n"; }
    ~Base2() { cout << "Destructing Base2\n"; }
};

class Derived : public Base1, public Base2
{
public:
    Derived() { cout << "Constructing Derived\n"; }
    ~Derived() { cout << "Destructing Derived\n"; }
};

int main()
{
    Derived ob;
    return 0;
}