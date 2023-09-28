/*A default argument is a value that a function or method parameter assumes 
if no argument is provided when the function is called.*/

#include<iostream>
using namespace std;

class A{
    int a,b;

    public:
    A(int x=0, int y=0){
        this->a = x;
        this->b = y;
    }

    A(int x=0){
        this->a =x;
        this->b = 1;
    }
    void show(){
        cout<<a<<" "<<b<<endl;
    }
};

int main(int argc, char const *argv[])
{
    A obj1(2,3);  //unambiguous
    obj1.show();//2 3

    // A obj2(2);  //ambiguity between A(int x=0, int y=0) &  A(int x)
    // obj2.show();
    
    return 0;
}
