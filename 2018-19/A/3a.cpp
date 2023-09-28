#include <iostream>
using namespace std;
class A
{
public:
    A() { cout << "As constructor\n"; }
};

class B : public A
{
public:
    B() { cout << "Bs constructor\n"; }
};
class C : public B
{
public:
    C() { cout << "Cs constructor\n"; }
};
class D
{
public:
    D() { cout << "Ds constructor\n"; }
};
class E : public C, public D
{
public:
    E() { cout << "Es constructor\n"; }
};
class F: public  E
{
public:
    F() { cout << "Fs constructor\n"; }

};
int main()
{
    B b;
    F f;
}
