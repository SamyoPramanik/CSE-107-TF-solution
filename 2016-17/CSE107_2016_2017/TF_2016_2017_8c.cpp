// what is wrong with the given code segment?

// the compiler faces ambiguity as it is a case of multiple inheritance and the derived obj d calls to such a 
// function which has two copies. This ambiguity arises as the base class A has one copy through class B and another
// copy through class C which the class D receives. Thus, each method of the base class A has two copies and the compiler doesn't
// know which one to call.


// solved code
#include <iostream>
using namespace std;

class A{
    int x;
    public: 
    void setX(int i){
        x = i;
    }
    void print(){
        cout << x << endl;
    }
};

// note that I have only introduced the virtual keywork in front of base class access specifier
class B :virtual public A{
    public:
    B(){
        setX(10);
    }
};


// note that I have only introduced the virtual keywork in front of base class access specifier
class C:virtual public A{
    public:
    C(){
        setX(20);
    }
};

class D: public B, public C{

};

int main(){
    D obj;
    obj.print();
}

// output should be 20
// as we learned that constructors of base class in case of multiple inheritance are called form left to right
// so the final value of x must be 20

