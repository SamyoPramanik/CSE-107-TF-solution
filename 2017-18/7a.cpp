#include<iostream>
using namespace std;

class A {
    public:
        virtual void f() {
            cout << "A::f()" << endl;
        }
        void g() {
            cout << "A::g()" << endl;
        }
};

class B : public A {
    public:
        void f() {
            cout << "B::f()" << endl;
        }
        void g() {
            cout << "B::g()" << endl;
        }
};

int main() {
    A *p = new B();
    p->f(); //late binding
    p->g(); //early binding
    return 0;
}



/*
    What is early binding and late binding in C++?
        Early binding:
            Normal functions, overloaded functions, nonvirtual member and friend functions
            Resolved at compile time 
            Very efficient 
            But lacks flexibility
        Late binding:
            Virtual functions accessed via a base class pointer
            Resolved at run time
            Less efficient
            More flexible
*/