
#include <iostream>
using namespace std;

class BaseWithoutVirtualDestructor
{   
public:
        BaseWithoutVirtualDestructor(){
            cout << "Base class constructor called" << endl;
        }

        ~BaseWithoutVirtualDestructor(){
            cout << "Base class destructor called" << endl;
        }
};

class BaseWithVirtualDestructor
{
public:
        BaseWithVirtualDestructor(){
            cout << "Base class constructor called" << endl;
        }

        virtual ~BaseWithVirtualDestructor(){
            cout << "Base class destructor called" << endl;
        }
};

class Derived1 : public BaseWithoutVirtualDestructor
{
public:
        Derived1(){
            cout << "Derived class constructor called" << endl;
        }

        ~Derived1(){
            cout << "Derived class destructor called" << endl;
        }
};

class Derived2 : public BaseWithVirtualDestructor
{   
public:
        Derived2(){
            cout << "Derived class constructor called" << endl;
        }

        ~Derived2(){
            cout << "Derived class destructor called" << endl;
        }
};

int main()
{
        BaseWithoutVirtualDestructor *b1 = new Derived1();
        delete b1;
        cout << endl;

        BaseWithVirtualDestructor *b2 = new Derived2();
        delete b2;

        return 0;
}

/*

Output:
        Base class constructor called
        Derived class constructor called
        Base class destructor called

        Base class constructor called
        Derived class constructor called
        Derived class destructor called
        Base class destructor called

*/


/*
    Question:   Can constructor or destructor functions be declared as virtual? Explain briefly.

    Answer:     Constructors cannot be virtual, but destructors can be virtual.

                Constructors cannot be declared as virtual in C++. A constructor is called 
                during object creation, and the construction process is determined by the class type.
                Since virtual functions are determined at runtime based on the object's type (polymorphism),
                it doesn't make sense for constructors to be virtual because the object's type
                is not established until after construction.

                A virtual destructor is used when a class is meant to be used as a base class and is expected to be derived from.
                If a base class pointer points to a derived class object and the destructor of the base class is not virtual,
                only the base class destructor will be called.
                However, if the base class destructor is virtual, the derived class destructor will also be called.
*/